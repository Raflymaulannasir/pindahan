/*Rafly Maulannasir
  301230031
  INFORMATIKA 1A
*/
  
import java.util.Scanner;

class Produk {
    private String nama;
    private int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
}

class KeranjangBelanja {
    private Produk[] produk;
    private int[] jumlah;
    private int total;

    public KeranjangBelanja(Produk[] produk) {
        this.produk = produk;
        this.jumlah = new int[produk.length];
        this.total = 0;
    }

    public void tampilkanDaftarProduk() {
        System.out.println("Daftar Produk :");
        for (int i = 0; i < produk.length; i++) {
            System.out.println(i + 1 + ". " + produk[i].getNama() + " = Rp " + produk[i].getHarga());
        }
    }

    public void tambahKeKeranjang(int pilihan, int jumlah) {
        if (pilihan >= 0 && pilihan < produk.length) {
            int subtotal = produk[pilihan].getHarga() * jumlah;
            total += subtotal;
            this.jumlah[pilihan] += jumlah;
            System.out.println("Totalnya : Rp " + subtotal);
        } 
        else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public void tampilkanRingkasan() {
        System.out.println("\nRingkasan Yang Dibeli Anda :");
        for (int i = 0; i < produk.length; i++) {
            if (jumlah[i] > 0) {
                System.out.println(produk[i].getNama() + " - " + jumlah[i] + " pcs - Rp " + (produk[i].getHarga() * jumlah[i]));
            }
        }
        System.out.println("Total Harga Belanja Anda Adalah : Rp " + total);
    }
}

public class App8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produk[] produk = {
                new Produk("Beras (1 Liter)", 10000),
                new Produk("Mie Instan (1 Bungkus)", 3500),
                new Produk("Saus (1 Botol)", 10500)
        };

        KeranjangBelanja keranjang = new KeranjangBelanja(produk);

        System.out.println();
        keranjang.tampilkanDaftarProduk();

        char transaksiLain;
        do {
            System.out.print("\nPilih produk (1-" + produk.length + ") : ");
            int pilihan = scanner.nextInt() - 1;

            System.out.print("Jumlah yang ingin dibeli : ");
            int jumlah = scanner.nextInt();

            keranjang.tambahKeKeranjang(pilihan, jumlah);

            System.out.print("Mau Ditambah Barang Lain Kak? (y/n) : ");
            transaksiLain = scanner.next().charAt(0);
        } 
        while
        (transaksiLain == 'y');

        keranjang.tampilkanRingkasan();
        scanner.close();
        System.out.println();
    }
}
