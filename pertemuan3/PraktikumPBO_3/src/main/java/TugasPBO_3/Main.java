package TugasPBO_3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // 4. Ciptakan dua object dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2022, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2023, "Putih");
        
        // 5. Tampilkan informasi kedua object
        mobil1.displayInfo();
        mobil2.displayInfo();
        
        // 6. Panggil method startEngine pada setiap object
        mobil1.startEngine();
        mobil2.startEngine();
        
        System.out.println("\n=== Proses Modifikasi Warna ===");
        
        // 8. Mengubah warna mobil dan tampilkan perubahannya
        mobil1.setWarna("Merah Merona"); // Memanggil method untuk mengubah warna
        
        // Memanggil displayInfo lagi untuk melihat perubahannya
        System.out.println("Info mobil1 setelah di-cat ulang:");
        mobil1.displayInfo();
    }
    
}
