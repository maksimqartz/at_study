package homework.lesson2.task2;

public class Chessboard {

    public static void main(String[] args) {
        int[][] chessboard = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                chessboard[i][j] = (i + j) % 2;
        }

        System.out.println("Массив через For");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(chessboard[i][j]);
            System.out.println();
        }

        System.out.println("Массив через ForEach");
        for (int[] row : chessboard) {
            for (int element : row)
                System.out.print(element);
            System.out.println();
        }

        System.out.println("Массив через While");
        int i = 0;
        int j = 0;
        while (i < 8) {
            while (j < 8) {
                System.out.print(chessboard[i][j++]);
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}