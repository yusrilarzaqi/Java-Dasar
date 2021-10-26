public class Recursive{
  public static void main(String[] args){

    // int hasil = faktorikal(10);
    // System.out.println("Hasil dari faktorikal 10 adalah : " + hasil);

    // System.out.println(rek(10));

    loop(10000);
  }
  
  // faktorial looping 
  static int faktorikal(int value){
    var result = 1;
    for(int i = 1; i <= value; i++){
      result *= i;
    }
    return result;
  }

  // faktorikal dengan recrusive 
  static int rek(int value){
    if(value==1){
      return 1;
    }else{
      return value * rek(value-1);
    }    
  }
  static void loop(int value){
    if(value==0){
      System.out.println("Selesai");
    }else{
      System.out.println("loop ke-"+ value);
      loop(value - 1);
    }
  }
}
