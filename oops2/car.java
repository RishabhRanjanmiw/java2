package oops2;

public class car extends vehicle{

 String color;


  void start(){
    Scooter scooterobj = new Scooter();
    scooterobj.braking(this);

    super.start();
    System.out.println(this);
    System.out.println(this.model+ " Car is starting");
  }

  car braking(){
    return this;
  }

//   breaking is overiding here beacuse vehicle have a constructor and have own property to acess themm but car creates its own prop ...
//   constructor
  car(){
    super(7 );
    System.out.println("car is being created");
  }
  
  
  public static void main(String[] args) {
  
   car obj = new car();
   obj.wheelsCount = 6;
   obj.model = "BMW M5";
   obj.color = "phata black";
   obj.start();
   System.out.println(obj.wheelsCount);
        
    }
    
}


class Scooter{
    void braking (car Car){
        System.out.println(Car.model+" is braking");
    }
}
