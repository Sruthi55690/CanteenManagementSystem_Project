package com.hexaware.MLP335.factory;

import com.hexaware.MLP335.persistence.VendorDAO;
import com.hexaware.MLP335.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP335.model.Vendor;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }

  
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Vendor[] showVendor() {
    List<Vendor> Vendors = dao().show();
    return Vendors.toArray(new Vendor[Vendors.size()]);
  }

  public static void insertVendor(String VEN_ID, String VEN_NAME, String CUS_ID) {
    dao().insert(VEN_ID,VEN_NAME,CUS_ID);
    System.out.println("Record inserted successfully.");
  }

  public static void updateVendor(String VEN_ID, String VEN_NAME, String CUS_ID) {
    dao().update(VEN_ID,VEN_NAME,CUS_ID);
    System.out.println("Record updated successfully.");
  }

    public static void deleteVendor(String VEN_ID) {
    dao().delete(VEN_ID);
    System.out.println("Record deleted successfully.");
  }
}