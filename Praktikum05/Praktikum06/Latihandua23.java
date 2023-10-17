import java.util.Scanner;
public class Latihandua23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = scanner.next().toLowerCase();

        System.out.println("Masukkan jumblah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();

        double diskon = 0.0;

        if (jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3){
                diskon = 0.05;
            }
        }
        double totalHarga = 100.000;
        double totalDiskon = totalHarga * diskon;
        double totalBayar = totalHarga - totalDiskon;

        System.out.println("Total Diskon: " + (totalDiskon * 100 + "%"));
        System.out.println("Total yang harus dibayar: " + totalBayar);
    }
}
