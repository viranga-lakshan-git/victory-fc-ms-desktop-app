/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;
import Database.DatabaseConnection;
import Objects.Fixtures;
import Objects.User;
import java.sql.ResultSet;
/**
 *
 * @author Laksh
 */
public class ManageFixtures {
    DatabaseConnection db =new DatabaseConnection();
        
    public void AddFixtures(Fixtures fix){
        String sql="INSERT INTO `fixtures` (`match_id`, `date`, `time`, `venue`, `team`, `ground`, `next`, `status`) VALUES (NULL, '"+fix.date+"', '"+fix.time+"', '"+fix.venue+"', '"+fix.team+"', '"+fix.ground+"', 0, 1)";
        db.insert(sql);
    }
    
    public void UpdateFixtures(Fixtures fix, int matchId){
        String sql="UPDATE `fixtures` SET `date` = '"+fix.date+"', `time` = '"+fix.time+"', `venue` = '"+fix.venue+"', `team` = '"+fix.team+"', `ground` = '"+fix.ground+"' WHERE `fixtures`.`match_id` ="+matchId;
        db.insert(sql);
    }
    
    public void MakeNextMatch(int matchId){
        String sql="UPDATE `fixtures` SET `next` =1 WHERE `fixtures`.`match_id` ="+matchId;
        String sql2="UPDATE `fixtures` SET `next` =0 WHERE `fixtures`.`match_id` !="+matchId;
        db.insert(sql);
        db.insert(sql2);
    }
    
    public void DeleteFixtures(int match_id){
        String sql="UPDATE `fixtures` SET `status` =0 WHERE `fixtures`.`match_id` ="+match_id;
        db.insert(sql);
    }
    
    public ResultSet ViewFixturesByID(int match_id){
        String sql="SELECT `match_id`,`date`, `time`, `venue`, `team`, `ground` FROM `fixtures` WHERE `status`=1 AND `match_id`="+match_id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewAllFixtures(){
        String sql="SELECT `match_id` AS \"Match ID\", `date` AS \"Date\", `time` AS \"Time\", `venue` AS \"Venue\", `team` AS \"Versus\", `ground` AS \"Ground\" FROM `fixtures` WHERE `status`=1";
        ResultSet rs=db.select(sql);
        return rs;
    }
}
