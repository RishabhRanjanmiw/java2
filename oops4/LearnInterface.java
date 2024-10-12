public class LearnInterface{
public static void main(String[] args) {
    Monkey m1 = new Monkey();
    m1.eats();
    m1.walk();
    m1.drinks();
    System.out.println("there should always have  "+Animal.Legs);
}


}
interface Pet {
    void walk();
}



interface Animal {
    public static int Legs = 4;
    void eats();
    void drinks();
}
 class Monkey implements Animal, Pet{
     public void eats(){
        System.out.println("eating");
     }
      public void walk(){
        System.out.println("monkey should walk everyday");
      }
       public void drinks(){
        System.out.println(" it must be drink");
       }
 }