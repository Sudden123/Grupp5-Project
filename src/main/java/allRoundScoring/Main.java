package allRoundScoring;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ExcelTest test = new ExcelTest();
        test.createExel();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose action (type a number and press enter): ");
        System.out.println("1. Register a new competitor");
        System.out.println("2. Load an existing competitor");
        System.out.println("3. Show score in excel");

        int operator = scan.nextInt();


        switch (operator) {
            case 1:
                System.out.println("Choose event: \n1. Decathlon (males)\n2. Heptathlon (females)");
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

                    Performance value = new Performance();
                    switch (field) {
                        case 1:
                            System.out.println("Enter a performance value in seconds: ");
                            double perfValue = scan.nextDouble();
                            value.setPerformanceValue(perfValue);
                            //double finalValue = value.getPerformanceValue();
                            System.out.println("The saved value for 100 m is " + perfValue + "s");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 2:
                            System.out.println("Enter a performance value in meters: ");
                            double longJump = scan.nextDouble();
                            value.setPerformanceValue(longJump);
                            System.out.println("The saved value for long jump is " + longJump + " m");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 3:
                            System.out.println("Enter a performance value in meters: ");
                            double shotPut = scan.nextDouble();
                            value.setPerformanceValue(shotPut);
                            System.out.println("The saved value for Shot put is " + shotPut + "m");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 4:
                            System.out.println("Enter a performance value in centimeters: ");
                            double highJumpValue = scan.nextDouble();
                            value.setPerformanceValue(highJumpValue);
                            System.out.println("The saved value for High jump is " + highJumpValue + "cm");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 5:
                            System.out.println("Enter a performance value in seconds");
                            double sprintValue = scan.nextDouble();
                            value.setPerformanceValue(sprintValue);
                            System.out.println("The saved value for 400m is " + sprintValue + "s");
                            System.out.println("The Score is" + value.computeScore(field));
                            break;

                        case 6:
                            System.out.println("Enter a performance value in seconds");
                            double hurdlValue = scan.nextDouble();
                            value.setPerformanceValue(hurdlValue);
                            System.out.println("The saved value for 110m hurdles is " + hurdlValue + "s");
                            System.out.println("The score is" + value.computeScore(field));
                            break;

                        case 7:
                            System.out.println("Enter a performance value in m: ");
                            double discusValue = scan.nextDouble();
                            value.setPerformanceValue(discusValue);
                            System.out.println("The saved value for discus throw is " + discusValue + "m");
                            System.out.println("The score is" + value.computeScore(field));
                            break;

                        case 8:
                            System.out.println("Enter a performance value in centimeters: ");
                            double poleVault = scan.nextDouble();
                            value.setPerformanceValue(poleVault);
                            System.out.println("The saved value for pole vault is " + poleVault + " cm");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 9:
                            System.out.println("Enter a performance value in meters: ");
                            double javelinThrow = scan.nextDouble();
                            value.setPerformanceValue(javelinThrow);
                            System.out.println("The saved value for javelin throw is " + javelinThrow + " m");
                            System.out.println("The score is " + value.computeScore(field));
                            break;

                        case 10:
                            scan.nextLine();
                            System.out.println("Enter a performance value in format minutes:seconds : ");
                            String minAndSec = scan.nextLine();
                            String[] splitIt = minAndSec.split(":");
                            double minutesToSeconds = (Double.parseDouble(splitIt[0])) * 60;
                            double seconds = Double.parseDouble(splitIt[1]);
                            double m1500 = minutesToSeconds + seconds;
                            value.setPerformanceValue(m1500);
                            System.out.println("The saved value for 1500 m is " + minAndSec);
                            System.out.println("The score is " + value.computeScore(field));
                            break;
                    }

                } else if (event == 2) {
                    System.out.println("Choose field event: \n1. 100 m Hurdles: \n2. High jump: \n3. Shot put: \n4. 200 m: \n5. Long jump: \n6. Javelin throw: \n7. 800 m: ");
                    int field = scan.nextInt();

                    Performance value = new Performance();
                    switch (field) {
                        case 1:
                            System.out.println("Enter a performance value in seconds: ");
                            double hurdlesValue = scan.nextDouble();
                            value.setPerformanceValue(hurdlesValue);
                            System.out.println("The saved value for 100 m hurdles is " + hurdlesValue + "s");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 2:
                            System.out.println("Enter a performance value in centimeters: ");
                            double highJumpValue = scan.nextDouble();
                            value.setPerformanceValue(highJumpValue);
                            System.out.println("The saved value for High jump is " + highJumpValue + "cm");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 3:
                            System.out.println("Enter a performance value in meters: ");
                            double shotPut = scan.nextDouble();
                            value.setPerformanceValue(shotPut);
                            System.out.println("The saved value for Shot put is " + shotPut + "m");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 4:
                            System.out.println("Enter a performance value in seconds: ");
                            double twoHundredMeters = scan.nextDouble();
                            value.setPerformanceValue(twoHundredMeters);
                            System.out.println("The saved value for 200 m sprint is " + twoHundredMeters + "s");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 5:
                            System.out.println("Enter a performance value in centimeters: ");
                            double longJump = scan.nextDouble();
                            value.setPerformanceValue(longJump);
                            System.out.println("The saved value for Long jump is " + longJump + "cm");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 6:
                            System.out.println("Enter a performance value in meters: ");
                            double javelinThrow = scan.nextDouble();
                            value.setPerformanceValue(javelinThrow);
                            System.out.println("The saved value for Javelin throw is " + javelinThrow + "m");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;

                        case 7:
                            System.out.println("Enter a performance value in seconds: ");
                            double eightHundredMeters = scan.nextDouble();
                            value.setPerformanceValue(eightHundredMeters);
                            System.out.println("The saved value for 800 m sprint is " + eightHundredMeters + "s");
                            System.out.println("The score is " + value.computeScoreHepta(field));
                            break;
                    }
                }
                break;

            case 3:
                OpenExcel score = new OpenExcel();
                   score.showScore();
                   break;

        }


    }


}


