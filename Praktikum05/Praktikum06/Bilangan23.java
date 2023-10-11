import java.util.Scanner;

public class Bilangan23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();

        int max = bil1;
        if (bil2 > max) {
            max = bil2;
        }
        if (bil3 > max) {
            max = bil3;
        }

        int min = bil1;
        if (bil2 < min) {
            min = bil2;
        }
        if (bil3 < min) {
            min = bil3;
        }


        int middle = bil1 + bil2 + bil3 - max - min;

 
        System.out.println("Bilangan Terbesar: " + max);
        System.out.println("Bilangan Terkecil: " + min);
        System.out.println("Bilangan Tengah: " + middle);
    }
}