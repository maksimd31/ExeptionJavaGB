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
# HOMEWORK2
1) Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
```java 
package HomeWork2;

import java.util.Scanner;

public class Task_1 {
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
```
2) Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
```java
package HomeWork2;

public class Task_2 {
    public static void main(String[] args) {
        task_2();
    }

    /**
     * Если необходимо, исправьте данный код (задание 2)
     */
    private static void task_2() {
        try {
            int[] intArray = {2, 3, 4, 5, 6, 6};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
```
3) Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
```java
package HomeWork2;

import java.io.FileNotFoundException;

public class Task_3 {
    /**
     * Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
```
4) Исправьте код, примените подходящие способы обработки исключений:
```java
package HomeWork2;

import java.io.*;

public class Task_4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"apple", "orange"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (StackOverflowError error) {
            System.out.println("Что-то сломалось");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}

```
# HOMEWORK#3
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого
   размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
```java
package HomeWork3;

public class task1 {

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = processArray(arr);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Передан массив неправильного размера (должен быть 4x4)");
        } catch (MyArrayDataException e) {
            System.out.println("Неправильные данные в ячейке (" + e.getRow() + ", " + e.getCol() + ")");
        }
    }

    public static int processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super();
    }
}

class MyArrayDataException extends Exception {
    private final int row;
    private final int col;

    MyArrayDataException(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

```