import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, hasil;
        char choice;

        System.out.println("Kalkulator Sederehana Buatan Rafly");
        System.out.println("1. Penjumlahan +");
        System.out.println("2. Pengurangan -");
        System.out.println("3. Perkalaian *");
        System.out.println("4. Pembagian /");
        System.out.println("5. Sisa Bagi %");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Masukan Angka Pertama: ");
        a = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        b = input.nextInt();

        System.out.print("Masukan Oprasi: ");
        choice = input.next().charAt(0);

        if (choice == '+') {
            hasil = a + b;
            System.out.println("hasil = " + hasil);

        } else if (choice == '-') {
            hasil = a - b;
            System.out.println("hasil = " + hasil);

        } else if (choice == '*') {
            hasil = a * b;
            System.out.println("hasil = " + hasil);

        } else if (choice == '/') {
            hasil = a / b;
            System.out.println("hasil = " + hasil);

        } else if (choice == '%') {
            hasil = a % b;
            System.out.println("hasil = " + hasil);

        } else {
            System.out.println("Oprator Tidak Ditemukan");
        }
    }
}