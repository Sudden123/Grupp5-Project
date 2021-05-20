package allRoundScoring;

import java.util.Hashtable;

public class Competitor {
    private String firstName = "";
    private String lastName = "";
   /* private Hashtable<String, Integer> scores = new Hashtable<String, Integer>();

    public Competitor(){
        scores.put("100m", 0);
    }

    public void setScore(String event, Integer score) {
        scores.put(event, score);
    }

    public int getScore(String event) {
        return scores.get(event);
    }*/

    private static boolean isValidName(String name) {
        return name.matches("(?i)[a-z]([- ',.a-z]{0,23}[a-z])?");
    }

    public void setFirstName(String name) {

        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }


    public String getFirstName(String name) {

        while (true) {
            try {
                if (isValidName(name) == true) {
                    System.out.println("Valid name");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid name");
            }
        }
        return firstName;
    }

    public String getLastName(String name) {
        while (true) {
            if (isValidName(name) == true) {
                System.out.println("Valid name");
            } else {
                System.out.println("Invalid name");
            }
            return lastName;
        }


    }


}

