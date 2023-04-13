package HomeWork2;

import java.util.Scanner;

public class Task_1 {


    //1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) {
        task_1();


    }

    /**
     * 1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */
    private static float task_1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите значение с плавающей точкой");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Не верный ввод ");
            }
        }

    }


}

