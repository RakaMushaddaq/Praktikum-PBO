/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author ACER
 */
class KeranjangBelanja {
    Produk[] daftarProduk;
    int jumlahBarang;

    // Menentukan kapasitas maksimal array keranjang
    public KeranjangBelanja(int kapasitas) {
        daftarProduk = new Produk[kapasitas];
        jumlahBarang = 0;
    }

    public void tambahProduk(Produk p) {
        if (jumlahBarang < daftarProduk.length) {
            daftarProduk[jumlahBarang] = p;
            jumlahBarang++;
        } else {
            System.out.println("Keranjang sudah penuh!");
        }
    }

    public void hitungTotalSetelahDiskon() {
        double totalKeseluruhan = 0;
        System.out.println("=== Detail Keranjang Belanja ===");
        
        for (int i = 0; i < jumlahBarang; i++) {
            Produk p = daftarProduk[i];
            double diskon = p.hitungDiskon(); // Polimorfisme bekerja di sini
            double hargaNet = p.harga - diskon;
            totalKeseluruhan += hargaNet;
            
            System.out.println("Nama Produk : " + p.nama);
            System.out.println("Harga Asli  : Rp " + p.harga);
            System.out.println("Diskon      : Rp " + diskon);
            System.out.println("Harga Net   : Rp " + hargaNet);
            System.out.println("---------------------------------");
        }
        System.out.println("TOTAL BAYAR : Rp " + totalKeseluruhan);
    }
}

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(5);
        
        keranjang.tambahProduk(new Buku("Pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse Wireless", 150000));
        keranjang.tambahProduk(new Pakaian("Kemeja Polos", 200000));
        
        keranjang.hitungTotalSetelahDiskon();
    }
}
