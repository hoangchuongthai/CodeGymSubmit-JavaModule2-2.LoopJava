package src;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Primes want to display: ");

        int numbers = scanner.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        scanner.close();
    }

    // find Prime function
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
