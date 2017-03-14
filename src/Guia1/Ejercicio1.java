package Guia1;

/**
 * Created by nicurat on 3/12/17.
 */
public class Ejercicio1 {

    //a
    //Iterative
    private int sumA(int n){
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }
    //Recursive
    private int sumAR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumAR(n-1) + n;
        return sum;
    }

    //b
    //Iterative
    private int sumB(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
    //Recursive
    private int sumBR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumBR(n-1) + (int)Math.pow(n, 2);
        return sum;
    }

    //c
    //Iterative
    private int sumC(int p, int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(p, i);
        }
        return sum;
    }
    //Recursive
    private int sumCR(int p, int n){
        int sum;
        if(n == 0) return 1;
        sum = sumCR(p, n-1) + (int)Math.pow(p, n);
        return sum;
    }

    //d
    //Iterative
    private int sumD(int n){
        int sum = 0;
        int index = 1;
        while(index <= n){
            sum += (2*index)-1;
            index++;
        }
        return sum;
    }
    //Recursive
    private int sumDR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumDR(n-1) + (2*n - 1);
        return sum;
    }

    //e
    //Iterative
    private int sumE(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*(i+1);
        }
        return sum;
    }
    //Recursive
    private int sumER(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumER(n-1) + (n*(n+1));
        return sum;
    }

    //f
    //Iterative
    private int sumF(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (int)Math.pow(i, 3);
        }
        return sum;
    }
    //Recursive
    private int sumFR(int n){
        int sum;
        if(n == 0) return 0;
        sum = sumFR(n-1) + (int)Math.pow(n, 3);
        return sum;
    }

    public static void main(String[] args) {
        Ejercicio1 ej = new Ejercicio1();
        System.out.println(ej.sumA(5));
        System.out.println(ej.sumAR(5));
        System.out.println(ej.sumB(4));
        System.out.println(ej.sumBR(4));
        System.out.println(ej.sumC(2, 5));
        System.out.println(ej.sumCR(2, 5));
        System.out.println(ej.sumD(3));
        System.out.println(ej.sumDR(4));

    }
}