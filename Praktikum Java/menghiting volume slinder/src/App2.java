import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        int lebar = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();
        int volume = panjang * lebar * tinggi;

        System.out.println("Hasil Volume Balok Adalah = " + volume);
        System.out.println("Terjadi kesalahan saat membaca input.");
        return;
    }
}