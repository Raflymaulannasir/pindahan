import java.util.Scanner;

public class Rafly
M Pak Bayu.java
{

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        int pilihan, bilangan1, bilangan2;

        System.out.println("1. Aritmatika");
        System.out.println("2. Increment dan Decrement");
        System.out.println("3. Relasi");
        System.out.println("4. logika");
        System.out.print("Masukan pilihan anda : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Aritmatika");
                System.out.print("masukan bilangan 1 : ");
                bilangan1 = input.nextInt();
                System.out.print("masukan bilangan 2 : ");
                bilangan2 = input.nextInt();

                System.out.print(bilangan1 + "+" + bilangan2 + "=");
                System.out.println(bilangan1 + bilangan2);
                System.out.print(bilangan1 + "-" + bilangan2 + "=");
                System.out.println(bilangan1 - bilangan2);
                System.out.print(bilangan1 + "x" + bilangan2 + "=");
                System.out.println(bilangan1 * bilangan2);
                System.out.print(bilangan1 + ":" + bilangan2 + "=");
                System.out.println(bilangan1 / bilangan2);
                System.out.print(bilangan1 + "%" + bilangan2 + "=");
                System.out.println(bilangan1 % bilangan2);
                break;
            case 2:
                System.out.println("Increment dan Decrement");
                System.out.print("masukan bilangan pertama increment : ");
                bilangan1 = input.nextInt();
                System.out.print("masukan bilangan kedua decrement : ");
                bilangan2 = input.nextInt();

                System.out.print(bilangan1++ + " increment =");
                System.out.println(bilangan1);
                System.out.print(bilangan2-- + " decrement =");
                System.out.println(bilangan2);
                break;
            case 3:
                System.out.println("Relasi");
                System.out.print("Masukan bilangan pertama : ");
                bilangan1 = input.nextInt();
                System.out.print("Masukan bilangan kedua : ");
                bilangan2 = input.nextInt();
                input.close();

                System.out.print(bilangan1 + ">" + bilangan2 + "= ");
                System.out.println(bilangan1 > bilangan2);
                System.out.print(bilangan1 + ">=" + bilangan2 + "= ");
                System.out.println(bilangan1 >= bilangan2);
                System.out.print(bilangan1 + "<" + bilangan2 + "= ");
                System.out.println(bilangan1 < bilangan2);
                System.out.print(bilangan1 + "<=" + bilangan2 + "= ");
                System.out.println(bilangan1 <= bilangan2);
                System.out.print(bilangan1 + "==" + bilangan2 + "= ");
                System.out.println(bilangan1 == bilangan2);
                break;
            case 4:
                System.out.println("Logika");
                boolean benar, salah;
                benar = true;
                salah = false;

                System.out.println("benar && salah adalah " + (benar && salah));
                System.out.println("benar || salah adalah " + (benar || salah));
                System.out.println("benar ! salah adalah " + !(benar && salah));
                break;
            default:
                System.out.println("Yang anda masukan salah");
        }

    }
}
