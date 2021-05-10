package allRoundScoring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose action: ");
        System.out.println("1. Register new competitor: ");
        System.out.println("2. Load old competitor: ");
        System.out.println("3. Show results in excel: ");

        int operator = scan.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Choose event: \n1. Decathlon\n2. Heptathlon");
                int event = scan.nextInt();
                if(event == 1){
                    System.out.println("Choose field event: \n1. 100 m: \n2. Long jump: \n 3.Shot put: \n4. High jump: \n5. 400 m: \n6. 110 m Hurdles: \n7. Discus throw: \n8. Pole vault: \n9. Javelin throw: \n10. 1500 m: ");
                    int field = scan.nextInt();
                    Performance value = new Performance();
                    double perfValue = scan.nextDouble();
                    value.setPerformanceValue(perfValue);
                    double finalValue = value.getPerformanceValue(perfValue);
                    System.out.println("The saved value is " + finalValue);
                }else if(event == 2){
                    System.out.println("Choose field event: \n1. 100 m Hurdles: \n2. High jump: \n 3.Shot put: \n4. 200 m: \n5. Long jump: \n6. Javelin throw: \n7. 800 m: ");
                    int field = scan.nextInt();
                }

                System.out.println("Type your first name: ");

                String name = scan.nextLine();

                Competitor comp = new Competitor();
                comp.setFirstName(name);
                String firstName = comp.getFirstName(name);
                System.out.println("Type your last name: ");

                String name2 = scan.nextLine();
                comp.setLastName(name2);
                String lastName = comp.getLastName(name2);

                System.out.println(firstName + " " + lastName);
                break;

            case 2:

        }






    }


}


