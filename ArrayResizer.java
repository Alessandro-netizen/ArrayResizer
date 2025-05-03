public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int rows = 0;
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                rows++;
            }
        }
        return rows;
    }


    public static int[][] resize(int[][] array2D) {
        int rows = numNonZeroRows(array2D);
        if (rows == 0) {
            return new int[0][0];
        }
        int cols = array2D[0].length;
        int[][] resizedArray = new int[rows][cols];
        int currentRow = 0;
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                resizedArray[currentRow] = array2D[row];
                currentRow++;
            }
        }
        return resizedArray;
    }
}
