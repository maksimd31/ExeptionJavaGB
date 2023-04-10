package HomeWork1;

import java.util.Random;

public class Task_3 {
//     3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
//     Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
//     детализировать какие строки со столбцами не требуется.

    public static void main(String[] args) {
        randomArray();
        printArray(randomArray());
        isSquareMatrix(randomArray());

    }

    private static int[][] randomArray() {
        Random rnd = new Random();
        int[][] matrix = new int[5][5];
//        int matrix[][] = {{1, 1, 1}, {1, 0, 0}, {1, 0, 0}};

        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = new int[rnd.nextInt(4)];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(2);
            }
        }

        return matrix;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                System.out.println("-");
                return false;
            }
        }
        System.out.println("+");
        return true;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
