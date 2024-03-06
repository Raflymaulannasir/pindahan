import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public void tambahKeKeranjang(int pilihan, int jumlah) {
        if (pilihan >= 0 && pilihan < produk.length) {
            int subtotal = produk[pilihan].getHarga() * jumlah;
            total += subtotal;
            this.jumlah[pilihan] += jumlah;
            System.out.println("Totalnya : Rp " + subtotal);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public String getRingkasan() {
        StringBuilder ringkasan = new StringBuilder("\nRingkasan Pembelian Anda :\n");
        for (int i = 0; i < produk.length; i++) {
            if (jumlah[i] > 0) {
                ringkasan.append(produk[i].getNama()).append(" - ").append(jumlah[i]).append(" pcs - Rp ").append(produk[i].getHarga() * jumlah[i]).append("\n");
            }
        }
        ringkasan.append("Total Harga Belanja Anda : Rp ").append(total);
        return ringkasan.toString();
    }
}

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RaflyShopp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        Produk[] produk = {
                new Produk("Beras (1 Liter)", 10000),
                new Produk("Mie Instan (1 Bungkus)", 3500),
                new Produk("Saus (1 Botol)", 10500)
        };

        KeranjangBelanja keranjang = new KeranjangBelanja(produk);

        for (int i = 0; i < produk.length; i++) {
            JButton button = new JButton(produk[i].getNama() + " - Rp " + produk[i].getHarga());
            int finalI = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String input = JOptionPane.showInputDialog("Jumlah yang ingin dibeli untuk " + produk[finalI].getNama());
                    int jumlah = Integer.parseInt(input);
                    keranjang.tambahKeKeranjang(finalI, jumlah);
                }
            });
            panel.add(button);
        }

        JButton ringkasanButton = new JButton("Tampilkan Ringkasan");
        ringkasanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, keranjang.getRingkasan(), "Ringkasan Pembelian", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        panel.add(ringkasanButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
