package com.hexaware.MLP335.factory;

import com.hexaware.MLP335.persistence.OrdersDAO;
import com.hexaware.MLP335.persistence.MenuDAO;
import com.hexaware.MLP335.persistence.DbConnection;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;

import com.hexaware.MLP335.model.Orders;
import com.hexaware.MLP335.model.Menu;
import com.hexaware.MLP335.service.*;


/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class OrdersFactory implements IOrdersService{
  private OrdersDAO ordersDAO;
    private MenuDAO menuDAO;
  /**
   *  Protected constructor.
   */
  public OrdersFactory() {
    DbConnection db = new DbConnection();
    ordersDAO= db.getConnect().onDemand(OrdersDAO.class);
    menuDAO= db.getConnect().onDemand(MenuDAO.class);
    

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static OrdersDAO dao() {
    DbConnection db = new DbConnection();
    //return db.getConnect().onDemand(OrdersDAO.class);
    //ordersDAO= db.getConnect().onDemand(OrdersDAO.class);
    .//menuDAO= db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Orders[] showOrders() {
    List<Orders> Orders = dao().show();
    return Orders.toArray(new Orders[Orders.size()]);
  }

  public static void insertOrders(int ORD_ID, LocalDate ORD_DATE,int FOOD_ID, int CUS_ID) {
    List<Menu> menus=menuDAO.showspecific(FOOD_ID);
    Menu menu=menus.get(0);
    float PRICE=menu.getFOOD_PRICE();
    if(ORD_DATE.getDayOfMonth()==3){
    if(menu.getFOOD_PRICE()>=200)
    {
        PRICE-=PRICE*0.2f;
    }
    dao().insert(ORD_ID,ORD_DATE,FOOD_ID,CUS_ID,PRICE);
    //System.out.println("Record inserted successfully.");
  }

  public static void updateOrders(int ORD_ID, LocalDate ORD_DATE, int FOOD_ID, int CUS_ID,float PRICE) {
    dao().update(ORD_ID,ORD_DATE,FOOD_ID,CUS_ID,PRICE);
    System.out.println("Record updated successfully.");
  }

    public static void deleteOrders(int ORD_ID) {
    dao().delete(ORD_ID);
    System.out.println("Record deleted successfully.");
  }
}