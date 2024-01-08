public class Task1 {

// 1. Шахматная доска
// Создать программу для раскраски шахматной доски с помощью цикла.
// Создать двумерный массив стрингов 8х8. С помощью циклов задать элементам
// циклам значения В(Black) или W(White).

    public static void main(String[] args) {
        int size = 8;
        String[][] chessBoard = new String[size][size];

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++){
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else {
                    chessBoard[i][j] = "B";
                }
                System.out.print( chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
