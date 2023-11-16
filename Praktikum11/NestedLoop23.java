import java.util.Scanner;
public class NestedLoop23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah kota: ");
        int n = sc.nextInt();

        double[][] suhu = new double[n][4];
        double[] rataRata = new double[5];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));
                double temp =0;

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("  Suhu ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextInt();
                temp += suhu [i][j];
            }
            rataRata[i] = temp / suhu[i].length;
            System.out.println();
        }
        
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i+1) + ": ");

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(suhu[i][j] + " ");
            }

            //for (double temp : suhu[i]) {
            //    System.out.println(temp);
          //  }
                
            //System.out.println();
            System.out.println("Rata rata suhu: " + rataRata[i]);
        }
    }
}