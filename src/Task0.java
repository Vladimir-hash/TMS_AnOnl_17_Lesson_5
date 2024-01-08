import java.util.Scanner;

public class Task0 {

// 0. Создать трехмерный массив из целых чисел.
// С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
// заданное число. Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 6;
        int[][][] arrayX3 = new int[size][size][size];

        System.out.println("Input number to increase array: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arrayX3.length; i++) {
            for (int j = 0; j < arrayX3.length; j++) {
                for (int k = 0; k < arrayX3.length; k++) {
                    arrayX3[i][j][k] += number;
                    System.out.print(arrayX3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        }
    }
