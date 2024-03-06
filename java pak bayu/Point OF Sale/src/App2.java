import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = { "Beras (1 Liter)", "Mie Instan (1 Bungkus)", "Saus (1 Botol)" };
        int[] prices = { 10000, 3500, 10500 };

        int[] quantities = new int[products.length];
        int total = 00;
        System.out.println();
        System.out.println("Daftar Produk :");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " = Rp " + prices[i]);
        }

        char anotherTransaction;
        do {
            System.out.print("\nPilih produk (1-" + products.length + ") : ");
            int choice = scanner.nextInt() - 1;

            if (choice >= 0 && choice < products.length) {
                System.out.print("Jumlah yang ingin dibeli : ");
                int quantity = scanner.nextInt();

                int subtotal = prices[choice] * quantity;
                total += subtotal;

                quantities[choice] += quantity;

                System.out.println("Totalnya : Rp " + subtotal);
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Mau Di Tambah Barang Lain Kak? (y/n) : ");
            anotherTransaction = scanner.next().charAt(0);
        } while (anotherTransaction == 'y');

        System.out.println("\nRingkasan Yang Dibeli Anda :");
        for (int i = 0; i < products.length; i++) {
            if (quantities[i] > 0) {
                System.out.println(products[i] + " - " + quantities[i] + " pcs - Rp " + (prices[i] * quantities[i]));
            }
        }
        System.out.println("Total Harga Belanja Anda Adalah : Rp " + total);
        scanner.close();
        System.out.println();
    }
}