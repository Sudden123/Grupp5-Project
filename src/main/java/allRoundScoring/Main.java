package allRoundScoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose action (type a number and press enter): ");
        System.out.println("1. Register a new competitor");
        System.out.println("2. Load an existing competitor");
        System.out.println("3. Show score in excel");

        int operator = scan.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Choose event: \n1. Decathlon\n2. Heptathlon");
                int event = scan.nextInt();
                scan.nextLine();

                System.out.println("Type competitor's first name: ");
                Competitor comp = new Competitor();
                String name = scan.nextLine();
                comp.setFirstName(name);
                String firstName = comp.getFirstName(name);

                System.out.println("Type competitor's last name: ");
                String name2 = scan.nextLine();
                comp.setLastName(name2);
                String lastName = comp.getLastName(name2);
                System.out.println("Competitor " + firstName + " " + lastName + " has been successfully registered." + "\n");

                if (event == 1) {
                    System.out.println("Choose field event: \n1. 100 m: \n2. Long jump: \n3. Shot put: \n4. High jump: \n5. 400 m: \n6. 110 m Hurdles: \n7. Discus throw: \n8. Pole vault: \n9. Javelin throw: \n10. 1500 m: ");
                    int field = scan.nextInt();

                    System.out.println("Enter a performance value: ");

                    switch(field){
                        case 1:
                            Performance value = new Performance();
                            double perfValue = scan.nextDouble();
                            value.setPerformanceValue(perfValue);
                            //double finalValue = value.getPerformanceValue();
                            System.out.println("The saved value for 100 m is " + perfValue);
                            System.out.println("The score is " +  value.computeScore(field));
                            break;
                    }


                } else if (event == 2) {
                    System.out.println("Choose field event: \n1. 100 m Hurdles: \n2. High jump: \n 3.Shot put: \n4. 200 m: \n5. Long jump: \n6. Javelin throw: \n7. 800 m: ");
                    int field = scan.nextInt();
                }
                break;

            case 2:

        }


    }


}


