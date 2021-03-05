package com.hexaware.MLP335.model;
import java.util.Objects;

public class Customer {
    private String CUS_ID;
    private String CUS_NAME;
    private String CUS_EMAIL;
    private int CUS_PHN;
    private String CUS_ADD;

    public Customer(String CUS_ID, String CUS_NAME, String CUS_EMAIL, int CUS_PHN, String CUS_ADD) {
        this.CUS_ID = CUS_ID;
        this.CUS_NAME = CUS_NAME;
        this.CUS_EMAIL = CUS_EMAIL;
        this.CUS_PHN = CUS_PHN;
        this.CUS_ADD = CUS_ADD;
    }

    public Customer() {
    }

    public String getCUS_ID() {
        return CUS_ID;
    }

    public void setCUS_ID(String CUS_ID) {
        this.CUS_ID = CUS_ID;
    }

    public String getCUS_NAME() {
        return CUS_NAME;
    }

    public void setCUS_NAME(String CUS_NAME) {
        this.CUS_NAME = CUS_NAME;
    }

    public String getCUS_EMAIL() {
        return CUS_EMAIL;
    }

    public void setCUS_EMAIL(String CUS_EMAIL) {
        this.CUS_EMAIL = CUS_EMAIL;
    }

    public int getCUS_PHN() {
        return CUS_PHN;
    }

    public void setCUS_PHN(int CUS_PHN) {
        this.CUS_PHN = CUS_PHN;
    }

    public String getCUS_ADD() {
        return CUS_ADD;
    }

    public void setCUS_ADD(String CUS_ADD) {
        this.CUS_ADD = CUS_ADD;
    }
    
}