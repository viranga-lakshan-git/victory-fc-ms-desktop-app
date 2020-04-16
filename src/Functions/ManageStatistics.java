/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.Statistics;
import java.sql.ResultSet;
/**
 *
 * @author Laksh
 */
public class ManageStatistics {
    DatabaseConnection db =new DatabaseConnection();
    
    public void AddStatistics(Statistics newStatistics){
        String sql="INSERT INTO `statistics` (`id`, `player_name`, `dob`, `position`, `height`, `weight`, `matches`, `goals`, `assists`, `red_cards`, `yellow_cards`, `status`) VALUES ('"+newStatistics.id+"', '"+newStatistics.name+"', '"+newStatistics.dob+"','"+newStatistics.position+"', '"+newStatistics.height+"', '"+newStatistics.weight+"', '"+newStatistics.matches+"', '"+newStatistics.goals+"', '"+newStatistics.assists+"', '"+newStatistics.red+"', '"+newStatistics.yellow+"','1');";
        db.insert(sql);
    }
    //UPDATE `statistics` SET `id` = 6, `player_name` = 'Viranga', `dob` = 'Oct 1, 1995', `position` = 'Striker', `height` = '5.92', `weight` = '75', `matches` = '125', `goals` = '25', `assists` = '34', `red_cards` = '2', `yellow_cards` = '6', `status` = '1' WHERE `statistics`.`id` = 7 OR `statistics`.`id`=0;
//    INSERT INTO `statistics` (`id`, `player_name`, `dob`, `position`, `height`, `weight`, `matches`, `goals`, `assists`, `red_cards`, `yellow_cards`, `status`) VALUES "
//                + "("+newStatistics.id+", '"+newStatistics.name+"', '"+newStatistics.dob+"','"+newStatistics.position+"', '"+newStatistics.height+"', '"+newStatistics.weight+"', '"+newStatistics.matches+"', '"+newStatistics.goals+"', '"+newStatistics.assists+"', '"+newStatistics.red+"', '"+newStatistics.yellow+"','1');
    public void DeleteStatistic(int id){
        String sql="UPDATE `statistics` SET `status` = '0' WHERE `statistics`.`id` ="+id;
        db.insert(sql);
    }
    
    public void UpdateStatistics(Statistics newStatistics,int id){
        String sql="UPDATE `statistics` SET `player_name` = '"+newStatistics.name+"', `dob` = '"+newStatistics.dob+"', `position` = '"+newStatistics.position+"', `height` = '"+newStatistics.height+"', `weight` = '"+newStatistics.weight+"', `matches` = '"+newStatistics.matches+"', `goals` = '"+newStatistics.goals+"', "
                + "`assists` = '"+newStatistics.assists+"', `red_cards` = '"+newStatistics.red+"', `yellow_cards` = '"+newStatistics.yellow+"' WHERE `statistics`.`id` ="+id;
        db.insert(sql);
    }
    
    public ResultSet ViewAllStatistics(){
        String sql="SELECT `id` AS \"ID\", `player_name` AS \"Player Name\", `dob` AS \"Date of Birth\", `position` AS \"Position\", `height` AS \"Height\", `weight` AS \"Weight\", `matches` AS \"Matches\", `goals` AS \"Goals\", `assists` AS \"Assists\", `red_cards` AS \"Red Cards\", `yellow_cards` AS \"Yellow Cards\" FROM `statistics` WHERE `status`=1";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewStatisticByID(int player_id){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `id` AS \"ID\", `player_name` AS \"Player Name\", `dob` AS \"Date of Birth\", `position` AS \"Position\", `height` AS \"Height\", `weight` AS \"Weight\", `matches` AS \"Matches\", `goals` AS \"Goals\", `assists` AS \"Assists\", `red_cards` AS \"Red Cards\", `yellow_cards` AS \"Yellow Cards\" FROM `statistics` WHERE status=1 AND `id` ="+player_id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewStatisticByName(String player_name){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `id` AS \"ID\", `player_name` AS \"Player Name\", `dob` AS \"Date of Birth\", `position` AS \"Position\", `height` AS \"Height\", `weight` AS \"Weight\", `matches` AS \"Matches\", `goals` AS \"Goals\", `assists` AS \"Assists\", `red_cards` AS \"Red Cards\", `yellow_cards` AS \"Yellow Cards\" FROM `statistics` WHERE status=1 AND `player_name` ='"+player_name+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewStatisticByIDAndName(int player_id, String player_name){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `id` AS \"ID\", `player_name` AS \"Player Name\", `dob` AS \"Date of Birth\", `position` AS \"Position\", `height` AS \"Height\", `weight` AS \"Weight\", `matches` AS \"Matches\", `goals` AS \"Goals\", `assists` AS \"Assists\", `red_cards` AS \"Red Cards\", `yellow_cards` AS \"Yellow Cards\" FROM `statistics` WHERE status=1 AND `id` ="+player_id+" AND `player_name` ='"+player_name+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
}
