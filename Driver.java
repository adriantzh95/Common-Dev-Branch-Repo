import java.util.Scanner;

/**
 * Created by User on 10/10/2017.
 */
public class Driver {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = userInput.nextInt();

        PrimeNumber primeNumber = new PrimeNumber(num);
        boolean isPrime = primeNumber.isPrime();

        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
