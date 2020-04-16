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
public class Player {
    public int id;
    public String username;
    public String pw;
    public String name;
    public byte[] image;
    public String dob;
    public String position;
    public float height;
    public float weight;
    

    public Player(String username, String pw, String name, byte[] image, String dob, String position, float height, float weight) {
        this.username = username;
        this.pw = pw;
        this.name = name;
        this.image=image;
        this.dob = dob;
        this.position = position;
        this.height = height;
        this.weight = weight;
    }
    
}
