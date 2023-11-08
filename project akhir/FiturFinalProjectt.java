import java.util.Scanner;
public class FiturFinalProjectt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String film;
        double hargaFilm;
        String member;
        double diskon;
        String historyPemesanan = "";

        System.out.println("Sistem pemesanan tiket bioskop");

        // Pemilihan film
        System.out.println("Pilih film yang akan ditonton (Dora The Exploler, Spiderman 5, Barbie The Adventure): ");
        film = scanner.nextLine();

        // Penentuan harga film
        if (film.equalsIgnoreCase("Dora The Exploler")) {
            hargaFilm = 25000;
        } else if (film.equalsIgnoreCase("Spiderman 5")) {
            hargaFilm = 25000;
        } else if (film.equalsIgnoreCase(" Barbie The Adventure")) {
            hargaFilm = 25000;
        } else {
            System.out.println("Film tidak valid. Harga film diatur ke default (25000).");
            film = "Film tidak valid";
            hargaFilm = 25000;
        }

        // Pilihan Membership
        System.out.println("Apakah Anda memiliki member? (ada/tidak): ");
        member = scanner.nextLine();

        // Diskon berdasarkan membership
        if (member.equalsIgnoreCase("ada")) {
            diskon = 0.1; // Diskon 10% untuk member
        } else {
            diskon = 0; // Tidak ada diskon untuk non-member
        }

        // Perhitungan total biaya
        double totalBiaya = hargaFilm - (hargaFilm * diskon);

        // Menampilkan informasi pemesanan
        System.out.println("\nRincian Pemesanan:");
        System.out.println("Film yang dipilih: " + film);
        System.out.println("Harga film: " + hargaFilm);
        System.out.println("Member: " + member);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total biaya: " + totalBiaya);

        // Menyimpan histori pemesanan
        historyPemesanan += "Film yang dipilih: " + film + "\n";
        historyPemesanan += "Member: " + member + "\n";
        historyPemesanan += "Diskon: " + (diskon * 100) + "%\n";


        // Menampilkan histori pemesanan
        System.out.println("\nHistori Pemesanan:");
        System.out.println(historyPemesanan);

        // Tutup scanner
        scanner.close();
    }
}
