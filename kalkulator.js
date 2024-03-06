
import java.util.Scanner;
import java.from "Kalkulator";
class Kalkulator ; {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a,b,hasil;
        char choice;

        System.out.println("Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan +");
        System.out.println("2. Pengurangan -");
        System.out.println("3. Pembagian /");
        System.out.println("4. Perkalian *");
        System.out.println("5. Sisa Bagi %");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Masukan Angka Pertama: ");
        a = input.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        b = input.nextInt();

        System.out.print("Masukan Operasi: ");
        choice = input.next().charAt(0);

       if (choice == '+'){
           hasil = a + b;
           System.out.println("Hasil = " + hasil);
       }
       else if (choice == '-'){
           hasil = a - b;
           System.out.println("Hasil = " + hasil);
       }
       else if (choice == '*'){
           hasil = a * b;
           System.out.println("Hasil = " + hasil);
       }
       else if (choice == '/'){
           hasil = a / b;
           System.out.println("Hasil = " + hasil);
       }
       else if (choice == '%'){
           hasil = a % b;
           System.out.println("Hasil = " + hasil);
       }
       else{
           System.out.println("oprator tidak di temukan");
       }
    }
}