
public class FibonacciSequence {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Usage: java FibonacciSequence <n>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n+1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(fib[n]);
    }
}