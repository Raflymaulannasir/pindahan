public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nama    :Rafly Maulannasir");
        System.out.println("NIM     :301230031");
        System.out.println("Kelas   :1A");
        System.out.println();
        
        int  baris, kolom, i, j;
        System.out.println("nomor 1");
        baris = 5;
        do {
            kolom = 0;
            do {
                System.out.print(kolom + "");
                kolom++;
            } while (kolom <= baris);
            System.out.println();
            baris--;
        } while (baris >= 0);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("nomor 2");

        i = 0;
        do {
            j = 0;
            do {
                System.out.print(j + "");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("nomor 3");
        i = 0;
        do {
            j = 5;
            do {
                System.out.print(j + "");
                j--;
            } while (j >= i);
            System.out.println();
            i++;
        } while (i <= 5);
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("nomor 4");
        i = 5;
        do {
            j = 5;
            do {
                System.out.print(j + "");
                j--;
            } while (j >= i);
            System.out.println();
            i--;
        } while (i >= 0);

    }
}