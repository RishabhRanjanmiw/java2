package Exceptions;

public class trycatch {
    public static void main(String[] args) {
        // System.out.println("Rishabh");
        int a[] = new int [5];
        // System.out.println();
        System.out.println("Rishabh");
        try {
            int result = 5/0;
            System.out.println(a[8]);
           
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to acess the bound element");
        } catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
    
}
