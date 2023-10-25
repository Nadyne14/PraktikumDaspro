import java.util.Scanner;
public class UTSmartikulasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char cekLagi;

        do {
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("NIM: ");
            int nim = input.nextInt();
            System.out.print("Kategori SLTA (SMA/SMK/MA): ");
            String kategoriSLTA = input.next();
            System.out.print("Nilai skolastik: ");
            int nilaiSkolastik = input.nextInt();
            System.out.print("Nilai penalaran matematika: ");
            int nilaiPenalaranMatematika = input.nextInt();
            System.out.print("Nilai literasi Bahasa: ");
            int nilaiLiterasiBahasa = input.nextInt();

            double nilaiRataRata = (nilaiSkolastik + nilaiPenalaranMatematika + nilaiLiterasiBahasa) / 3.0;
            System.out.println("Nilai rata-rata: " + nilaiRataRata);

            String kelasMartikulasi = "";

            if (kategoriSLTA.equals("SMA") || kategoriSLTA.equals("MA")) {
                kelasMartikulasi += "praktikum rangkaian listrik ";
            } else if (kategoriSLTA.equals("SMK") && nilaiRataRata < 70) {
                kelasMartikulasi += "praktikum rangkaian listrik ";
            }

            if (kategoriSLTA.equals("MA") || kategoriSLTA.equals("SMK")) {
                kelasMartikulasi += "kalkulus 1 ";
            } else if (kategoriSLTA.equals("SMA") && nilaiPenalaranMatematika < 75) {
                kelasMartikulasi += "kalkulus 1 ";
            }

            if (nilaiLiterasiBahasa < 65) {
                kelasMartikulasi += "Bahasa Inggris dasar";
            }

            System.out.println("Kelas martikulasi yang diikuti: " + kelasMartikulasi);

            System.out.print("Cek mahasiswa lainnya (y/n): ");
            cekLagi = input.next().charAt(0);

        } while (cekLagi == 'y' || cekLagi == 'Y');
    }
}
