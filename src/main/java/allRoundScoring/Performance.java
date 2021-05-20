package allRoundScoring;

public class Performance {

    private double performanceValue = 0;
    private double value;

    public double setPerformanceValue(double input) {

        performanceValue = input;

        return input;
    }

    public double getPerformanceValue(double input) {

        return performanceValue;
    }

    public int computeScore(int input) {

        int score = 0;
        switch (input) {
            case 1:
                double m100 = Math.pow((18 - performanceValue), 1.81);
                score += (int) (25.4347 * m100);
                break;

            case 2:
                double longJump = Math.pow((performanceValue - 220), 1.4);
                score += (int) (0.14354 * longJump);
                break;
            case 3:
                double shotPut = Math.pow((performanceValue - 1.5), 1.05);
                score += (int) (51.39 * shotPut);
                break;
            case 4:
                double highJump = Math.pow((performanceValue - 75), 1.42);
                score += (int) (0.8465 * highJump);
                break;

            case 5:
                double m400 = Math.pow((82 - performanceValue), 1.81);
                score = (int) (1.53775 * m400);
                break;

            case 6:
                double hurdle = Math.pow((28.5 - performanceValue), 1.92);
                score = (int) (5.74352 * hurdle);
                break;

            case 7:
                double discusThrow = Math.pow((performanceValue - 4), 1.1);
                score = (int) (12.91 * discusThrow);
                break;

            case 8:
                double poleVault = Math.pow((performanceValue - 100), 1.35);
                score = (int) (0.2797 * poleVault);
                break;

            case 9:
                double javelinThrow = Math.pow((performanceValue - 7), 1.08);
                score = (int) (10.14 * javelinThrow);
                break;

            case 10:
                double m1500 = Math.pow((480 - performanceValue), 1.85);
                score = (int) (0.03768 * m1500);
                break;


        }
        return score;
    }

    public int computeScoreHepta(int input) {

        int score = 0;
        switch (input) {
            case 1:
                double hurdles = Math.pow((26.7 - performanceValue), 1.835);
                score += (int) (9.23076 * hurdles);
                break;

            case 2:
                double highJump = Math.pow((performanceValue - 75), 1.348);
                score += (int) (1.84523 * highJump);
                break;

            case 3:
                double shotPut = Math.pow((performanceValue - 1.5), 1.05);
                score += (int) (56.0211 * shotPut);
                break;

            case 4:
                double twoHundredMeters = Math.pow((42.5 - performanceValue), 1.81);
                score += (int) (4.99087 * twoHundredMeters);
                break;

            case 5:
                double longJump = Math.pow((performanceValue - 210), 1.41);
                score += (int) (0.188807 * longJump);
                break;

            case 6:
                double javelinThrow = Math.pow((performanceValue - 3.8), 1.04);
                score += (int) (15.9803 * javelinThrow);
                break;

            case 7:
                double eightHundredMeters = Math.pow((254 - performanceValue), 1.88);
                score += (int) (0.11193 * eightHundredMeters);
                break;

        }
        return score;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getHighJumpDeca() {
        double a = 0.8465;
        int b = 75;
        double c = 1.42;


        int result = (int) (a * Math.pow((value - b), c));


        return result;
    }

    public double getLongJumpDeca() {
        double a = 0.14354;
        int b = 220;
        double c = 1.4;


        int result = (int) (a * Math.pow((value - b), c));


        return result;
    }

    public double get100mHurdle() {
        double a = 9.23076;
        double b = 26.7;
        double c = 1.835;


        int result = (int) (a * Math.pow((b - value), c));


        return result;
    }


    public double getShotDistance() {
        double a = 56.0211;
        double b = 1.5;
        double c = 1.05;


        int result = (int) (a * Math.pow((value - b), c));


        return result;
    }
}
