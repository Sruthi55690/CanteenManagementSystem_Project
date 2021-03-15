package com.hexaware.MLP335.model;
import java.util.Objects;
import java.time.LocalDate;

public class Orders {
    private int ORD_ID;
    private LocalDate ORD_DATE;
    private int FOOD_ID;
    private int  CUS_ID;
    private float PRICE;

    public Orders(){

    }

    public Orders(int ORD_ID){
        this.ORD_ID = ORD_ID;
    }

    public Orders(int ORD_ID, LocalDate ORD_DATE, int FOOD_ID, int CUS_ID,float PRICE){
        this.ORD_ID = ORD_ID;
        this.ORD_DATE = ORD_DATE;
        this.FOOD_ID = FOOD_ID;
        this.CUS_ID = CUS_ID;
        this.PRICE=PRICE;
    }

    public int getORD_ID(){
        return this.ORD_ID;
    }

    public void setORD_ID(int ORD_ID){
        this.ORD_ID = ORD_ID;
    }

    public LocalDate getORD_DATE(){
        return this.ORD_DATE;
    }

    public void setORD_DATE(LocalDate  ORD_DATE){
        this.ORD_DATE = ORD_DATE;
    }

    public int getFOOD_ID(){
        return this.FOOD_ID;
    }

    public void setFOOD_ID(int FOOD_ID){
        this.FOOD_ID = FOOD_ID;
    }

    public int getCUS_ID(){
        return this.CUS_ID;
    }

    public void setCUS_ID(int CUS_ID){
        this.CUS_ID = CUS_ID;
    }
    public float getPRICE(){
        return this.CUS_ID;
    }

    public void setPRICE(float PRICE){
        this.PRICE = PRICE;
    }

    /*public String toString(){
        return "\nORD_ID: " + this.ORD_ID + "\n" +
                "ORD_DATE: " + this.ORD_DATE + "\n" +
                "FOOD_ID: " + this.FOOD_ID + "\n" +
                "CUS_ID: " + this.CUS_ID + "\n" +
                "===============================================";
    }*/
}