package allRoundScoring;

public class Performance {

    private double performanceValue=0;


    public void setPerformanceValue(double input) {

        performanceValue = input;
    }

    public double getPerformanceValue() {

        return performanceValue;
    }

    public int computeScore(int input){

        int score= 0;
        switch(input){
            case 1:
                double helpScore= Math.pow((18- performanceValue),1.81);
                score= (int) (25.4347*helpScore);
                break;

            case 2:

        }
        return score;
    }

    public int computeScoreHepta(int input){

        int score= 0;
        switch(input){
            case 1:
                double hurdles= Math.pow((26.7- performanceValue),1.835);
                score= (int) (9.23076 *hurdles);
                break;

            case 2:
                double highJump= Math.pow((26.7-performanceValue- 75),1.348);
                score= (int) (1.84523 *highJump);
                break;

        }
        return score;
    }

}
