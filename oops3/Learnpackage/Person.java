package oops3.Learnpackage;

public class Person {

    public static int count = 0;


    // constructor ki kitni baar count badh raha hai
    public Person(){
        count++;
    }
    private int age;
    private String name;
    public void setAge(int age){
        this.age = age;


    }

    public int getAge(){
        return age;
    }
}
