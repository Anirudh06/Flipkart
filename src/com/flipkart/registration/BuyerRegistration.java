package com.flipkart.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuyerRegistration {
	
	private String userName, name, email, password, DOB;
	private int status = 0;
	public int saveBuyerInformation(BuyerBean user)
	{
		try 
		{
			userName = user.getUserName();
			name = user.getName();
			email = user.getEmail();
			password = user.getPassword();
			DOB = user.getDOB();
			
			String url = "jdbc:mysql://127.0.0.1:3306/Flipkart?useSSL=false";
	        String duser = "Jagatdeep";
	        String dpassword = "Semraj@135";
	        
	        Connection con = DriverManager.getConnection(url, duser, dpassword);
	        
	        String query1 = "SELECT * FROM Flipkart.BUYER_INFORMATION WHERE(`USER_NAME`=?) ;";
	        PreparedStatement preparedStmt1 = con.prepareStatement(query1);
	        preparedStmt1.setString(1, userName);
	        
	        
	        String query2 = "SELECT * FROM Flipkart.BUYER_INFORMATION WHERE(`USER_NAME`=?) ;";
	        PreparedStatement preparedStmt2 = con.prepareStatement(query2);
	        preparedStmt2.setString(1, email);
	        
	        if(preparedStmt1.executeQuery().next())
	        	status = 1;
	        else if(preparedStmt2.executeQuery().next())
	        	status = 2;
	        else
	        {
	        	String query3 = "INSERT INTO `Flipkart`.`BUYER_INFORMATION` (`USER_NAME`, `NAME`, `EMAIL`, `PASSWORD`, `DOB`) VALUES (?,?,?,?,?);";   
		        PreparedStatement preparedStmt3 = con.prepareStatement(query3);
		        preparedStmt3.setString(1,userName);
		        preparedStmt3.setString(1,name);
		        preparedStmt3.setString(1,email);
		        preparedStmt3.setString(1,password);
		        preparedStmt3.setString(1,DOB);		        
		        preparedStmt3.executeQuery();
	        }
		}
		catch(Exception e)
		{
			status = 3;
		}
        return status;
	}
	
}
