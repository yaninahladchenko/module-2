public class SequentialSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {158, 207, 392, 62, 315, 434, 487, 268, 405, 241};
        int valueFromArray = 392;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == valueFromArray) {
                System.out.println("Search Element is: " + valueFromArray);
                System.out.println("Element position(index) is: " + i);
            } else {
                System.out.println("Element not found");
            }
        }
    }
}

