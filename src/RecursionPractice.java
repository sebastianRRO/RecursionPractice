


import java.io.*;
// importing utility classes
import java.util.*;

// Main class
class RecursionPractice {

    // Method 1
    // To calculate factorial
    static int factorial(int n)
    {

        // Handling base case
        // iIf value of n=1 or n=0, it returns 1
        if (n == 0 || n == 1)
            return 1;

        // Generic case
        // Otherwise we do n*(n-1)!
        return n * factorial(n - 1);
    }
    // Method 2
    // main driver method
    public static void main(String[] args)
    {

        // Calling method 1 to compute factorial and
        // storing the result into a variable
        int inPut = 2;// number that you change the factorial to
        int ans = factorial(inPut);

        // Print and display the factorial of number
        // customly passed as an argument
        System.out.println("Factorial of "+ inPut +" is :" + ans);
        System.out.println("The 0th fibonacci number is: " + Fibonachi.fib(0));
        System.out.println("The 7th fibonacci number is: " + Fibonachi.fib(7));
//        System.out.println("The 12th fibonacci number is: " + Fibonachi.fib(12));
//        System.out.println("The 20th fibonacci number is: " + Fibonachi.fib(20));
        System.out.println("done");
    }
}

