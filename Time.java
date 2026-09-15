public class Time {

public static void main(String[]args) {

int hour = 23;
int minute = 34;
int second = 55;
int sinceMidnight = hour*3600 + minute* 60 + second;
int secondsRemaining = 24*3600 - sinceMidnight;
double percentageElapsed = sinceMidnight * 100.0 / (24*3600);

hour = 23;
minute = 55;
second = 55;
int nSinceMidnight = hour*3600 + minute * 60 + second ; 
int elapsedTime = nSinceMidnight - sinceMidnight;

System.out.println("The number of seconds since midnight is" + " " + sinceMidnight + ".");
System.out.println("The number of seconds remaining is " +  secondsRemaining + ".");
System.out.println("The percentage of the day that has passed is " + percentageElapsed + "%");
System.out.println("The time spent working on this excercise is " + elapsedTime + " seconds" + ".") ;
}
}
