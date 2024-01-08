import java.util.Arrays;

public class Task5 {

    // 5. Создайте двумерный массив целых чисел.
    // Отсотрируйте элементы в строках двумерного массива по возрастанию.

    public static void main(String[] args) {
        int size = 8;
        int[][] array = new int[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] sort : array) {
            Arrays.sort(sort);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
