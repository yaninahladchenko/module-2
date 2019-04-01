import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 8, 3, 1, 9, 5, 7, 10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSortASC(arr);
        bubbleSortDESC(arr);
    }

    private static void bubbleSortASC(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("Sorted Array ASC: " + Arrays.toString(arr));
    }

    private static void bubbleSortDESC(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        System.out.println("Sorted Array DESC: " + Arrays.toString(arr));
    }
}


