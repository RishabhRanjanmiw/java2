package genericsAndWrappperClases;

public class GenericsMethod {
    public static void main(String[] args) {
        printData("hello");
        printData(4564);

        GenericsMethod obj = new GenericsMethod();
        // obj.doubleData("abc");
        obj.doubleData(123);


        CustomClass custom = new CustomClass();
        // obj.doubleData(custom);
        // here custom print refrence
    }

    static <E> void printData(E data) {
        System.out.println(data);
    }
    <E extends Number> void doubleData(E data) {
       System.out.println(data); 
    }
}
class CustomClass{

}
