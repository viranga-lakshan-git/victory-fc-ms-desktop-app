package Objects;

/**
 *
 * @author Laksh
 */
public class Statistics {
    public int id;
    public String name;
    public String dob;
    public int matches;
    public int goals;
    public int assists;
    public String position;
    public float height;
    public float weight;
    public int red;
    public int yellow;

    public Statistics(int id, String name, String dob, String position, float height, float weight, int matches, int goals, int assists, int red, int yellow) {
        this.id=id;
        this.name = name;
        this.dob= dob;
        this.matches = matches;
        this.goals = goals;
        this.assists = assists;
        this.dob = dob;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.red=red;
        this.yellow=yellow;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
