public class ProblemOnArray {
    public static void main(String[] args) {
        int numbers[] = {12, 23, 34, 45, 56, 67};
    //    int sum = 0;
    //    for (int number:numbers) {
    //     sum +=number;
    //    }
    //    System.out.println("Sum is " +sum);

      int min = Integer.MAX_VALUE;
      for (int number:numbers){
        if (number < min){
            min = number;
        }
      }
      System.out.println("minimum is " +min);
    }
}
