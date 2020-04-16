/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.Merchandise;
import Objects.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ManageMerchandise {
    DatabaseConnection db =new DatabaseConnection();
    
    public void AddMerchandise(Merchandise mrch){
        String sql="INSERT INTO `merchandise` (`item_id`, `item_name`, `item_price`, `quantity`, `status`) VALUES (NULL, '"+mrch.name+"', '"+mrch.price+"', '"+mrch.quantity+"', '1');";
        db.insert(sql);
    }
    
    public void UpdateMerchandise(Merchandise mrch,int id){
        String sql="UPDATE `merchandise` SET `item_name`='"+mrch.name+"',`item_price`="+mrch.price+",`quantity`="+mrch.quantity+" WHERE item_id="+id;
        db.insert(sql);
    }
    
    public void DeleteMerchandise(int merch_id){
        String sql="UPDATE `merchandise` SET `status`='0' WHERE item_id='"+merch_id+"'";
        db.insert(sql);
    }
    
    public ResultSet ViewAllMerchandise(){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT `item_id` AS \"Item Id\", `item_name` AS \"Item Name\", `item_price` \"Price\", `quantity` \"Stock\" FROM `merchandise` WHERE `status` = 1";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewItemByID(int merch_id){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT * FROM `merchandise` WHERE status=1 AND `item_id` ="+merch_id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewItemByName(String item_name){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT * FROM `merchandise` WHERE `status` = 1 AND `item_name` LIKE '"+item_name+"'";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewItemByNameAndID(int merch_id, String item_name){
        DatabaseConnection db=new DatabaseConnection();
        String sql="SELECT * FROM `merchandise` WHERE `status` = 1 AND `item_name` LIKE '"+item_name+"' AND `item_id` ="+merch_id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ArrayList<Merchandise> BindMerchandiseTable(){
        ArrayList<Merchandise> list= new ArrayList<>();
        ResultSet rs=db.select("SELECT `item_id` AS \"Item ID\", `image` AS \"Image\", `item_name` AS \"Item Name\", `item_price` AS \"Price\", `quantity` AS \"Stock\" FROM `merchandise` WHERE `status`=1");
        Merchandise merch;
        try{
            while(rs.next()){
                merch=new Merchandise(rs.getBytes("Image"),rs.getFloat("Price"),rs.getString("Item Name"),rs.getInt("Stock"));
                merch.itemID=rs.getInt("Item ID");
                list.add(merch);
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
}
