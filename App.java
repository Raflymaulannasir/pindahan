public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("No.1 ");
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("No.2");
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("No.3");
        int tinggi = 5;

        for (i = 1; i <= tinggi; i++) {
            for (j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("No.4");
        tinggi = 5;

        for (i = 1; i <= tinggi; i++) {
            for (j = tinggi - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l <= tinggi - i; l++) {
                System.out.print("  ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("");

        System.out.println("No.5");
        tinggi = 5;

        for (i = 1; i <= tinggi; i++) {
            for (j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        tinggi = 5;

        for (i = tinggi; i >= 1; i--) {
            for (j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}