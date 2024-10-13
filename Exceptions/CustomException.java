package Exceptions;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Age");
        try {
        int age = scan.nextInt();
        if (age > 100){
            throw new MyException("My Error is this");
        }
    }catch(Exception e){
        System.out.println(e);
    }
}
}
class MyException extends Exception {
  public MyException(String message){
   super(message);
  }
}
