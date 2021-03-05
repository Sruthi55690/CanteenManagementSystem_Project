package com.hexaware.MLP335.util;
import java.util.Scanner;
import com.hexaware.MLP335.factory.*;

import com.hexaware.MLP335.model.*;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Show Customers");
    System.out.println("3. Show Orders");
    System.out.println("4. Show Vendors");
    System.out.println("5. Insert in Menu");
    System.out.println("6. Delete in Menu");
    System.out.println("7. Update in Menu");
    System.out.println("8. Exit");

    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          showFullCustomers();
          break;
        case 3:
          showFullOrders();
          break;
        case 4:
          showFullVendors();
          break;
        case 5:
          insert_in_menutable();
          break;
        case 6:
          delete_in_menutable();
          break;
        case 7:
          update_in_menutable();
          break;
        case 8:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose an option");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("FOOD_ID, ITEM_NAME, FOOD_PRICE");
    for (Menu m : menu) {
      System.out.print(m.getFOOD_ID()+" ");
      System.out.print(m.getITEM_NAME()+" ");
      System.out.print(m.getFOOD_PRICE()+" ");
      System.out.println();
    }
  }
  private void showFullCustomers() {
    Customer[] customer = CustomerFactory.showCustomer();
    System.out.println("CUS_ID,CUS_NAME,CUS_EMAIL,CUS_PHN,CUS_ADD");
    for (Customer c : customer) {
      System.out.print(c.getCUS_ID()+" ");
      System.out.print(c.getCUS_NAME()+" ");
      System.out.print(c.getCUS_EMAIL()+" ");
      System.out.print(c.getCUS_PHN()+" ");
      System.out.print(c.getCUS_ADD()+" ");
      System.out.println();
    }
  }
  private void showFullOrders() {
    Orders[] orders = OrdersFactory.showOrders();
    System.out.println("ORD_ID,ORD_DATE,FOOD_ID,CUS_ID");
    for (Orders o : orders) {
      System.out.print(o.getORD_ID()+" ");
      System.out.print(o.getORD_DATE()+" ");
      System.out.print(o.getFOOD_ID()+" ");
      System.out.print(o.getCUS_ID()+" ");
      System.out.println();
    }
  }
  private void showFullVendors() {
    Vendor[] vendor = VendorFactory.showVendor();
    System.out.println("VEN_ID,VEN_NAME,CUS_ID");
    for (Vendor v : vendor) {
      System.out.print(v.getVEN_ID()+" ");
      System.out.print(v.getVEN_NAME()+" ");
      System.out.print(v.getCUS_ID()+" ");
      System.out.println();
    }
  }

/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
  private void insert_in_menutable(){
      System.out.print("Enter Food_ID: ");
      String FOOD_ID = option.next();
  
      System.out.print("Enter Item_Name: ");
      String ITEM_NAME = option.next();
  
      System.out.print("Enter Food_Price: ");
      int FOOD_PRICE = option.nextInt();
    
      MenuFactory.insertMenu(FOOD_ID,ITEM_NAME,FOOD_PRICE);
  }
  private void delete_in_menutable(){
    System.out.println("Enter Food ID: ");
    String FOOD_ID = option.next();
    MenuFactory.deleteMenu(FOOD_ID);
  }
  private void update_in_menutable(){
    System.out.println("Enter Food ID: ");
    String FOOD_ID = option.next();

    System.out.println("Enter Item Name: ");
    String ITEM_NAME = option.next();

    System.out.println("Enter Food Price: ");
    int FOOD_PRICE = option.nextInt();

    MenuFactory.updateMenu(FOOD_ID,ITEM_NAME,FOOD_PRICE);
  }
}