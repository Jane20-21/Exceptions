//Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package Seminars.HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = { 1, 5, 6, 8, 7, 9, 2, 1, 9 };
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
