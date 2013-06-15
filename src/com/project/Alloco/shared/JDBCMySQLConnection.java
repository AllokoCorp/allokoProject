package com.project.Alloco.shared;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCMySQLConnection {
    
    private Connection              connection;

    public JDBCMySQLConnection() {
    	
    	try {
            Class.forName(Constants.DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find the driver in the classpath!", e);
        }
    	
        connection = null;
        try {
            connection = DriverManager.getConnection(Constants.DB_URL, Constants.DB_UNAME, Constants.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Cannot connect the database!", e);
        }
    }
    
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
               
            }
        }
    }

    /**
     * Will update the log section of a given artifact
     * 
     * @param artifactId
     * @param message
     */
    public String ListAllHouses( ){
    	String  returnValue = "";
        try {
            PreparedStatement ps = connection.prepareStatement( Constants.SQL_GET_ALL_HOUSE );
            try {               
                
                ResultSet rs = ps.executeQuery();
                try {
                    while ( rs.next() ) {
                    	//JMPW to treat
                        returnValue +=("##"+ rs.getString( "name" ));
                    }
                } finally {
                    try { rs.close(); } catch (Throwable ignore) {}
                }
            } finally {
               try { ps.close(); } catch (Throwable ignore) {}
            }
        } catch (SQLException e) {            
        }
		return returnValue;
       
    }
}
   
