public class MethodVariableArgumen {
  public static void main(String[] args){
    sayCongrats("Yusril", 82, 90, 78,88 );

    sayCongrats("Bimo", 78, 20, 10, 43);
  }

  static void sayCongrats(String name, int... values){
    var total = 0;

    for(var value: values){
      total += value;
    }

    var finalValue = total / values.length;

    if(finalValue >= 75){
      System.out.println("Selamat " + name + " lulus");
    }else{
      System.out.println(name + " tidak lulus ");
    }
  }
}