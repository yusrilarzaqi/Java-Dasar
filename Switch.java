public class Switch {
  public static void main(String[] args){
    char nilai = 'A';

    switch(nilai){
      case 'A':
        System.out.println("Anda lulus dengan sangat baik");
        break;
      case 'B':
        System.out.println("Anda lulus dengan baik");
        break;
      case 'C':
        System.out.println("Anda lulus cukup baik");
        break;
      case 'D':
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin anda salah jurusan!");
        break; 
    }
    
    switch(nilai){
      case 'A' -> System.out.println("Anda lulus dengan sangat baik");
      case 'B','C' -> System.out.println("Anda lulus ");
      case 'D' -> System.out.println("Anda tidak lulus");
      default -> {
        System.out.println("Mungkin anda salah jurusan!");
      }
    }

    String ucapan;

    switch(nilai){
      case 'A' -> ucapan = ("Anda lulus dengan sangat baik");
      case 'B','C' -> ucapan = ("Anda lulus ");
      case 'D' -> ucapan = ("Anda tidak lulus");
      default -> {
        ucapan = ("Mungkin anda salah jurusan!");
      }
    }
    
    ucapan = switch(nilai){
      case 'A':
        yield "Anda lulus dengan sangat baik";
      case 'B','C':
        yield "Anda lulus ";
      case 'D':
        yield "Anda tidak lulus";
      default:
        yield "Mungkin anda salah jurusan!";
    };
    

    System.out.println(ucapan);
    System.out.println();
    


  }
}