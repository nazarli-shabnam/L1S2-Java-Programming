// package pw1and2;
//EXERCISE 2
public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 34, 87, 1, 2, -2, 77, 100 };
        System.out.println("The minimum number in the array is: " + min(array));
        System.out.println("The given value's position in the array is: " + find(array, 5));
        System.out.println("The sum of the array is: " + sumArray(array));
        System.out.println("The array is: ");
        printArray(array);
        System.out.println("The reversed array is: ");
        printArray(reverseArray(array));
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int find(int[] array, int value) {
        int position = 0;
        while (array[position] != value) {
            position++;
        }
        return ++position;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }
}
