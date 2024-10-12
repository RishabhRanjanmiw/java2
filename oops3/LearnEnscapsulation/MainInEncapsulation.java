package oops3.LearnEnscapsulation;

import oops3.Learnpackage.Person;




public class MainInEncapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(22);
        System.out.println(p1.getAge());

        p1.count = 45;

        // returns 50 because ek hi copy banti hai staic ki
         Person p2 = new Person();
         System.out.println(Person.count );
    }



    
}
