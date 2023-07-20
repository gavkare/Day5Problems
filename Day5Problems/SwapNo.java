package Day5Problems;

import java.util.Scanner;

public class SwapNo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            System.out.println("Before swapping:");
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

            // Swapping logic using a temporary variable
            int temp = num1;
            num1 = num2;
            num2 = temp;

            System.out.println("After swapping:");
            System.out.println("First number: " + num1);
            System.out.println("Second number: " + num2);

            input.close();
        }
    }


