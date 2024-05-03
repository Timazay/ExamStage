package by.itstep.timazay.examStage.task02.model.logic;

public class ImageLogic {

    public static int[][] rotateImage(int[][] matrix, char rotation){
        int[][] result = null;
        if (rotation == 'L'){
           result = rotateImageLeft(matrix);
        } else if (rotation == 'R'){
            result = rotateImageRight(matrix);
        }
            return result;

    }
    private static int[][] rotateImageRight(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
                 {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] rotatedMat = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMat[j][m - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMat;
    }

    private static int[][] rotateImageLeft(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] rotatedMat = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedMat[n - 1 - j][i] = matrix[i][j];
            }
        }

        return rotatedMat;
    }
}
