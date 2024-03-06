package com.mycompany.guioop;

import javax.swing.*;
import java.awt.event.ActionEvent;

class Produk {
    private final String nama;
    private final int harga;

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
    final Produk[] produk;
    private final int[] jumlah;
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
        }
    }

    public String getRingkasan() {
        StringBuilder ringkasan = new StringBuilder("\nRingkasan Yang Dibeli Anda :\n");
        for (int i = 0; i < produk.length; i++) {
            if (jumlah[i] > 0) {
                ringkasan.append(produk[i].getNama()).append(" - ").append(jumlah[i]).append(" pcs - Rp ")
                        .append(produk[i].getHarga() * jumlah[i]).append("\n");
            }
        }
        ringkasan.append("Total Harga Belanja Anda Adalah : Rp ").append(total);
        return ringkasan.toString();
    }
}

public class AplikasiKeranjangBelanjaGUI {
    public static void main(String[] args) {
        Produk[] produk = {
                new Produk("Beras (1 Liter)", 10000),
                new Produk("Mie Instan (1 Bungkus)", 3500),
                new Produk("Saus (1 Botol)", 10500)
        };

        KeranjangBelanja keranjang = new KeranjangBelanja(produk);

        JFrame frame = new JFrame("Ujang Sembaqo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 330);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel, keranjang);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel, KeranjangBelanja keranjang) {
        panel.setLayout(null);

        JLabel text = new JLabel("1. Beras 10000 (1 Liter)");
        text.setBounds(10, 10, 200, 25);
        panel.add(text);

        JLabel text1 = new JLabel("2. Mie Instan 3500 (1 Bungkus)");
        text1.setBounds(10, 25, 200, 25);
        panel.add(text1);

        JLabel text2 = new JLabel("3. Saus 10500 (1 Botol)");
        text2.setBounds(10, 40, 200, 25);
        panel.add(text2);

        JLabel label = new JLabel("Pilih produk (1 - " + keranjang.produk.length + ") :");
        label.setBounds(10, 60, 200, 25);
        panel.add(label);

        JTextField pilihanText = new JTextField(40);
        pilihanText.setBounds(230, 60, 80, 25);
        panel.add(pilihanText);

        JLabel jumlahLabel = new JLabel("Jumlah yang ingin dibeli :");
        jumlahLabel.setBounds(10, 85, 200, 25);
        panel.add(jumlahLabel);

        JTextField jumlahText = new JTextField(50);
        jumlahText.setBounds(230, 85, 80, 25);
        panel.add(jumlahText);

        JButton tambahButton = new JButton("Tambah ke Keranjang");
        tambahButton.setBounds(10, 115, 200, 25);
        panel.add(tambahButton);

        JTextArea ringkasanArea = new JTextArea();
        ringkasanArea.setBounds(10, 160, 300, 100);
        panel.add(ringkasanArea);

        tambahButton.addActionListener((ActionEvent e) -> {
            int pilihan = Integer.parseInt(pilihanText.getText()) - 1;
            int jumlah = Integer.parseInt(jumlahText.getText());
            
            keranjang.tambahKeKeranjang(pilihan, jumlah);
            ringkasanArea.setText(keranjang.getRingkasan());
        });
    }
}