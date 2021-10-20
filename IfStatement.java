public class IfStatement{
  public static void main(String[] args){
    
    int absen= 90;
    int nilai = 90;

    // var lulusNilai = nilai >= 75;
    // var lulusAbsen = absen >= 79;

    // var lulus = lulusAbsen && lulusNilai;

    if(nilai >= 88 && absen >= 88){
      System.out.println("nilai anda A");
    }else if(nilai >= 70 && absen >= 70){
      System.out.println("nilai anda B");
    }else if(nilai >= 60 && absen >= 60){
      System.out.println("nilai anda C");
    }else if(nilai >= 50 && absen >= 50){
      System.out.println("nilai anda D");
    }else{
      System.out.println("nilai anda E");
    }
    

  }
}
