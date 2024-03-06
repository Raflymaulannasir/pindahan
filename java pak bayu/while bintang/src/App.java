public class App {
    public static void main(String[] args) throws Exception {
        int i, j, k, l;
        System.out.println("nomor 1");
        System.out.println();
        i = 1;
        while (i <= 6) {
            j = 1;
            while (j <= 6) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= 6) {
            j = 1;
            while (j <= 10) {
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= 6) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= 6) {
            j = 1;
            while (j <= 20) {
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= 6) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("====================================");
        System.out.println("nomor 2");
        System.out.println();
        i = 1;
        while (i <= 5) {
            j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            k = 1;
            while (k <= 6) {
                System.out.print(" ");
                k++;
            }
            l = 1;
            while (l <= 5) {
                System.out.print("* ");
                l++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= 5) {
            j = 1;
            while (j <= 8) {
                System.out.print(" ");
                j++;
            }
            k = 1;
            while (k <= 5) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= 5) {
            j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            k = 1;
            while (k <= 6) {
                System.out.print(" ");
                k++;
            }
            l = 1;
            while (l <= 5) {
                System.out.print("* ");
                l++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println("nomor 3");
        System.out.println();
        i = 1;
        while (i <= 7) {
            j = 1;
            while (j <= 4) {
                System.out.print("* ");
                j++;
            }
            k = 1;
            while (k <= 6) {
                System.out.print(" ");
                k++;
            }
            l = 1;
            while (l <= 4) {
                System.out.print("* ");
                l++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println("nomor 4");
        System.out.println();
        i = 1;
        while (i <= 3) {
            j = 1;
            while (j <= 3) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        i = 1;
        while (i <= 3) {
            j = 1;
            while (j <= 8) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        System.out.println("======================================");
        System.out.println("nomor 5");
        System.out.println();
        int baris = 4;
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
                    System.out.print("  ");
                }
                k--;
            }
            System.out.println();
            i++;
        }
    }
}