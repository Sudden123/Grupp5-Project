package competitor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type your first name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Competitor comp = new Competitor();
        comp.setFirstName(name);
        String firstName = comp.getFirstName(name);
        System.out.println("Type your last name: ");

        String name2 = scan.nextLine();
        comp.setLastName(name2);
        String lastName = comp.getLastName(name2);

        System.out.println(firstName + " " + lastName);


        System.out.println("Enter performance value for 100 m: ");
        Performance value = new Performance();
        double perfValue = scan.nextDouble();
        value.setPerformanceValue(perfValue);
        double finalValue = value.getPerformanceValue(perfValue);
        System.out.println("The saved value is " + finalValue);


    }


}


