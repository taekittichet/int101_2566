package work03;

public class MyUtill {
    public static double calculateBMI(double weight , double height){
        double bmi = weight / (height*height);
        return bmi;
    }

    public static double average(int v1 , int v2 , int v3){
        return (double) (v1 + v2 + v3) / 3.0 ;

    }

}
