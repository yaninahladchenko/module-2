import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatisticInformation {

    public static void main(String[] args) {
        int[] arr = {206, 430, 73, 30, 293, 322, 30, 36, 447, 229};
        arithmeticMean(arr);
        arithmeticMedian(arr);
        arithmeticMode(arr);
        calculateDeviation(arr);
    }

    private static void arithmeticMean(int[] arr) {
        // Calculate arithmetic mean
        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = sum += arr[i] / arr.length;
        }
        System.out.println("Arithmetic Mean is: " + average);
    }

    private static void arithmeticMedian(int[] arr) {
        // Calculate arithmetic median
        Arrays.sort(arr);
        double median;
        if (arr.length % 2 == 0)
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        else
            median = (double) arr[arr.length / 2];

        System.out.println("Arithmetic Median is: " + median);

    }

    private static void arithmeticMode(int[] arr) {
        // Calculate arithmetic mode
        List<Integer> duplicatesArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j])
                    duplicatesArray.add(arr[i]);
            }
        }
        if (duplicatesArray.size() > 0) {
            System.out.println("Arithmetic Mode is: " + duplicatesArray.toString());
        } else {
            System.out.println("No duplicates in array.");
        }
    }

    private static void calculateDeviation(int[] arr) {
        // Calculate Standard Deviation (the square root of the variance)

        double sum = 0;
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average = sum += arr[i] / arr.length;
        }

        double variance = 0;

        for (int i = 0; i < arr.length; i++) {
            // Calculate Variance (average squared deviation of values from mean)
            variance += (arr[i] - average) * (arr[i] - average) / (arr.length);
        }
        double standardDeviation = Math.sqrt(variance);
        System.out.println("The standard deviation is : " + standardDeviation);
    }

}

