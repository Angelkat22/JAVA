package Homework_29_10_22;

public class Main_Floors {
    private static int floor;
    static int maxFloors = 163;
    static int floorUp = 5-1;

    private static int FOR () {
        int result = 0;

        for (int floor = 1; floor <170; floor += floorUp){
            if (floor >= maxFloors){
                break;
            }
            result++;
        }
        return result;
        }
    private static int  While(){
        int result = 0;
        int floor = 1;
        while (floor < maxFloors){
            result++;
            floor += floorUp;
        }
        return result;
       }
    private static int DoWhile(){
        int result = 0;
        int floor = 1;
        do {
            result++;
            floor += floorUp;
        } while (floor < maxFloors);
        return result;
        }

    public static void main(String[] args) {
        System.out.println("Result from FOR: " + FOR());
        System.out.println("Result from While: " + While());
        System.out.println("Result from DoWhile: " + DoWhile());
    }
}

