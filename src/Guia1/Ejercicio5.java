package Guia1;

/**
 * Created by nicurat on 3/14/17.
 */
public class Ejercicio5 {

    //Iterative
    //I use sequential search.
    private static boolean search(int a, int[] array){
        for (int anArray : array) {
            if (anArray == a) return true;
        }
        return false;
    }
    //Recursive
    private static boolean recursiveSearch(int a, int[] array) {
        return recursiveSearch(0, a, array);
    }

    private static boolean recursiveSearch(int index, int a, int[] array) {
        return array[index] == a || index != array.length - 1 && recursiveSearch(index + 1, a, array);
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 4};
        System.out.println(search(2, array));
        System.out.println(recursiveSearch(2, array));
    }
}
