package Homework_29_10_22;

public class MainEasyFloors {
    public static void main(String[] args) {
        int maxFloors = 163;
        int currentFloors = 0;

        getIterFor(maxFloors, currentFloors);
        getIterWhile(maxFloors, currentFloors);
        getIterDoWhile(maxFloors, currentFloors);
    }
static void getIterFor(int maxFloors, int currentFloors) {
        int count = 0;
        for (int i = currentFloors; i <=maxFloors; i = i + 5-1){
            count++;
    }
    System.out.println("Number of iterations: " + count);
}
    static void getIterWhile (int maxFloors, int currentFloors) {
        int count = 0;
        int i = currentFloors;
        while (i <=maxFloors) {
            count++;
            i = i + 5 - 1;
        }
        System.out.println("Number of iterations: " + count);
    }
    static void getIterDoWhile(int maxFloors, int currentFloors) {
        int count = 0;
        int i = currentFloors;
        if (i <= maxFloors) {
            do {
                count++;
                i = i + 5 - 1;
            } while (i <= maxFloors);
        }
        System.out.println("Number of iterations: " + count);
    }
 }

