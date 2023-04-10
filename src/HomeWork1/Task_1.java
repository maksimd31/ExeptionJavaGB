package HomeWork1;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    //1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null.
    //А теперь реализуйте следующую логику:
    //Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    //Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        fillArray(arr);
        checkArray(arr);
    }


    private static void fillArray(Integer[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    public static Integer[] randomArray() {
        Random rnd = new Random();
        int[] AI = new int[10];
        int min, max;
        Scanner input = new Scanner(System.in);
        System.out.print("min = ");
        min = input.nextInt();

        System.out.print("max = ");
        max = input.nextInt();

        for (int i = 0; i < AI.length; i++)
            AI[i] = min + Math.abs(rnd.nextInt()) % (max - min + 1);

        System.out.println("\nAI:");

        for (int i = 0; i < 10; i++)
            System.out.println(AI[i]);
        return new Integer[0];
    }


    public static void checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("кол-во Null найдено в массиве " + i);

            } else {
                System.out.println("Все нормально");
            }
        }
    }
}
