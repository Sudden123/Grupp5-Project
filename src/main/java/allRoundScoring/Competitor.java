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

    private static boolean isValidName(String name){
        return name.matches("[a-zA-Z]{0,24}+");
    }

    public void setFirstName(String name) {

        firstName = name;
    }

    public void setLastName(String name){
        lastName = name;
    }

    public String getFirstName(String name) {
        if (isValidName(name)==true){
            System.out.println("Valid name");
        }else {
            System.out.println("Invalid name");
        }
        return firstName;
    }

    public String getLastName(String name) {
        if (isValidName(name)==true){
            System.out.println("Valid name");
        }else {
            System.out.println("Invalid name");
        }
        return lastName;
    }


}

