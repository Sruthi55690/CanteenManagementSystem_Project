package com.hexaware.MLP335.factory;

import com.hexaware.MLP335.persistence.CustomerDAO;
import com.hexaware.MLP335.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Customer;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  
  public static Customer[] showCustomer() {
    List<Customer> Customer = dao().show();
    return Customer.toArray(new Customer[Customer.size()]);
  }

  public static void insertCustomer(int CUS_ID, String CUS_NAME, String CUS_EMAIL, int CUS_PHN, String CUS_ADD) {
    dao().insert(CUS_ID,CUS_NAME,CUS_EMAIL,CUS_PHN,CUS_ADD);
    System.out.println("Record inserted successfully.");
  }

  public static void updateCustomer(int CUS_ID, String CUS_NAME, String CUS_EMAIL, int CUS_PHN, String CUS_ADD) {
    dao().update(CUS_ID,CUS_NAME,CUS_EMAIL,CUS_PHN,CUS_ADD);
    System.out.println("Record updated successfully.");
  }

    public static void deleteCustomer(int CUS_ID) {
    dao().delete(CUS_ID);
    System.out.println("Record deleted successfully.");
  }
}