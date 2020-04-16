/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.Achivement;
import Objects.Fixtures;
import java.sql.ResultSet;

/**
 *
 * @author Laksh
 */
public class ManageAchivements {
    DatabaseConnection db =new DatabaseConnection();
        
    public void AddAchivement(Achivement achive){
        String sql="INSERT INTO `achivements` (`achive_id`, `year`, `description`, `place`, `status`) VALUES (NULL, '"+achive.year+"', '"+achive.description+"', '"+achive.place+"', '1');;";
        db.insert(sql);
    }
    
    public void UpdateAchivement(Achivement achive, int achiveId){
        String sql="UPDATE `achivements` SET `year` = '"+achive.year+"', `description` = '"+achive.description+"', `place` = '"+achive.place+"' WHERE `achivements`.`achive_id` ="+achiveId;
        db.insert(sql);
    }
    
    public void DeleteAchivement(int achiveId){
        String sql="UPDATE `achivements` SET `status` = '0' WHERE `achivements`.`achive_id` ="+achiveId;
        db.insert(sql);
    }
    
    public ResultSet ViewAchivementByID(int id){
        String sql="SELECT `achive_id` AS \"Achivement ID\", `year` AS \"Year\", `description` AS \"Description\", `place` AS \"Place\" FROM `achivements` WHERE `status`=1 AND `achive_id`="+id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewAllAchivement(){
        String sql="SELECT `achive_id` AS \"Achivement ID\", `year` AS \"Year\", `description` AS \"Description\", `place` AS \"Place\" FROM `achivements` WHERE `status`=1 ORDER BY `achivements`.`year` ASC";
        ResultSet rs=db.select(sql);
        return rs;
    }
}
