package oops3.LearnEnscapsulation;

public class LearnStatic {
    public static void printHello(){
        System.out.println("Hello");
        //  learn static me obj banne ki jarurat nahui padhti
        
    }

    // static block which is excuted before the class
 static {
    System.out.println("Called from the static block");
 }

    public static void main(String[] args) {
        printHello();
        // learnStatic.printHello();
    }

// --> non static 
// public void printHi(){
//     System.out.println("hiii");
//     printhi();
//     without creating a object we cannot print like this
// }
    
}
