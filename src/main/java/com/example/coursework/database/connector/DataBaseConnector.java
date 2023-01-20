package com.example.coursework.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnector {

  public static Connection databaseLink;
  public static Connection getConnection() {
    String databaseName = "coursework";
    String databasePassword = "m086413o";
    String databaseUser = "root";
    String url = "jdbc:mysql://localhost/" + databaseName;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
    }catch (Exception e){
      e.printStackTrace();
    }
    return databaseLink;
  }


}

