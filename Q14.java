public class Q14 {

    // Method to add two three-dimensional arrays componentwise
    public static int[][][] addThreeDimensionalArrays(int[][][] array1, int[][][] array2) {
        // Check if the arrays have the same dimensions
        if (array1.length != array2.length || 
            array1[0].length != array2[0].length || 
            array1[0][0].length != array2[0][0].length) {
            throw new IllegalArgumentException("Arrays must have the same dimensions");
        }

        // Create a new array to store the result
        int[][][] result = new int[array1.length][array1[0].length][array1[0][0].length];

        // Add the corresponding elements of the two arrays
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < result[0][0].length; k++) {
                    result[i][j][k] = array1[i][j][k] + array2[i][j][k];
                }
            }
        }

        return result;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Initialize two 3D arrays with the same dimensions
        int[][][] array1 = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        int[][][] array2 = {
            {{9, 8}, {7, 6}},
            {{5, 4}, {3, 2}}
        };

        // Call the method to add the arrays
        int[][][] result = addThreeDimensionalArrays(array1, array2);

        // Print the resulting array
        System.out.println("Resulting Array:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < result[0][0].length; k++) {
                    System.out.print(result[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
