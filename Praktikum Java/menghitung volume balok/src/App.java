import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Volume Balok");
        System.out.println("==========Bissmillah===========");

        // logic
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        hasil = panjang * lebar * tinggi;
        System.out.println(panjang + " x " + lebar + " x " + tinggi + " = " + hasil + " cm ");
        System.out.println("hasil volume balok adalah " + hasil + " cm ");
    }
}