import java.util.Scanner;
public class Latihansatu23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.println("Maskukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        System.out.println("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();

        int bilanganTerbesar = bil1;
        
        if (bil2 > bilanganTerbesar) {
            bilanganTerbesar = bil2;
        }
        if (bil3 > bilanganTerbesar) {
            bilanganTerbesar = bil3;
        }
        System.out.println("Bilangan Terbesar" + bilanganTerbesar);
    }
}
