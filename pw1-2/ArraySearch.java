// package pw1and2;
//EXERCISE 6
public class ArraySearch {

    public static void main(String[] args) {
        int[] array1D = { 10, 20, 30, 40, 50 };
        int value1D = 30;
        int index1D = search(array1D, value1D);
        System.out.println("1D Array Search:");
        System.out.println("Index of " + value1D + ": " + index1D);

        int[][] array2D = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int value2D = 5;
        int[] index2D = search(array2D, value2D);
        System.out.println("2D Array Search:");
        System.out.println("Indices of " + value2D + ": [" + index2D[0] + ", " + index2D[1] + "]");
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] search(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
/*
 * One-Dimensional Array Search:
 * 
 * Give the signature of a method that searches for a given integer value in an
 * integer array.
 * 
 * Implement your method: you must perform a “raw” search, i.e., loop over the
 * array from the start and compare each element to the searched value.
 * 
 * Return the index of the value if it is found, else return -1.
 * 
 * Two-Dimensional Array Search:
 * 
 * Specify and implement a similar method to search for a value in a
 * two-dimensional array.
 */