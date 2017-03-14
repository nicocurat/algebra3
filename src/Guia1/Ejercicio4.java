public class Ejercicio4 {

  /*
  * Algoritmo Iterativo que devuleve true si el conjunto es capicua
  */

  public boolean palindromeIterative(int[] base) {
    int n = Math.round(base.length);
    for(int i = 0; i < n; i++)
      if(base[i] != base[base.length - 1 - i]) return false;
    return true;
  }

  /*
  * Algoritmo recursivo que devuleve true si el conjunto es capicua
  */

  public boolean palindromeRecursivo(int[] base){
    return palindromeRecursivo(base, 0, Math.round(base.length));
  }

  private boolean palindromeRecursivo(int[] base, int i, int n){
    
  }


  public static void main(String[] args) {
    Ejercicio4 e = new Ejercicio4();
    int[] a = {1,2,3,2,1};
    System.out.println(e.palindromeIterative(a));
  }

}
