import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int totalNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        int mahasiswaLulus = 0;
        int mahasiswaTidakLulus = 0;

        for (int i =0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            totalNilai += nilaiAkhir[i];
            if (nilaiAkhir[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] < nilaiTerendah) {
                nilaiTerendah = nilaiAkhir[i];
            }
            if (nilaiAkhir[i] > 70){
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }

        System.out.println("Status kelulusan mahasiswa: ");

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Nilai Akhir Mahasiswa Ke - " + (i+1) + " lulus ");
            } else {
                System.out.println("Nilai akhir Mahasiswa Ke - " + (i + 1) + " tidak lulus");
            }           
        }

        double rataRata = (double) totalNilai / nilaiAkhir.length;

        System.out.println("Nilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa yang Lulus: " + mahasiswaLulus);
        System.out.println("Jumlah mahasiswa yang Tidak Lulus: " + mahasiswaTidakLulus);
    }
}
