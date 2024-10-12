package oops3.Learnpackage;
 
// iss package ki class se hume scanner class milega 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
// util me sb hota hai scnner nahi sab use klrna ho to
// import java.util.*;  --->import all files in java.util


public class MainClass {
    public static void main(String[] args) {
        // kis class ki scaneer class laani hai
       Scanner scan = new Scanner(System.in);
       List<Integer> list = new ArrayList<>();
       Teacher obj = new Teacher();
       obj.teachingClass = 12;
    //    obj.id = 123;
    //    -->we cannot access id class becuase it private
    }
}
