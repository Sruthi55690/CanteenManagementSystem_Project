package com.hexaware.MLP335.model;
import java.util.Objects;

public class Vendor {
    private String VEN_ID;
    private String VEN_NAME;
    private String CUS_ID;

    public Vendor(){

    }

    public Vendor(String VEN_ID){
        this.VEN_ID = VEN_ID;
    }

    public Vendor(String VEN_ID, String VEN_NAME, String CUS_ID){
        this.VEN_ID = VEN_ID;
        this.VEN_NAME = VEN_NAME;
        this.CUS_ID = CUS_ID;
    }

    public String getVEN_ID(){
        return this.VEN_ID;
    }

    public void setVEN_ID(String VEN_ID){
        this.VEN_ID = VEN_ID;
    }

    public String getVEN_NAME(){
        return this.VEN_NAME;
    }

    public void setVEN_NAME(String VEN_NAME){
        this.VEN_NAME = VEN_NAME;
    }

    public String getCUS_ID(){
        return this.CUS_ID;
    }

    public void setCUS_ID(String CUS_ID){
        this.CUS_ID = CUS_ID;
    }

    public String toString(){
        return "\nVEN_ID: " + this.VEN_ID + "\n" +
                "VEN_NAME: " + this.VEN_NAME + "\n" +
                "CUS_ID: " + this.CUS_ID + "\n" +
                "===============================================";
    }
}