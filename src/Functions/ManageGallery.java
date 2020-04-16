/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Database.DatabaseConnection;
import Objects.Gallery;
import Objects.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Laksh
 */
public class ManageGallery {
    DatabaseConnection db =new DatabaseConnection();
        
    public void AddGallery(Gallery image){
        String sql="INSERT INTO `gallery` (`id`, `description`, `image`, `status`) VALUES (NULL, '"+image.description+"','"+image.image+"', '1')";
        db.insert(sql);
    }
    
    public void UpdateGallery(Gallery image, int imageId){
        String sql="UPDATE `gallery` SET `description` = '"+image.description+"', `image` = "+image.image+" WHERE `id`="+imageId;
        db.insert(sql);
    }
    
    public void DeleteGallery(int imageId){
        String sql="UPDATE `gallery` SET `status` = '0' WHERE `id`="+imageId;
        db.insert(sql);
    }
    
    public ResultSet ViewAllGallery(){
        String sql="SELECT `id` AS \"Image ID\", `description` AS \"Description\", `image` AS \"Image\" FROM `gallery` WHERE `status`=1";
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ResultSet ViewGalleryByID(int id){
        String sql="SELECT `id` AS \"Image ID\", `description` AS \"Description\", `image` AS \"Image\" FROM `gallery` WHERE `status`=1 AND `id`="+id;
        ResultSet rs=db.select(sql);
        return rs;
    }
    
    public ArrayList<Gallery> BindGalleryTable(){
        ArrayList<Gallery> list= new ArrayList<>();
        ResultSet rs=db.select("SELECT `id`, `description`, `image` FROM `gallery` WHERE `status`=1");
        Gallery gallery;
        try{
            while(rs.next()){
                gallery=new Gallery(rs.getString("description"),rs.getBytes("image"));
                gallery.id=rs.getInt("id");
                list.add(gallery);
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        return list;
    }
}
