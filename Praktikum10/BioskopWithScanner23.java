import java.util.Scanner;
public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

        if (menu == 1) {
            System.out.print("Masukkan nama: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            int baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            int kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                if (penonton[baris - 1][kolom - 1] == null) {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil disimpan.");
                } else {
                    System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Baris atau kolom tidak valid.");
            }
        } else if (menu == 2) {
            System.out.println("Daftar Penonton:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    } else {
                        System.out.print(penonton[i][j] + "\t");
                    }
                }
                System.out.println();
            }
        } else if (menu == 3) {
            break;
        } else {
            System.out.println("Menu tidak valid. Silakan pilih menu yang benar."); 
            }
            
        }
    }
}
