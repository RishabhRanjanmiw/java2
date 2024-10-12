package Polymorphism;


class Car {
    String model;
    int year;
     

    // constructor
    public Car (String model, int year){
        this.model = model;
        this.year = year;
    }
  @Override
  public int hashCode(){
    int intialNumber = 32;
    intialNumber +=year;
    intialNumber += model.hashCode();
    return intialNumber;

  }
    // equals
    public boolean equals(Object obj){
        Car that = (Car)obj;
        if(this.model.equals(that.model) && this.year == that.year){
            return true;
        }
       return false;
    }

    // to string
   public String toString(){
    return "Car " +model+ " and year is " +year;

}
public class objectclases {
    public static void main(String[] args) {
        Car obj = new Car ("MErc", 2022);
        Car obj2 = new Car ("MErc", 2022);
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
        System.out.println(obj.equals(obj2));
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
}