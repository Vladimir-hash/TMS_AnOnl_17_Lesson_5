public class Task4 {

    // 4. Создайте двумерный массив. Выведете на консоль диагонали массива

    public static void main(String[] args) {
        int size = 8;
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                if ( i == j) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
