package allRoundScoring;

public class Competitor {
    private String firstName = "";
    private String lastName = "";

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

        return firstName;
    }

    public String getLastName(String name) {

            return lastName;
        }


    }




