import java.util.Scanner;
public class Segitiga23 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        int sudut1, sudut2, sudut3;

        System.out.println("Masukkan sudut 1: ");
        sudut1 = sc.nextInt();
        System.out.println("Masukkan sudut 2: ");
        sudut2 = sc.nextInt();
        System.out.println("Masukkan sudut 3: ");
        sudut3 = sc.nextInt();

        int totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segiiga siku-siku");
           } else if (sudut1 == sudut2 && sudut2 == sudut3) {
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
           } else if (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki"); 
           }else {
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
           }
            } else {
            System.out.println("Bukan Segitiga");
                 }
            }
        }
    
