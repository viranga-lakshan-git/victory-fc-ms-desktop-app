/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Laksh
 */
public class Gallery {
    public int id;
    public String description;
    public byte[] image;

    public Gallery(String description, byte[] image) {
        this.description = description;
        this.image = image;
    }   
}
