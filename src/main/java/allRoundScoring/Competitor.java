package allRoundScoring;

public class Competitor {
    private String firstName;
    private String lastName;

    //String[][] namesAndPerformances = new String[40][13];

    private int[] scores;

    //constructor - unfortunately did not work with StepDefinitions automated tests
    /*public Competitor(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        scores= new int[10]; //only decathlon
    }*/

    //TIPS FRÅN STAFFAN: skapa objekt i klassen Competitor till varje athlete, och varje athlete kommer ha en array med sina score

    //constructor:
    public Competitor() {
        scores= new int[10]; //only decathlon for now
    }

    public void setScore(int event, int score){
        scores[event]=score;
    }


    public int getScore(int event){
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


