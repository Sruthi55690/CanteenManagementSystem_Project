package com.hexaware.MLP335.service;
import java.time.LocalDate;

import com.hexaware.MLP335.factory.OrdersFactory;
import com.hexaware.MLP335.model.Menu;
import com.hexaware.MLP335.persistence.*;
import java.util.List;

public class OrderServicempl implements IOrderService
{
    private OrdersDAO ordersDAO;
    private MenuDAO menuDAO;
    public OrderServicempl()
    {
        DbConnection db = new DbConnection();
        ordersDAO= db.getConnect().onDemand(OrdersDAO.class);
        menuDAO= db.getConnect().onDemand(MenuDAO.class);
        
        
    }

    public void insert(int ORD_ID,LocalDate ORD_DATE,int FOOD_ID,int CUS_ID)
    {
        List<Menu> menus=menuDAO.showspecific(FOOD_ID);
        Menu menu=menus.get(0);
        float PRICE=menu.getFOOD_PRICE();
        //System.out.println(menu.getFOOD_PRICE());
        if(menu.getFOOD_PRICE()>=200)
        {
            PRICE-=PRICE*0.3f;
        }
        ordersDAO.insert(ORD_ID,ORD_DATE,FOOD_ID,CUS_ID,PRICE);
    }
}