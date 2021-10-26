public class Value {
  public static void main(String argv[]){
    System.out.println("Hasil dari 10 kuadrat adalah " + kuadrat(10));
    
    int a = hitung(10 , "+", 100);
    System.out.println(a);

    System.out.println("Hasil dari 100 * 303 : " + hitung(100, "*", 303));
  }

  static int kuadrat(int x){
    return x*x;
  }

  static int hitung(int val1, String operasi, int val2){
    switch (operasi) {
      case "+":
        return val1+val2;
      case "-":
        return val1 - val2;
      case "*":
        return val1 * val2;
      case "/":
        return val1 / val2;
      default:
        return 0;
    }
  }

}
