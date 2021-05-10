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
        }
        return score;
    }

}
