package com.project.Alloco.shared;


public final class Constants {
    
    // Preventing instantiation
    private Constants() {
    }
      
    
    // MySQL information
    public final static String  DB_URL                      = "jdbc:mysql://127.0.0.1:3306/alloco";
    public final static String  DB_UNAME                    = "root";
    public final static String  DB_PASSWORD                 = "root";
    public final static String  DB_DRIVER                   = "com.mysql.jdbc.Driver";
    
    // MySQL Statements
    public final static String  SQL_GET_ALL_HOUSE           = "SELECT * FROM alloco.house;";
    
    
  
}
