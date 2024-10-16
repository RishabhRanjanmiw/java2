package collection.collectionAndlist;

import java.util.ArrayList;
import java.util.List;


public class LearnList {
    public static void main(String[] args) {
        
    
    List<Integer> list = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();



    list.add(10);
    list.add(12);
    list.add(22);


    list2.add(1);
    list2.add(22);
    list2.add(33);
    list2.add(34);


    list.addAll(list2);
    System.out.println(list);

      // method only in list not on collection
// {------->
    System.out.println(list.get(0));
    list.set(1, 234);


    list.add(1, 987);
    System.out.println(list);
   System.out.println(list2.indexOf(100));



// <-------------







    System.out.println(list.size());
System.out.println(list.contains(10));
System.out.println();
// removing index
list.remove(1);
System.out.println(list);
    // removing value
     list.remove(Integer.valueOf(22));
    //  intersection
    list.retainAll(list2);

   
     System.out.println(list);

    // removing
     list.removeAll(list2);
     System.out.println(list);

//   arr to integer
    // Object a[] = list.toArray();
    // for (Object e: a){
    //     Integer temp = (Integer) e;
    //     System.out.println(e);
    // }
    // System.out.println(list);


  
}
}


 
