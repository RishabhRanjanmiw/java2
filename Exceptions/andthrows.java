package Exceptions;

public class andthrows {
    public static void main(String[] args) {
        int arr[] = new int[5];
        getNumberFromArray(arr);
    }
    static int  getNumberFromArray (int arr[]) throws ArithmeticException {
  return arr[8];
    }
}
