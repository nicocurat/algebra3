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
    private double n(int n){
        int sum;
        if(n == 0) sum = 1;
        for (int i = 1; i <= n; i++) {
            sum =
        }
    }

    //c
    //Iterative

    public static void main(String[] args) {
        Ejercicio2 ej = new Ejercicio2();
        System.out.println(ej.factorial(4));
        System.out.println(ej.factorialR(4));
    }
}
