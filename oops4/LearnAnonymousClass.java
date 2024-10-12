public class LearnAnonymousClass {
    // class InnerClass extends OuterClass{

    // }
    //   creating sub anonymous class --> child class of outer class
    OuterClass obj = new OuterClass(){
  void Sing(){

  }
  public void outerMethod(){

  }
    };
    SuperInterface obj2 = new SuperInterface() {
        public void interfaceMethod(){

        }
    };


    // functinal interface --> having only one method 
    SuperInterface obj3 = () -> {

    };
   
    public static void main(String[] args) {
        WalkAble walkable = (int steps) -> {
            System.out.println("walk steps" +steps+ " steps");
            return steps;
    
        };
        walkable.walks(99);
        WalkAble obj2 = (int steps) -> 2*steps;
        System.out.println(obj2.walks(87));
        
    }

    interface WalkAble {
   int walks (int steps);
    
    }
    
}
class OuterClass{
    public void outerMethod(){

    }
}

@FunctionalInterface    

interface SuperInterface{
    void interfaceMethod();
}


/**
 * Walk
 */
 