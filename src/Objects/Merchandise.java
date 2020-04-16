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
public class Merchandise {
    public int itemID;
    public byte[] image;
    public String name;
    public float price;
    public int quantity;

    public Merchandise(byte[] image,float price, String name, int quantity) {
        this.image=image;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }
}
