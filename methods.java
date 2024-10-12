public class methods {
    public static void main(String[] args) {

        System.out.println(89);    
        greet();
        System.out.println(89);
      int averageFromFunction =  average(5, 7, false);
      int doubleOfAvg = averageFromFunction * 2;
      System.out.println("hello");
      System.out.println(doubleOfAvg); 
    }
    // function 2
    static void greet() {
        System.out.println(56);
        System.out.println("hello world");
        System.out.println(67);
    }

// function  3
    public static int  average(int a, int b, boolean shouldAverage) {
        if(shouldAverage == false){
            return -1;
        }
   int avg =(a+b)/2;
//    System.out.println("the average is " +avg);
       return avg;
    }
}
