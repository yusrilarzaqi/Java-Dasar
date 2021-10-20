public class Variable{
  public static void main(String[] args){

    String name;
    name = "Yusril A";

    System.out.println(name);

    int age = 18;
    String address = "Semarang";

    System.out.println(age);
    System.out.println(address);

    name = "Bimo A";
    System.out.println(name);

    // var foo = "Foo";

    /* tidak bisa 
     * var foo1;
     * foo1 = "foo1"!
     */
    final var hero = "Shen";
    // cannot do this 
    // hero = "Akali";


    System.out.println(hero);
 }
}
