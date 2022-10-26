package Homework_24_10_22;

import java.util.Scanner;

public class Main_Sum {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);

        int Value = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= Value; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        scanner.close();
    }
}
