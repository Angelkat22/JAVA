package Homeworks_10_10_22;

import java.util.Scanner;

public class Main_Convert {

        public static void main(String[] args) {

            System.out.println("Enter Euro:");
            Scanner scanner1 = new Scanner(System.in);
            double eurValue = scanner1.nextDouble();

            System.out.println("Euro value " + eurValue + " is " + convertToUsd(eurValue) + "$");
            scanner1.close();
        }
        static double convertToUsd(double eur){
            double usd = eur * 0.95;
            return usd;

            }
    }

