public class Ternary {
  public static void main(String[] args){

    var nilai = 75;
    String text;

    if(nilai >= 75){
      text = "Selamat anda lulus";
    }else{
      text = "Silahkan coba lagi";
    }
    
    System.out.println(text);

    text = (nilai >= 75) ? "Selamat anda lulus" : "Silahkan coba lagi";

    System.out.println(text);
  }
}