public class LearnConstructors {
    public static void main(String[] args) {
       Complex num1 = new Complex(2,4); 
       Complex num2 = new Complex(5,7); 
      //  num1.print();
      System.out.println(num1);
       num2.print();
       System.out.println("addinf two numbers");
       Complex result = num1.add(num2);
       result.print();

    //    new Complex();  java calling default constructors
    }
}

class Complex {
    int a, b;

    // /create constructors

    // public Complex(){
    //     a = 4;
    //     b = 0;
    //     System.out.println("Creating a new obj");
    // }


    public Complex(int a, int b){
     this.a = a;
     this.b = b;
    }


     void print(){
        System.out.println(a+" + "+b+ "i");
     }


     Complex add (Complex num2){
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
     }
}
