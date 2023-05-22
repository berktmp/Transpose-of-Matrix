public class Main {
    // Method to calculate the transpose of a matrix
    static void transpose(int[][] arr) {
        int[][] trpz = new int[arr[0].length][arr.length];

        // Performing transpose operation
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++) {
                trpz[y][x] = arr[x][y];
            }
        }

        System.out.println("--------------");
        System.out.println("Transpose: ");

        // Printing the transpose matrix
        for (int[] row : trpz) {
            for (int j = 0; j < trpz[0].length; j++) {
                System.out.print(row[j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] list = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("--------------");
        System.out.println("Matrix: ");

        // Printing the original matrix
        for (int[] row : list) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(row[j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        // Calculating and printing the transpose of the matrix
        transpose(list);

        System.out.println("--------------");
    }
}
