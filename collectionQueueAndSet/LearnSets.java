package collectionQueueAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student {
    int rollNo;
    String name;


    public Student (int rollNo, String name){
  this.rollNo = rollNo;
  this.name = name;

  
    }


    // 2 element alg alg hai toh hash code alg alg hoga


    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }



}



public class LearnSets {
    public static void main(String[] args) {

        // ------->HashSet<-------- 1(n)
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        
        set.remove(10);
        System.out.println(set);
// -------->End<----------


        // ------>LinkedHashset<------------ O(n)

        Set<Integer> sets = new LinkedHashSet<>();

        sets.add(10);
        sets.add(10);
        sets.add(10);
        sets.add(50);
        sets.add(20);
        sets.add(30);

        System.out.println(sets);

        // -------->End<----------

        // --------->Treset<---------- O(logn)
        Set<Integer> treeset = new LinkedHashSet<>();

        treeset.add(100);
        treeset.add(100);
        treeset.add(100);
        treeset.add(500);
        treeset.add(200);
        treeset.add(300);

        System.out.println(treeset);
        // -------->End<----------






   Set<Student> std = new HashSet<>();
    Student s1 = new Student(1, "Rishabh");
    Student s2 = new Student(1, "Ranjan");
    System.out.println(s1.equals(s2));

   std.add(new Student(1, "Rishabh"));
   std.add(new Student(1, "Rishabh"));
   std.add(new Student(1, "Rishabh"));
  System.out.println(std);

       
        
    }
}
