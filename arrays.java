public class arrays {
    public static void main(String[] args) {
        int age[];
        age = new int[5];
        age [0] = 23;
        age [1] = 23;
         age [3] = 23;
         System.out.println( age [0]);
         System.out.println( age [1]);
         System.out.println( age [3]);

         System.out.println(age.length);

         int marks[] = {23, 24, 25, 27};
         System.out.println(marks[3]);


         String names[] = {"rishabh", "Ranjan", "Triphati"};
         for (int i = 0; i < names.length; i++){
            System.out.println("Names is"+ names[i]);
         }
         for(String name: names){
            System.out.println("for each" +name);
         }

    }
}
