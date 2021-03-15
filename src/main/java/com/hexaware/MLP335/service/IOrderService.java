package com.hexaware.MLP335.service;
import java.time.LocalDate;
public interface IOrderService
{
    public void insert(int ORD_ID,LocalDate ORD_DATE,int FOOD_ID,int CUS_ID);
}