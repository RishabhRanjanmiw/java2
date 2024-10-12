package string;

import java.util.Scanner;

public class Learnstring {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
// sc.next() space ke baad ki chizo kon ignore kar deta hai
        System.out.println("enter a name");
        String firstName = sc.nextLine();

        System.out.println("enter a name");
        String lastName = sc.nextLine();

        System.out.println("full name " +firstName+" "+lastName);

        if(firstName.equals(lastName)){
            System.out.println("both are same please give right name");
        }else{
            System.out.println("name is correct");
        }
       
       
    }
}
