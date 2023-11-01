import java.util.Scanner;
public class ArryaNilai23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];


        for (int i =0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("nilai Akhir Mahasiswa Ke - " + (i+1) + " adalah " + nilaiAkhir[i] );
        }
    }
}
