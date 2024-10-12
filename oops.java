public class oops {
    public static void main(String[] args) {


        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.bark();
        
        Dog d2 = new Dog();
        d2.name = "leo";
        d2.walk();

        Lion l1 = new Lion();
        l1.name = "sher";
        l1.king();
 l1.roar();
  Complex num1 = new Complex();
  num1.a = 3;
  num1.b = 5;
  num1.print();

        
    }
}

class Complex{
    // prop
    int a, b;
    // behaviour
    void print (){
        System.out.println(a+ "  +  "  +b);
    }
}

 class Dog {
    String name;
    int age;
 void walk(){
    System.out.println(name+ " is walking");
 }
 void bark(){
    System.out.println(name+ " is barking");
 }

 }
 class Lion{
    String name;
   int age;
 void king(){
    System.out.print(name+ "  fearless king  of Forest");
 }
 void roar(){
    System.out.println("  is raoring");
 }


 }
