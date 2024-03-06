import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        float V = (float) 3.14;
        int jari_jari, tinggi;
        float volume;

        System.out.print("masukan jari-jari anda \t: ");
        jari_jari = input.nextInt();

        System.out.print("masukan tinggi anda \t: ");
        tinggi = input.nextInt();

        volume = (float) V * jari_jari * jari_jari * tinggi;

        System.out.println(V + " X " + jari_jari + " X " + jari_jari + " X " + tinggi + " = " + volume);
        System.out.println("Hasilnya Adalah" + " = " + volume);
    }
}
