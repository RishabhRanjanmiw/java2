public class LearnInnerClass {

    // non static
    class Toy {
        int price;
    }
    static class Playstation {
        int price;
    }
    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        
        Toy t1 =obj.new Toy();
        // Toy t1 =new LearnInnerClass().new Toy();
        t1.price = 45;


        Playstation p1 = new LearnInnerClass.Playstation();
;
    }
}
