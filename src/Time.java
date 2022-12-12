/**
 * This class takes the input time and is able to add time
 */
public class Time {


    private  int hours;
    private  int min;
    private  int seconds;


    /**
     * The constructor takes in user input for the hour, minute, and second and stores them as instance variables
     * @param h The number of hours
     * @param m The number of minutes
     * @param s The number of seconds
     */
    public Time(int h , int m , int s){
        this.hours = h;
        this.min = m;
        this.seconds = s;




    }

    /**
     * This toString takes the instance variables of the hours, minutes, and seconds and constructs them into one string in military time
     * @return Returns military time
     */
    public String toString() {
         String tempH;
         String tempM;
         String tempS;
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

    /**
     * Adds one second to the time
     */
    public void tick(){
        seconds = seconds +1;
        if(seconds >= 60){
            seconds = 0;
            min = min +1;

        }
        if(min >= 60){
            min = 0;
            seconds = 0;
            hours = hours + 1;
        }
        if(hours >= 24 ){
            hours = 0;
            min = 0;
            seconds = 0;
        }
    }


    /**
     * This method adds to objects together using their time
     * @param time This is the object that is being added to the Object that will be changed
     */
    public void add(Time time){
        int newHours = hours + time.hours;
        int newMin = min + time.min;
        int newSeconds = seconds + time.seconds;

        while(newHours >= 24 || newMin >= 60 || newSeconds >= 60){
            if(newSeconds >= 60){
                newSeconds = newSeconds - 60;
                newMin = newMin + 1;
            }
            if(newMin >= 60){
                newMin = newMin - 60;
                newHours = newHours + 1;
            }
            if(newHours >= 24){
                newHours = newHours - 24;

            }
        }
        hours = newHours;
        min = newMin;
        seconds = newSeconds;

    }


}
