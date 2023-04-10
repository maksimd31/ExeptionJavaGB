1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. Метод должен пройтись по каждому элементу и проверить что он не равен null.
   А теперь реализуйте следующую логику:
   Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
   Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
```Java
public static void checkArray(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == null) {
            System.out.println("Null found in array at index " + i);
        }
    }
}



```
   .
2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
```Java
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


```
   .
   3*. Реализуйте метод, принимающий в качестве аргументов двумерный массив. Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова, детализировать какие строки со столбцами не требуется.
   ```java
public static boolean isSquareMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
        if (matrix[i].length != matrix.length) {
        return false;
        }
        }
        return true;
        }

   
   ```