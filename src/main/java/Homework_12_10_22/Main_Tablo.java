package Homework_12_10_22;

import java.util.Scanner;

public class Main_Tablo {
  private static final short CONSTANT = 60;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a hour...");
        int currentHour = scanner.nextInt();

        System.out.println("Please enter minutes");
        int currentMinutes = scanner.nextInt();

        int allSecondsInWorkDay = (17-9)*CONSTANT*CONSTANT;
        System.out.println("All seconds: " + allSecondsInWorkDay);

        int secondsLeft = ((currentHour-9)*CONSTANT + currentMinutes)*CONSTANT;
        System.out.println("Seconds left " + secondsLeft);

        int deltaInSeconds = allSecondsInWorkDay - secondsLeft;

        System.out.println("Delta in seconds: " + deltaInSeconds);
        System.out.println("Delta in Minutes: " + deltaInSeconds/CONSTANT);
        System.out.println("Delta in hours: "  + deltaInSeconds/CONSTANT/CONSTANT);

        scanner.close();
    }
}
// public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//     System.out.println("Please enter a hour...");
//     int currentHour = skanner.nextInt();

//     System.out.println("Please enter minutes");
//     int currentMinutes = skanner.nextInt();


//     int allSecondsInWorkDay = (17-9)*60*60;
//     System.out.println("All seconds: " + allSecondsInWorkDay);


//    int secondsLeft = ((currentHour-9)*60 + currentMinutes)*60;
//     System.out.println("Seconds left " + secondsLeft);

//    int deltaInSeconds = allSecondsInWorkDay - secondsLeft;

//    System.out.println("Delta in seconds: " + deltaInSeconds);
//    System.out.println("Delta in Minutes: " + deltaInSeconds/60);
//     System.out.println("Delta in hours: "  + deltaInSeconds/60/60);
//          scanner.close();
// }
//}


