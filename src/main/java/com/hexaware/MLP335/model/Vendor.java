package com.hexaware.MLP335.model;
import java.util.Objects;

public class Vendor {
    private int VEN_ID;
    private String VEN_NAME;
    private int CUS_ID;

    public Vendor(){

    }

    public Vendor(int VEN_ID){
        this.VEN_ID = VEN_ID;
    }

    public Vendor(int VEN_ID, String VEN_NAME, int CUS_ID){
        this.VEN_ID = VEN_ID;
        this.VEN_NAME = VEN_NAME;
        this.CUS_ID = CUS_ID;
    }

    public int getVEN_ID(){
        return this.VEN_ID;
    }

    public void setVEN_ID(int VEN_ID){
        this.VEN_ID = VEN_ID;
    }

    public String getVEN_NAME(){
        return this.VEN_NAME;
    }

    public void setVEN_NAME(String VEN_NAME){
        this.VEN_NAME = VEN_NAME;
    }

    public int getCUS_ID(){
        return this.CUS_ID;
    }

    public void setCUS_ID(int CUS_ID){
        this.CUS_ID = CUS_ID;
    }

    public String toString(){
        return "\nVEN_ID: " + this.VEN_ID + "\n" +
                "VEN_NAME: " + this.VEN_NAME + "\n" +
                "CUS_ID: " + this.CUS_ID + "\n" +
                "===============================================";
    }
}