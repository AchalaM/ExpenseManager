/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epicsoft.expensemanager.model;

/**
 *
 * @author SUPUN MADUSHANKA
 */
public class Expend {
    private String paymentMethod;
    private String AccountName;
    private String Data; 
    private String Category;
    private double amount;
    private String discription;

    public Expend(String paymentMethod, String AccountName, String Data, String Category, double amount, String discription) {
        this.paymentMethod = paymentMethod;
        this.AccountName = AccountName;
        this.Data = Data;
        this.Category = Category;
        this.amount = amount;
        this.discription = discription;
    }


    /**
     * @return the paymentMothod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the AccountName
     */
    public String getAccountName() {
        return AccountName;
    }

    /**
     * @param AccountName the AccountName to set
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * @return the Data
     */
    public String getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the description
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the description to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
