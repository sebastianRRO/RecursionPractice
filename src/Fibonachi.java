public class Fibonachi {
//The fibonacci series is a series in which each number is the sum of the previous two numbers
// fist 10 in the fib sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public static long fib(long n) {
            if ((n == 0) || (n == 1))
                return n;// the first number
            else
                System.out.println(n);
            // Why doesnt it print out 8 and why does it print a ton of random numbers at the end
                return fib(n - 1) + fib(n - 2);
            // if n doesnt = 1 then it does fib to n again until n = 0

    }
}

