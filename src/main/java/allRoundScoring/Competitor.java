package allRoundScoring;

import java.util.Hashtable;

public class Competitor {
    private String firstName = "";
    private String lastName = "";
    private Hashtable<String, Integer> scores = new Hashtable<String, Integer>();

    public Competitor(){
        scores.put("100m", 0);
    }

    public void setScore(String event, Integer score) {
        scores.put(event, score);
    }

    public int getScore(String event) {
        return scores.get(event);
    }


    public void setFirstName(String name) {

        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getFirstName(String name) {
        return firstName;
    }

    public String getLastName(String name) {
        return lastName;
    }


}

