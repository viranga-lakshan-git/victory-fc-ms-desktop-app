/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.Achivement;
import Objects.Manager;
import java.sql.ResultSet;

/**
 *
 * @author Laksh
 */
public class ManageManager {
    DatabaseConnection db =new DatabaseConnection();
        
    public void AddManager(Manager manager){
        String sql="INSERT INTO `manager` (`id`, `name`, `dob`, `country`, `quote`, `image`, `matches`, `wins`, `trophies`, `status`) "
                + "VALUES (NULL, '"+manager.name+"', '"+manager.dob+"', '"+manager.country+"', '"+manager.quote+"', '"+manager.image+"', '"+manager.matches+"', '"+manager.wins+"', '"+manager.trophies+"', '1');";
        db.insert(sql);
    }
    
    public void UpdateManager(Manager manager, int managerId){
        String sql="UPDATE `manager` SET `name` = '"+manager.name+"', `dob` = '"+manager.dob+"', `country` = '"+manager.country+"', `quote` = '"+manager.quote+"', `image`='"+manager.image+"', `matches` = '"+manager.matches+"', `wins` = '"+manager.wins+"', `trophies` = '"+manager.trophies+"' WHERE `manager`.`id` ="+managerId;
        db.insert(sql);
    }
    
    public void DeleteManager(int managerId){
        String sql="UPDATE `manager` SET `status = 0 `WHERE `id`="+managerId;
        db.insert(sql);
    }
    
    public ResultSet ViewCurrentManager(){
        String sql="SELECT `name` \"Name\", `dob` \"Date of Birth\", `country` AS \"Country\", `quote` AS \"Quote\", `image` \"Image\", `matches` AS \"Matches\", `wins` AS \"Wins\", `trophies` AS \"Trophies\" FROM `manager` WHERE `status` = 1 AND `id`=(SELECT MAX(id) FROM `manager`)";
        ResultSet rs=db.select(sql);
        return rs;
    }
}
