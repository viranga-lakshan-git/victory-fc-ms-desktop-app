/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    static final String myDriver = "com.mysql.jdbc.Driver";
    static final String myUrl = "jdbc:mysql://localhost:3306/victory_fc?zeroDateTimeBehavior=convertToNull";
    public static void main() {
        try{
            
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            
        }catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Connection ERROR");
            System.out.println(ex.getMessage());
        }
    }

    public void insert(String query){
        try{
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement sttmnt=conn.createStatement();
            sttmnt.executeUpdate(query);
        }catch (ClassNotFoundException | SQLException ex) { 
            System.out.println(ex.getMessage());  
        }
    }
    
    public ResultSet select(String query){
        try{
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement sttmnt=conn.createStatement();
            ResultSet rs=sttmnt.executeQuery(query);
            return rs;        
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
