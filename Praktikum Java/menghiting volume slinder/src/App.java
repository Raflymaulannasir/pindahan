import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        int lebar = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();

        int volume = panjang * lebar * tinggi;

        System.out.println("Volume Balok = " + volume);

        input.close();
    }
}
