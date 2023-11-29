public class School23 {
    public static void main(String[] args) {
        String[] student1A = {"Anne", "Aldrian", "Ali", "Arul", "Ashley" };
        String[] student1B = {"Bobby", "Becky", "Benny" };
        String[] student1C = {"clara", "Celine", "charlie", "Caroine" };
        String[] student1D = {"Daniel", "daisy", "Diana" };

        display(student1A);
        display(student1B);
        display(student1C);
        display(student1D);

         
        // System.out.printf("=========================%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        // System.out.printf("=========================%n");

        // for (int i = 0; i < student1A.length; i++) {
        //     System.out.printf("| %-3d | %-15s |%n", (i+1), student1A[i]);
        // }
        // System.out.printf("=========================%n");


        // System.out.printf("=========================%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        // System.out.printf("=========================%n");

        // for (int i = 0; i < student1B.length; i++) {
        //     System.out.printf("| %-3d | %-15s |%n", (i+1), student1B[i]);
        // }
        // System.out.printf("=========================%n");

        
        // System.out.printf("=========================%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        // System.out.printf("=========================%n");

        // for (int i = 0; i < student1C.length; i++) {
        //     System.out.printf("| %-3d | %-15s |%n", (i+1), student1C[i]);
        // }
        // System.out.printf("=========================%n");


        // System.out.printf("=========================%n");
        // System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        // System.out.printf("=========================%n");
        // for (int i = 0; i < student1D.length; i++) {
        //     System.out.printf("| %-3d | %-15s |%n", (i+1), student1D[i]);
        // }
        // System.out.printf("=========================%n");
    }

    public static void display(String[] student) {
    System.out.printf("=========================%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("=========================%n");

        for (int i = 0; i < student.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i+1), student[i]);
        }
        System.out.printf("=========================%n");
    }
}