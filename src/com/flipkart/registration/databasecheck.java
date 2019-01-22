/*package com.flipkart.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class databasecheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/Flipkart?useSSL=false";
        String user = "Jagatdeep";
        String password = "Semraj@135";		   
        String query = "SELECT * FROM Flipkart.BUYER_INFORMATION;";
        String query1 = "INSERT INTO `Flipkart`.`BUYER_INFORMATION` (`USER_NAME`, `NAME`, `EMAIL`, `PASSWORD`, `DOB`) VALUES ('RAJ1244','RAJ SINGH','raj@gmail.com','raj12','1996-02-12');";
        
        try (Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();){
        		//System.out.println("Hello");
        		st.execute(query1);
        		ResultSet rs = st.executeQuery(query);
        		
        		//System.out.println("Hello1");
                while (rs.next()) {
                	System.out.println(rs);
                }
        }
        catch (SQLException ex) {
            Logger lgr = Logger.getLogger(databasecheck.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        
	}

}*/
