import static java.lang.Math.sqrt;

public class PrimeNumbersInDefinedRange {
    public static void main(String[] args) {
        long fromRange = 0;
        long toRange = 50000;
        System.out.println("Prime numbers between " + fromRange + " and " + toRange);

        //loop through the numbers one by one
        for (long currentNumber = fromRange; currentNumber < toRange; currentNumber++) {
            //check if current number is > 1 (to exclude 0, 1)
            if (currentNumber > 1) {
                boolean isPrime = true;
                //check to see if the number is prime using standard algorithm
                for (int i = 2; i <= sqrt(currentNumber); i++) {

                    if (currentNumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    // print the number
                    System.out.print(currentNumber + " ");
                }
            }

        }
    }
}



