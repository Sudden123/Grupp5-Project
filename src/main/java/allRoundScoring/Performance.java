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
                score+= (int) (25.4347*helpScore);
                break;

            case 2:
                double longJump= Math.pow((performanceValue- 220),1.4);
                score+= (int) (0.14354*longJump);
                break;

        }
        return score;
    }

    public int computeScoreHepta(int input){

        int score= 0;
        switch(input){
            case 1:
                double hurdles= Math.pow((26.7- performanceValue),1.835);
                score+= (int) (9.23076 *hurdles);
                break;

            case 2:
                double highJump= Math.pow((performanceValue- 75),1.348);
                score+= (int) (1.84523 *highJump);
                break;

            case 3:
                double shotPut= Math.pow((performanceValue- 1.5),1.05);
                score+= (int) (51.39 *shotPut);
                break;

        }
        return score;
    }

}
