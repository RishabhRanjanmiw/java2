package collection.collectionAndlist;

// import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Listiterator {
    public static void main(String[] args) {
        List <String> fruits = new LinkedList<>();
        // List <String> fruit2 = new Stack<>();

        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("papaya");
        fruits.add("apple");


// fruit2.push("a");
       
// for
        for (int i = 0; i <fruits.size(); i++){
            System.out.println("fruits is " +fruits.get(i));
        }
// for each

for (String fruit: fruits){
System.out.println("for each fruits" +fruit);
}

// iterator
Iterator<String> fe = fruits.iterator();

while(fe.hasNext()){
    System.out.println("iterator  "+ fe.next());
}

// subString
List<String> smallList = fruits.subList(1, 3);
System.out.println(smallList);
    }
}
