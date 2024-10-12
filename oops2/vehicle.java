package oops2;
// public class vehicle---> final class which prevents to makes car like child classes 
public class vehicle {
// fina;l variable
final int gears = 5;
public static void main(String[] args) {
   vehicle v1 = new vehicle(2);
   // v1.gears = 6; cannot be upgrade becuase final variable qwill assign
}




    int wheelsCount;
    String model;
// constructor
    vehicle(){
      System.out.println("Creating a vehicle insatnce");
    }
    vehicle(int wheelsCount) {
      this.wheelsCount = wheelsCount;
      System.out.println("Creating vehicle is wheels");
    }
     void start(){
        System.out.println("Vehicle is starting");
     }
// final method--> finalising the function not to upgrade...in the child class 
     final void accelerate(){
      System.out.println("vehicle will be accelerating");
     }
}
