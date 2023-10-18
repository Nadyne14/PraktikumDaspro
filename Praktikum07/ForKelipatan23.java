import java.util.Scanner;
public class ForKelipatan23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan 1-9: ");
        int bilangan = scanner.nextInt();

        int total = 0;
        int counter = 0;

        total = 0;
        counter = 0;


        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0) {
                total += i;
                counter++;
            }
        }
        double average = (double) total / counter;
        System.out.printf("Pada rentang 1-50 terdapat%d bilangan kelipatan %d dengan total %d", counter, bilangan, total);

    }
}
