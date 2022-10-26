package Homework_21_10_22_Cofee;

import java.util.Scanner;

public class Main_Cofee {
    void getCoffee (int button) {

        switch (button){
            case 1 -> System.out.println("Приготовление эспрессо ");
            case 2 -> System.out.println("Приготовление американо - эспрессо  + добавление воды");
            case 3 -> System.out.println("Приготовление капучино -  эспрессо  + добавление вспененного молока");
            case 4 -> System.out.println("Приготовление чая  - пакетик чая + добавление воды");
            default -> System.out.println("Такого вида кофе не существует");
        }
    }

    public static void main(String[] args) {
        System.out.println("Пожалуйста, выберите кнопку: 1 - еспрессо, 2- американо, 3- капучино, 4 - чай");
        Scanner scanner = new Scanner(System.in);

        Main_Cofee getCoffee = new Main_Cofee();
        getCoffee.getCoffee(new Scanner(System.in).nextInt());

        scanner.close();
    }
}

