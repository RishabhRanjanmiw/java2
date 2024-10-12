package string;
public class string {
    public static void main(String[] args) {
         String name = "Rishabh";
         String name2 = "Rishabh";
         String newName = new String("Ranjan");
         System.out.println(name);
         System.out.println(name2);
         System.out.println(newName);
         if (name == name2){
            System.out.println("both are same");
         }else{
            System.out.println("both are not same");
         }
        //  because refrence are not same values could not check

        // comparing values by euals
        if(name.equals(newName)){
            System.out.println("name and new having a same values");
        }else{
            System.out.println("not are same");
        }
    }
}
