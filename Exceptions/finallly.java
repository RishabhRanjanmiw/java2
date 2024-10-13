package Exceptions;

public class finallly {
    public static void main(String[] args) {
        int a[] = new int [5];
        System.out.println("Hello  world");
        try{
            System.out.println(a[8]);
            
        }catch (Exception e){
            System.out.println("Exceptions Handled");
        }finally {
            System.out.println("will run always");
        }
    }
    
}
