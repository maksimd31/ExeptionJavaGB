1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
   А теперь реализуйте следующую логику:
   Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
   Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
```Java
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


```
   .
2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
```Java
package HomeWork1;

import java.util.Random;

public class Task_2 {
   //    2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
//    Если длины массивов не равны, необходимо как-то оповестить пользователя.
   public static void main(String[] args) {
      int[] arr = new int[10];
      printArray(arr);
      int [] arr1 = fillArray(arr);
      printArray(arr1);
      int [] arr2 = fillArray(arr);
      printArray(arr2);
      addArrays(arr1,arr2);
      printArray2(addArrays(arr1,arr2));



   }
   //
   public static int[] addArrays(int[] array1, int[] array2) {
      int[] newArray = new int[Math.max(array1.length, array2.length)];

      if (array1.length != array2.length) {
         System.out.println("Длины массивов не равны!");
      }

      for (int i = 0; i < newArray.length; i++) {
         newArray[i] = array1[i] + array2[i];
      }
      return newArray;
   }


   private static int[] fillArray(int[] arr) {
      Random random = new Random();
      for (int i = 0; i < arr.length; i++) {
         arr[i] = random.nextInt(10);
      }
      return arr;
   }

   public static void printArray(int[] arr) {
      for (int j : arr) {
         System.out.print(j + " ");
      }
      System.out.println();
   }

   public static void printArray2(int[] arr) {
      for (int j : arr) {
         System.out.print(j + " ");
      }
      System.out.println();
   }

}


```
   .
   3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется.
   ```java
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

   ```