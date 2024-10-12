public class MethodOverloading {
    public static void main(String[] args) {
        // for calling greet class we  can create a object
    Greet obj = new Greet();
    obj.greetings();
    obj.greetings("Rishabh");
    obj.greetings("Rishabh", 4);

    }
}

class Greet{



    void greetings(){
  System.out.println("Hello sir , Welcome to my code");
    }


    void greetings(String name){
  System.out.println("Hello " +name+   "  Welcome");
    }
  void greetings (String name, int count){
    for(int i=0; i<count; i++) {
    System.out.println("Hello " +name+   "  Welcome  " +i);}
  }

}