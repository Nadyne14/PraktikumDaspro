public class CobaArgs23 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hai " + args[0]);
            if (args.length > 1) {
                System.out.println("Selamat Datang di " + args[1]);
            } else {
                System.out.println("Selamat Datang");
            }
        } else {
            System.out.println("Hai, Selamat  datang");
        }
        // //String[] args = {"Cica", "Polinema"};
        // System.out.println("Hai " + ", " + args[0]);
        // System.out.println("Selamat datang di " + args[1]);
        // // System.out.println("Hello World!");

        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
    }
}
