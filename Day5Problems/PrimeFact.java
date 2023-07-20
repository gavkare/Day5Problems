package Day5Problems;

public class PrimeFact {
    import java.util.Scanner;

    public class PrimeFactorization {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number to find its prime factors: ");
            int number = input.nextInt();

            System.out.print("Prime factors of " + number + ": ");
            computePrimeFactors(number);

            input.close();
        }

        public static void computePrimeFactors(int n) {
            // Print 2 as a factor if n is even
            while (n % 2 == 0) {
                System.out.print("2 ");
                n = n / 2;
            }

            for (int i = 3; i * i <= n; i = i + 2) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }

            if (n > 2) {
                System.out.print(n);
            }
        }
    }


