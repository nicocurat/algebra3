public class Ejercicio3 {

  /*
  * Algoritmo Iterativo que cuenta la cantidad de ceros de un numero
  */
  
  public int countCerosIterative(int n){
      int check = n;
      int count = 0;
      while((n - check) != n){
        if((check % 10) == 0) count++;
        check = check / 10;
      }
      return count;
  }

  /*
  * Algoritmo recursivo que cuenta la cantidad de ceros de un numero
  */

  public int countCerosRecursive(int n){
    return countCerosRecursive(n, n, 0);
  }

  private int countCerosRecursive(int n, int check, int count){
    if((n - check) == n) return count;
    if((check % 10) == 0) count++;
    return countCerosRecursive(n, check / 10, count);
  }

  public static void main(String[] args) {
    Ejercicio3 e = new Ejercicio3();
    System.out.println(e.countCerosRecursive(10101010));
  }
}
