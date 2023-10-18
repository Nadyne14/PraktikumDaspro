import java.util.Scanner;
public class DoWhileCuti23 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int jatahCuti = 5;
        int jumlahHari;
        String konfirmasi;

        System.out.println("Jatah Cuti: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")){
                System.out.println("Jumlah hari: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }
        } while (jatahCuti > 0);
    }

}
