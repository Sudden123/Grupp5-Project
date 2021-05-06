package competitor;

import java.util.Scanner;

public class Competitor {

    public String getFirstName(String input) {
        System.out.println("Type your first name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }
}
