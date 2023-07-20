package Day5Problems;

import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the value of N (Nth harmonic number): ");
            int n = input.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. N must be greater than 0.");
            } else {
                double harmonic = calculateHarmonic(n);
                System.out.println("The " + n + "th Harmonic Number is: " + harmonic);
            }

            input.close();
        }

        public static double calculateHarmonic(int n) {
            double harmonic = 0;
            for (int i = 1; i <= n; i++) {
                harmonic += 1.0 / i;
            }
            return harmonic;
        }
    }


