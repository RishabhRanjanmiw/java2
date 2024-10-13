package genericsAndWrappperClases;

public class generics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("1234");
        Dog<String> d2 = new Dog("123");
        Dog<Integer> d3 = new Dog(12);

        System.out.println(d3.getId());
    }
}

class Dog<E> {
    E id;
    // String id;
    // V name;
    public Dog(E id) {
        this.id =id;
        // this.name = name;
    }
  E getId(){
return id;
  }
}
