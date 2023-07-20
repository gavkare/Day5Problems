package Day5Problems;

    public class PowerOf {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: java PowerOf2 <N>");
                return;
            }

            int N = Integer.parseInt(args[0]);

            if (N < 0 || N >= 31) {
                System.out.println("Invalid input. N must be between 0 and 30 (inclusive).");
                return;
            }

            System.out.println("Powers of 2 less than or equal to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                int result = (int) Math.pow(2, i);
                System.out.println("2^" + i + " = " + result);
            }
        }
    }


