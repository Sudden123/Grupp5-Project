package allRoundScoring;

public class Competitor {
    private String firstName;
    private String lastName;

    //String[][] namesAndPerformances = new String[40][13];

    private int[] scores;

    //konstruktor :
    /*public Competitor(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;

        scores= new int[10]; //only decathlon
    }*/

    //konstruktor:
    public Competitor() {
        scores= new int[10]; //only decathlon
    }

    public void setScores(int event, int score){
        scores[event]=score;
    }

    //getScores metod som returnerar en int
    public int getScores(int event){
        return scores[event];
    }

    public void setFirstName(String name) {
        firstName = name;

    }

    public void setLastName(String name) {
        lastName = name;
    }

    public String getFirstName(String name) {
        return firstName;
    }

    public String getLastName(String name) {
        return lastName;
        }


    }


