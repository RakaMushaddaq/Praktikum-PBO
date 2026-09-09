/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ACER
 */
public class Praktikum_PBO4 {
public static void main(String[] args) {
        // Membuat objek dari subclass Mobil (mewarisi class Kendaraan)
        // Parameter: (nama, kecepatanMaks, jenisMesin, jumlahPintu)
        Mobil mobilKu = new Mobil("Toyota Avanza", 180, "Bensin", 4);
    
// Menampilkan informasi menggunakan method dari class Mobil & Kendaraan
        mobilKu.tampilkanInfoKendaraan();
        mobilKu.tampilkanInfoMobil();
    }
}
