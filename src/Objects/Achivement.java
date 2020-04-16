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
public class Achivement {
    public int id;
    public int year;
    public String description;
    public String place;

    public Achivement(int year, String description, String place) {
        this.year = year;
        this.description = description;
        this.place = place;
    }
}
