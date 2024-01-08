public class Task3 {

    // 3. Создайте двумерный массив целых чисел.
    // Выведете на консоль сумму всех элементов массива.

    public static void main(String[] args) {
        int sumOfElements = 0;
        int[][] array = {{2,2,3,4}, {2,6,7,8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumOfElements += array[i][j];
            }
        }
        System.out.print(sumOfElements);
    }
}
