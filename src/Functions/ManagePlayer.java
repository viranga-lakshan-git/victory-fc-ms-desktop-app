/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;
import Database.DatabaseConnection;
import Objects.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ManagePlayer {
    DatabaseConnection db;

    public ManagePlayer() {
        this.db = new DatabaseConnection();
    }
    public void AddPlayer(Player plyr){
        String sql="INSERT INTO `players` (`id`, `username`, `pw`, `name`,`image`, `dob`, `weight`, `height`, `position`, `status`) VALUES (NULL,'"+plyr.username+"', '"+plyr.pw+"', '"+plyr.name+"','"+plyr.image+"', '"+plyr.dob+"', '"+plyr.weight+"', '"+plyr.height+"', '"+plyr.position+"','1')";
        db.insert(sql);
        String sql2="INSERT INTO `users` (`username`, `user_type`, `pw`, `status`) VALUES ('"+plyr.username+"', 'Player', '"+plyr.pw+"','1')";
        db.insert(sql2);
    }
    
    public void UpdatePlayer(Player plyr,int id){
        String sql="UPDATE `players` SET `username`='"+plyr.username+"',`pw`='"+plyr.pw+"',`name`='"+plyr.name+"',`image`='"+plyr.image+"',`dob`='"+plyr.dob+"',`weight`="+plyr.weight+",`height`="+plyr.height+",`position`='"+plyr.position+"' WHERE id="+id;
        db.insert(sql);
    }
    
    public void DeletePlayer(int id){
        String sql="UPDATE `players` SET `status`=0 WHERE id="+id;
        db.insert(sql);
    }
    
    public ResultSet ViewPlayerByID(int player_id){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `id` ="+player_id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewPlayerByName(String player_name){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `name` LIKE '"+player_name+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewPlayerByUsername(String player_username){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `username` LIKE '"+player_username+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewPlayerByIDAndName(int player_id, String player_name){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `id` ="+player_id+" AND `name` LIKE '"+player_name+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewPlayerByIDAndUsername(int player_id, String player_username){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `id` ="+player_id+" AND `username` LIKE '"+player_username+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewPlayerByNameAndUsername(String player_name, String player_username){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1 AND `name` LIKE '"+player_name+" AND `username` LIKE '"+player_username+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    
    
    public ResultSet ViewAllPlayers(){
        String sql="SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE status=1";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ArrayList<Player> BindPlayersTable(){
        ArrayList<Player> list= new ArrayList<>();
        ResultSet rs=db.select("SELECT `id` AS \"ID\", `username` AS \"Username\", `pw` AS \"Password\", `name` AS \"Name\", `image` AS \"Image\", `dob` AS \"Date of Birth\", `weight` AS \"Weight\", `height` AS \"Height\", `position` AS \"Position\" FROM `players` WHERE `status`='1'");
        Player plyr;
        try{
            while(rs.next()){
                plyr=new Player(rs.getString("Username"),rs.getString("Password"),rs.getString("Name"),rs.getBytes("Image"),rs.getString("Date of Birth"),rs.getString("Position"),rs.getFloat("Height"),rs.getFloat("Weight"));
                plyr.id=rs.getInt("ID");
                list.add(plyr);
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
    
}
