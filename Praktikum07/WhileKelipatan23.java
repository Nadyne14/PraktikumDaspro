import java.util.Scanner;
public class WhileKelipatan23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Bilangan;
        int total = 0;
        int counter = 0;

        System.out.println("Masukkan bilangan 1-9: ");
        Bilangan = scanner.nextInt();

        while (counter < Bilangan) {
            if (counter % 2 == 0 && counter % 3 == 0 ) {
                total += counter;
        }
        counter++;
    }
    System.out.println("Total kelipatan 2 dan 3 dari 1 hingga " + Bilangan + " adalah: " + total);
}
}
