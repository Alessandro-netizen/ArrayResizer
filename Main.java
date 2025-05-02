public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 1, 0},
                {1, 3, 2},
                {0, 0, 0},
                {4, 5, 6}
        };

        int[][] result = ArrayResizer.resize(arr);
        System.out.println("Resized Array:");
        for (int[] row : result) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
