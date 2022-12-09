package Homework_7_12_22;

public class HW_7_12_22 {
    private double pow(double a, int n) {
        if (n == 0) {
            return 1;
        }
        return pow(a, n-1)*a;
    }
}
