package Guia1;

/**
 * Created by nicurat on 3/12/17.
 */
public class Ejercicio2 {

    //a
    //Iterative
    private int factorial(int n){
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum*i;
        }
        return sum;
    }
    //Recursive
    private int factorialR(int n){
        int sum;
        if(n == 1){
            return 1;
        }
        sum = factorialR(n-1)*n;
        return sum;
    }

    //b
    //Iterative/Recursive?
    private static long n(int n){
        long result = 1;
        for (int j = 1; j <= n; j++) {
            result = result * 2;
        }
        return result;
    }
    //Recursive
    private static long nR(int n){
        long result;
        if(n == 0) return 1;
        result = nR(n-1)*2;
        return result;
    }

    //c
    //Iterative
    private static int fibonacci(int n){
        int a = 1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int result = a + b;
            a = b;
            b = result;
        }
        return a;
    }
    //Recursive
    private static int fibonacciR(int n){
        if(n == 0 || n == 1) return 1;
        return (fibonacciR(n-1) + fibonacciR(n-2));
    }

    //d
    //Iterative
    private static int mcd(int a, int b){
        if(b == 0) return a;
        int remainder;
        for (int i = 0; i <= b; i--) {
            remainder = a%b;
            a = b;
            b = remainder;
            if(remainder == 0) return a;
        }
        return 1;
    }
    //Recursive
    private static int mcdR(int a, int b){
        return (b == 0)? a : mcdR(b, a%b);
    }

    public static void main(String[] args) {
        Ejercicio2 ej = new Ejercicio2();
        System.out.println(ej.factorial(4));
        System.out.println(ej.factorialR(4));
        System.out.println(n(4));
        System.out.println(nR(4));
        System.out.println(fibonacci(4));
        System.out.println(fibonacciR(4));
        System.out.println(mcdR(2366, 273));
        System.out.println(mcd(2366, 273));
    }
}
