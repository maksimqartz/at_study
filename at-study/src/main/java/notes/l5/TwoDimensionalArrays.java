package notes.l5;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 1, 7},
                {1, 2, 6},
                {},
                {4, 0},
                {5, 8, 4, 1}
        };

        int matrixSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            int[] line = matrix[i];
            int lineSum = getLineSum(line);
            matrixSum += lineSum;
        }
        System.out.println(matrixSum);
    }

    /**
     * Считаем сумму одномерного массива
     */


    private static int getLineSum(int[] line) {
        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            sum += line[i];
        }
        return sum;
    }
}
