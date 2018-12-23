package math.problems;


public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int n = 5;
        System.out.println("Factorial of "+n +" is "+ findFactorial(n));

    }
    public static int findFactorial(int n){
        if(n==0)
            return 1;
        else return n*findFactorial(n-1);
    }
}
