package competitor;

import java.util.Scanner;

public class Competitor {


    public String getFirstname() {
        System.out.println("Enter first name: ");
        Scanner scan = new Scanner(System.in);

        String firstN = scan.nextLine();
        return firstN;
    }
}
