package Day5Problems;

import java.util.Scanner;
import java.util.Random;

    public class FlipCoin {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of times to flip the coin: ");
            int numberOfFlips = input.nextInt();

            if (numberOfFlips <= 0) {
                System.out.println("Invalid input. The number of flips must be a positive integer.");
            } else {
                int headsCount = 0;
                int tailsCount = 0;

                Random random = new Random();

                for (int i = 0; i < numberOfFlips; i++) {
                    if (random.nextDouble() < 0.5) {
                        headsCount++;
                    } else {
                        tailsCount++;
                    }
                }

                double percentageHeads = (double) headsCount / numberOfFlips * 100;
                double percentageTails = (double) tailsCount / numberOfFlips * 100;

                System.out.println("Percentage of Heads: " + percentageHeads + "%");
                System.out.println("Percentage of Tails: " + percentageTails + "%");
            }

            input.close();
        }
    }


