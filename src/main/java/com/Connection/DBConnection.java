package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
		private static Connection conn=null;
		
    public DBConnection getconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Task1", "root","password");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
		return getconnection();
    }

  
        }
