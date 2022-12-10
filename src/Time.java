public class Time {
    private static int hours;
    private static int min;
    private  static int seconds;

    private static String tempH;
    private static String tempM;
    private static String tempS;


    public Time(int h , int m , int s){
        hours = h;
        min = m;
        seconds = s;



    }
    public String toString() {
        if (hours>=10){
            tempH = "" + hours;

        }
        else {
            tempH = "0" + hours;
        }
        if (min>=10){
            tempM = "" + min;

        }
        else {
            tempM = "0" + min;
        }
        if (seconds>=10){
            tempS = "" + seconds;

        }
        else {
            tempS = "0" + seconds;
        }
         return tempH + ":" + tempM + ":" + tempS;
    }

    public static void tick(){
        seconds = seconds +1;
        if(seconds == 60){
            seconds = 0;
            min = min +1;

        }
        if(min == 60){
            min = 0;
            seconds = 0;
            hours = hours + 1;
        }
        if(hours == 24 ){
            hours = 0;
            min = 0;
            seconds = 0;
        }
    }


}
