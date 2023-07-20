package Day5Problems;

import java.util.Scanner;
public class LargestNo {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();

            System.out.println("Enter the third number:");
            int num3 = scanner.nextInt();

            int largestNumber = findLargest(num1, num2, num3);

            System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largestNumber);

            scanner.close();
        }

        public static int findLargest(int a, int b, int c) {
            if (a >= b && a >= c) {
                return a;
            } else if (b >= a && b >= c) {
                return b;
            } else {
                return c;
            }
        }
    }

