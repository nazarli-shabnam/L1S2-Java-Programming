// package pw1and2;

public class exercise5 {
    public static void main(String[] args) {
        float[][] matA = { { 1, 2 }, { 3, 4 } };
        float[][] matB = { { 5, 6 }, { 7, 8 } };
        float[][] result = product(matA, matB);
        if (result != null) {
            printMatrix(result);
        } 
        else {
            System.out.println("Matrices dimensions do not match for multiplication.");
        }
    }

    public static float[][] product(float[][] matA, float[][] matB) {
        if (matA[0].length == matB.length) {
            float[][] result = new float[matA.length][matB[0].length];
            for (int i = 0; i < matA.length; i++) {
                for (int j = 0; j < matB[0].length; j++) {
                    for (int k = 0; k < matB.length; k++) {
                        result[i][j] += matA[i][k] * matB[k][j];
                    }
                }
            }
            return result;
        } else {
            return null;
        }
    }

    public static void printMatrix(float[][] matrix) {
        for (float[] row : matrix) {
            for (float value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*
 * Write a method float[][] product(float[][] matA, float[][] matB) that
 * computes the product of matrices
 * matA and matB. The method returns the resulting matrix or null if the
 * dimensions of the matrices don’t match.
 */