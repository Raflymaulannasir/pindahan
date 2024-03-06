public class Appc {
    public static void main(String[] args) throws Exception {

        int i, j, k;
        int baris = 4;

        System.out.println("nomor 1");
        System.out.println();

        i = 1;
        while (i <= baris) {
            j = baris;
            while (j >= 1) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j--;
            }

            k = 1;
            while (k <= baris) {
                if (k >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                k++;
            }

            System.out.println();
            i++;
        }

        i = 1;
        while (i <= baris) {
            j = 1;
            while (j <= baris) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }

            k = baris;
            while (k >= 1) {
                if (k <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Adjust spaces for formatting
                }
                k--;
            }

            System.out.println();
            i++;
        }
    }
}