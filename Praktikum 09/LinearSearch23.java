import java.util.Scanner;
public class LinearSearch23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah elemen array: ");
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int n =sc.nextInt();
        int hasil = -1;

        for (int i = 0; i < n; i++){
            System.out.println("Masukkan elemen array ke- " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.println("Masukkan key yang ingin dicari: ");
         key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key)  {
                hasil = i;
                break;
            }
        }

        if (hasil != -1){
        System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
