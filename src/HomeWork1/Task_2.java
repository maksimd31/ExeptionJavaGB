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
