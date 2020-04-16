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
public class Manager {
    public int id;
    public String name;
    public String dob;
    public String country;
    public String quote;
    public byte[] image;
    public int matches;
    public int wins;
    public int trophies;
    
    public Manager(String name, String dob, String country, String quote, byte[] image, int matches, int wins, int trophies){
        this.name=name;
        this.dob=dob;
        this.country=country;
        this.quote=quote;
        this.image=image;
        this.matches=matches;
        this.wins=wins;
        this.trophies=trophies;
    }
    
}
