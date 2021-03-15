package com.hexaware.MLP335.model;

import org.junit.Test;
import org.junit.Ignore;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.List;

import com.hexaware.MLP335.model.Customer;

import com.hexaware.MLP335.persistence.CustomerDAO;
import com.hexaware.MLP335.persistence.DbConnection;

public class CustomerTest {
    private static DbConnection db;
    private CustomerDAO customerDAO;

    @BeforeClass
    public static void setup(){
        db = new DbConnection();
    }

    @Ignore
    public void testInsert(){
        customerDAO = db.getConnect().onDemand(CustomerDAO.class);
        int preCount = 0;
        int postCount = 0;

        String CUS_ID= "16";
        String CUS_NAME = "abc";
        String CUS_EMAIL = "abc@GMAIL.COM";
        int CUS_PHN = 91823;
        String CUS_ADD = "Bharat";

        List<Customer>customers = customerDAO.show();

        preCount = customers.size();

        customerDAO.insert(CUS_ID,CUS_NAME,CUS_EMAIL,CUS_PHN,CUS_ADD);

        customers = customerDAO.show();

        postCount = customers.size();

        assertEquals(preCount+1,postCount);
    }

    @Test
    public void testUpdate(){
        customerDAO = db.getConnect().onDemand(CustomerDAO.class);
        
        String CUS_ID= "16";
        String CUS_NAME = "stpm";
        String CUS_EMAIL = "abc@GMAIL.COM";
        int CUS_PHN = 91823;
        String CUS_ADD = "Bharat";

        customerDAO.insert(CUS_ID,CUS_NAME,CUS_EMAIL,CUS_PHN,CUS_ADD);
        

        List<Customer>customers = customerDAO.show();
        boolean isItSame = false;
        for (Customer customer : customers) {
            if(customer.getCUS_ID() == 16){
                if(customer.equals(cus)){
                    isItSame = true;
                    break;
                }
            }
        }
        assertTrue(isItSame);
    }

    @Ignore
    public void testDelete(){
        customerDAO = db.getConnect().onDemand(CustomerDAO.class);
        int preCount = 0;
        int postCount = 0;

        List<Customer>customers = customerDAO.show();

        preCount = customers.size();

        customerDAO.delete(16);

        customers = customerDAO.show();

        postCount = customers.size();

        assertEquals(preCount-1,postCount);
    }

   @AfterClass
    public static void tearDown(){
        DbConnection db = new DbConnection();
    }    
}