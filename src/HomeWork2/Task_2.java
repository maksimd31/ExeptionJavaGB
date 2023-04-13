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

