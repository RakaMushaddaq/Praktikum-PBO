/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemManajemen;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("1. Output Produk\n");
        // Membuat objek turunan Elektronik
        Elektronik produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();
        
        System.out.println("\n2. Output Pegawai\n");
        // Membuat objek turunan PegawaiTetap (Sesuai instruksi, menggunakan nama kamu)
        PegawaiTetap pegawai1 = new PegawaiTetap("Raka", 5000000, 1000000);
        pegawai1.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme\n");
        // Implementasi polimorfisme: Induk menampung objek Anak
        Produk produkPoli = new Makanan("Snack", 15000, "2026-02-19");
        Pegawai pegawaiPoli = new PegawaiKontrak("Dewi", 3000000, 12);
        
        // Memanggil metode secara polimorfik
        produkPoli.tampilkanInfo();
        System.out.println(); // Spasi antar output
        pegawaiPoli.tampilkanInfo();
    }
}
