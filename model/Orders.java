package com.hexaware.MLP335.model;
import java.util.Objects;

public class Orders {
    private String ORD_ID;
    private int ORD_DATE;
    private String FOOD_ID;
    private String CUS_ID;

    public Orders(){

    }

    public Orders(String ORD_ID){
        this.ORD_ID = ORD_ID;
    }

    public Orders(String ORD_ID, int ORD_DATE, String FOOD_ID, String CUS_ID){
        this.ORD_ID = ORD_ID;
        this.ORD_DATE = ORD_DATE;
        this.FOOD_ID = FOOD_ID;
        this.CUS_ID = CUS_ID;
    }

    public String getORD_ID(){
        return this.ORD_ID;
    }

    public void setORD_ID(String ORD_ID){
        this.ORD_ID = ORD_ID;
    }

    public int getORD_DATE(){
        return this.ORD_DATE;
    }

    public void setORD_DATE(int  ORD_DATE){
        this.ORD_DATE = ORD_DATE;
    }

    public String getFOOD_ID(){
        return this.FOOD_ID;
    }

    public void setFOOD_ID(String FOOD_ID){
        this.FOOD_ID = FOOD_ID;
    }

    public String getCUS_ID(){
        return this.CUS_ID;
    }

    public void setCUS_ID(String CUS_ID){
        this.CUS_ID = CUS_ID;
    }

    /*public String toString(){
        return "\nORD_ID: " + this.ORD_ID + "\n" +
                "ORD_DATE: " + this.ORD_DATE + "\n" +
                "FOOD_ID: " + this.FOOD_ID + "\n" +
                "CUS_ID: " + this.CUS_ID + "\n" +
                "===============================================";
    }*/
}