package string;
public class Stringmethods {
    public static void main(String[] args) {
        String name = "   Rishabh";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Rishabh".startsWith("Ris"));
        System.out.println("ranjan".endsWith("jan"));
        System.out.println("Triphati".charAt(4));
        int marks = 45;
        String stringMarks = String.valueOf(marks);
        System.out.println(stringMarks+2);

        String address = "banglore is a goodcity , its a biigest it city. where city is very vast";
        String newAddress = address.replace("city", "state");
        System.out.println(address);
        System.out.println(newAddress);
        System.out.println(address.contains("city"));
        String subString = address.substring(7, 24);
        System.out.println(subString);
       String words[] = address.split(" ");
       for(String word: words){
        System.out.println(word);
       }

       String color = "Black is my fav color";
       char letters[] = color.toCharArray();
       for(char letter: letters){
        System.out.println(letter);
       }

       String animal = "     ";
        if (animal.isEmpty()) {
            System.out.println("empty");
        }else if (animal.isBlank()){
            System.out.println("blank");
        }
    }
}
