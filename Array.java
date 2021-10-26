public class Array{
  public static void main (String[] args) {
    String[] arrayString;
    arrayString = new String[2];
    // cara lain 
    // String[] arrayString2 = new String[2];
    String[] nama = new String[]{
      "Bimo", "Alamsyah"
    };

    // menvhapsus isi array / merubah ke null
    nama[0] = null;
    
    arrayString[0] = "Yusril";
    arrayString[1] = "Arzaqi";
    
    System.out.println(arrayString[0]);
    System.out.println(arrayString[1]);
    
    arrayString[1] = "Izza";
    System.out.println(arrayString[1]);
    
    int[] arrayInt = new int[]{
      1,2,3,4,5,6
    };
    System.out.println(arrayInt[4]);
    System.out.println(arrayInt[5]);
    // atau
    long[] arrayLong = {
      10292, 29383939, 393838,292992, 29282939, 293838
    };
    System.out.println(arrayLong[4]);
    System.out.println(arrayLong[5]);
    System.out.println(arrayLong.length);


    String[][] members = {
      {"Yusril", "Arzaqi"},
      {"Bimo", "Alamsyah"},
      {"Adam", "Saputra"}
    };

    String[] member1 = members[0];
    System.out.println(member1[1]);
    System.out.println(members[1][0]);


  }
}
