public class OperasiBoolean{
  public static void main (String[] args) {
    boolean benar = true;
    boolean salah = false;
    
    System.out.println("and &&");
    System.out.println(benar && benar);
    System.out.println(benar && salah);
    System.out.println(salah && benar);
    System.out.println(salah && salah);
    
    System.out.println("\nor || ");
    System.out.println(benar || benar);
    System.out.println(benar || salah);
    System.out.println(salah || benar);
    System.out.println(salah || salah);
    
    System.out.println("\nNot !");
    System.out.println(!benar);
    System.out.println(!salah);
    
    
    
    int absen = 78;
    int nilai = 80;
    
    boolean is_lulus_absen = absen >= 75;
    boolean is_lulus_nilai = nilai >= 75;
    
    boolean is_lulus = is_lulus_nilai && is_lulus_absen;
    if(is_lulus){
      System.out.println("\nAnda lulus");
    }else{
      System.out.println("\nAnda tidak lulus");
    }
  }
}