public class ForEach {
  public static void main(String[] args){

    String[] array = {
      "Senin", "Selasa", "Rabu", "Kamis", "Jum'ad", "Sabtu", "Minggu"
    };

    for (int i = 0; i < array.length; i++) {
      System.out.println("Hari ke-" + (i+1) + " " + array[i]);
    }

    for (var hari : array) {
      System.out.println(hari);
    }
  }
}
