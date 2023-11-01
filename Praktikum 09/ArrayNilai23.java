import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i< 10; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i <10; i++) {
            System.out.println("Nilai akhir mahasiswa ke- " + (i+1) + " adalah " + nilaiAkhir[i]);
        }
       for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke- " + (i+1) + " lulus");
        } else {
            System.out.println("Mahasiswa ke- " + (i+1) + " tidak lulus");
        }
       }
    }
}
