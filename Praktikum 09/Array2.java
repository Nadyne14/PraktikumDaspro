import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
         Scanner input08 = new Scanner(System.in);
         int[] arr = new int[10];

         for (int i = 0; i < arr.length; i++ ) {
            arr[i] =i + 1;
         }
         System.out.println("Isi array secara terbalik: ");
         for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + ": ");
         }
    }    
}
