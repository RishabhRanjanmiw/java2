public class LearnAbstarct {
    

    public static void main(String[] args) {
        // vehicle v1 = new vehicle();
        Car c1 = new Car();
        c1.accelerate(76);
        c1.brakes(4);
        c1.honks();
        Bus b1 = new Bus();
        b1.accelerate(120);
        b1.brakes(7);
        b1.honks();
        Human atul = new Human();
        atul.eat(3);
        atul.sleep();

    }
}

 
// abstarct keyword cannot allow you make an object
abstract class vehicle {

    //  implement of abstract method
    abstract void accelerate(int speed);
    abstract void brakes(int wheels);


    // normal method
    void honks(){

        System.out.println("vehicle honks");
    }

}

// so we create an child class to acess the abstact prop
 class Car extends vehicle{
    @Override 
    void accelerate(int speed){
        System.out.println("Car is acceleration" +speed);

    }
    @Override
    void brakes(int wheels){
    System.out.println("applied breakes on all " +wheels+ " wheels");
    }

    void honks(){
        System.out.println("Cars honks louder");
    }

 }
 class Bus extends vehicle{
    @Override 
    void accelerate(int speed){
        System.out.println("Bus is acceleration" +speed);

    }
    @Override
    void brakes(int wheels){
    System.out.println("applied breakes on all " +wheels+ " wheels");
    }

 }

class Human {
     void eat( int weight){
        System.out.println("Human eats everyday" +weight);
     }
     void sleep(){
        System.out.println("he sleeps everyday");
     }

}