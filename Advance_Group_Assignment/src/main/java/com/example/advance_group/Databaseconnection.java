package com.example.advance_group;
import java.sql.Connection;
import java.sql.DriverManager;

public class Databaseconnection {
    public Connection databaselink;
    public Connection getconnection(){
        String databaseName="AP_GROUP_PROJECT";
        String databaseUser="root";
        String databasePassword="admin@123";
        String URL="jdbc:mysql://localhost:3306/"+databaseName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaselink=DriverManager.getConnection(URL,databaseUser,databasePassword);
        }catch (Exception e){
            e.printStackTrace();

        }
        return databaselink;
    }


    public void closeConnection() {
        try {
            if (databaselink != null && !databaselink.isClosed()) {
                databaselink.close();
                System.out.println("Database Connection Closed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
