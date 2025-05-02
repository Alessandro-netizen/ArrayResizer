public class ArrayResizer {
    /**
     * Returns true if and only if every value in row r
     * of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the number of rows in array2D that contain
     * all non-zero values.
     * Postcondition: array2D is unchanged.
     */
    public static int numNonZeroRows(int[][] array2D) {
        int rows = 0;
        for (int row = 0; row < array2D.length; row++) {
            if (isNonZeroRow(array2D, row)) {
                rows++;
            }
        }
        return rows;
    }

    /**
     * Returns a new, possibly smaller, two-dimensional array
     * that contains only rows
     * from array2D with no zeros, as described in part (b).
     * Precondition: array2D contains at least one column and
     * at least one row with no zeros.
     * Postcondition: array2D is unchanged.
     */
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
