/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epicsoft.expensemanager.controller;



import com.epicsoft.expensemanager.db.DBConnection;
import com.epicsoft.expensemanager.model.ExpenseCategory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SUPUN MADUSHANKA
 */
public class ExpenseCategoryController {


    public List<ExpenseCategory> getAllExpenseItems() throws ClassNotFoundException, SQLException{
        List<ExpenseCategory> expList = new ArrayList<>();
        String sql="select *from Expense_item";
        Connection connection = DBConnection.getInstance().getConnection();
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()) {
              String  category=rst.getString("category");
              ExpenseCategory cat=new ExpenseCategory(category);
              expList.add(cat);
              
            }
        return expList;
    }
    public int addCategory(ExpenseCategory catergory) throws ClassNotFoundException, SQLException{
        
        String sql="insert into Expense_item values('"+catergory.getCatergory()+"')";
        Connection connection = DBConnection.getInstance().getConnection();
        try{
            Statement stm = connection.createStatement();
            int res = stm.executeUpdate(sql);
            if(res>0){
                return  1;
            }
            
        }
        catch(SQLException ex){
            connection.rollback();
            throw ex;
        }
        return -1;
    }
    public int DeleteExpenseCatergory(ExpenseCategory catergory) throws ClassNotFoundException, SQLException{
    
        String sql="DELETE from Expense_item where category='"+catergory.getCatergory()+"'";
        Connection connection = DBConnection.getInstance().getConnection();
        try{
            
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            
        }
        catch(SQLException ex){
            System.out.println("not delete");
        }
        return 0;
    }
    public int EditExpenseCategory(ExpenseCategory catergory,ExpenseCategory updateCategory) throws ClassNotFoundException, SQLException{
        String sql = "update Expense_item set category='"+updateCategory.getCatergory()+"' where category='"+catergory.getCatergory();
        Connection connection = DBConnection.getInstance().getConnection();
        try{
            Statement stm = connection.createStatement();
            int res = stm.executeUpdate(sql);
            if(res>0){
                return  1;
            }
            
        }
        catch(SQLException ex){
            connection.rollback();
            throw ex;
        }
        return -1;
    
    }
    
    

}
