package Polymorphism;


class Data {
    int data;
    public void printData(){
        System.out.println(data);
    }

    // compile time morphism [-----
    public void printData(int times) {
        for (int i = 0; i<times; i++){
            System.out.println(data);
        }
    }
    // ------]
}
 class childData extends Data {
    @Override
    public void printData(){
        System.out.println("overrideen " +data);
    }
 }

//  -->  suntime polymorphism
public class LearnPolymorphism {
    public static void main(String[] args) {

        Data d;
        d = new childData();
        d.printData();

        Data d2 = new Data();
        d2.printData(3);
        
    }
}
