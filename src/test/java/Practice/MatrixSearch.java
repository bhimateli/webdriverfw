package Practice;

public class MatrixSearch  {

    /**
     * Searches for a target value in an m x n matrix where each row and column are sorted.
     *
     * @param matrix The sorted matrix.
     * @param target The integer value to search for.
     * @return True if the target is found, false otherwise.
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from the top-right corner of the matrix
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true; // Target found
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        int target = 5;
        System.out.println("Is target " + target + " found? " + searchMatrix(matrix, target));

        target = 20;
        System.out.println("Is target " + target + " found? " + searchMatrix(matrix, target));
    }
}
