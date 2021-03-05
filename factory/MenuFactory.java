package com.hexaware.MLP335.factory;

import com.hexaware.MLP335.persistence.MenuDAO;
import com.hexaware.MLP335.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);
  }
  public static void insertMenu(String FOOD_ID, String ITEM_NAME, int FOOD_PRICE) {
    dao().insert(FOOD_ID,ITEM_NAME,FOOD_PRICE);
    System.out.println("Record inserted successfully.");
  }

  public static void updateMenu(String FOOD_ID, String ITEM_NAME, int FOOD_PRICE) {
    dao().update(FOOD_ID,ITEM_NAME,FOOD_PRICE);
    System.out.println("Record updated successfully.");
  }

    public static void deleteMenu(String FOOD_ID) {
    dao().delete(FOOD_ID);
    System.out.println("Record deleted successfully.");
  }
}