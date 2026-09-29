/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen;

/**
 *
 * @author ACER
 */
// 1. KELAS INDUK PRODUK
public class Produk {
    private String namaProduk;
    private int harga; // Diubah jadi int agar output tidak ada desimal (misal 15000000.0)

    public Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }
    public int getHarga() { return harga; }
    public void setHarga(int harga) { this.harga = harga; }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }
}

// 2. TURUNAN PRODUK: ELEKTRONIK
class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil print Nama & Harga dari induk
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

// 3. TURUNAN PRODUK: MAKANAN
class Makanan extends Produk {
    private String tanggalKadaluarsa;

    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil print Nama & Harga dari induk
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}