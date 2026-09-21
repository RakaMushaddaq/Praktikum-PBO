/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ACER
 */
class Hewan {
    String nama;
    String jenis;

    public void tampilkanInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas Turunan 1: Kucing
class Kucing extends Hewan {
    // Metode khusus Kucing
    public void suara() {
        System.out.println("Suara: Miaw miaw");
    }

    // Melakukan overriding dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() milik Hewan
        suara();               // Memanggil metode suara() di atas
    }
}

// Kelas Turunan 2: Anjing
class Anjing extends Hewan {
    // Metode khusus Anjing
    public void suara() {
        System.out.println("Suara: Guk guk");
    }

    // Melakukan overriding dari kelas induk
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() milik Hewan
        suara();               // Memanggil metode suara() di atas
    }
}

// KELAS UTAMA
public class TugasHewan {
    public static void main(String[] args) {
        System.out.println("=== Informasi Kucing ===");
        Kucing kucingKu = new Kucing();
        kucingKu.nama = "Tom";
        kucingKu.jenis = "Mamalia";
        kucingKu.tampilkanInfo(); // Otomatis nge-print nama, jenis, dan suara

        System.out.println("\n=== Informasi Anjing ===");
        Anjing anjingKu = new Anjing();
        anjingKu.nama = "Spike";
        anjingKu.jenis = "Mamalia";
        anjingKu.tampilkanInfo(); 
    }
}