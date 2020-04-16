/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.User;
import java.sql.ResultSet;

/**
 *
 * @author Laksh
 */
public class ManageUsers {
    DatabaseConnection db;
    public ManageUsers(){
        DatabaseConnection db =new DatabaseConnection();
        this.db=db;
    }
    
    public void AddUser(User newUser){
        String sql="INSERT INTO `users` (`username`, `user_type`, `pw`, `status`) VALUES ('"+newUser.username+"', '"+newUser.type+"', '"+newUser.pw+"', '1');";
        db.insert(sql);
    }
    
    public void UpdateUser(User newUser, String username){
        String sql="UPDATE `users` SET `username` = '"+newUser.username+"', `user_type` = '"+newUser.type+"', `pw` = '"+newUser.pw+"' WHERE username='"+username+"'";
        db.insert(sql);
    }
    
    public void DeleteUser(String username){
        String sql="UPDATE `users` SET `status`='0' WHERE username='"+username+"'";
        db.insert(sql);
    }
    
    public ResultSet ViewAllUsers(){
        String sql="SELECT `username` AS \"Username\", `user_type` AS \"User Type\" FROM `users` where `status`=1";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewUserByUsername(String username){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `username` AS \"Username\", `user_type` AS \"User Type\", `pw` AS \"Password\" FROM `users` WHERE `username` LIKE '"+username+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewUserByUserType(String userType){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `username` AS \"Username\", `user_type` AS \"User Type\", `pw` AS \"Password\" FROM `users` WHERE `user_type` LIKE '"+userType+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
}
