/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasPBO_4;

/**
 *
 * @author ACER
 */
public class MainTugas {
    public static void main(String[] args) {
        // 1. Buat objek dari kelas Pekerja dan inisialisasi
        Pekerja pekerja1 = new Pekerja("Raka", 20, "Software Engineer", 15000000);
        
        // 2. Tampilkan informasi pekerja menggunakan metode toString()
        System.out.println("=== Informasi Awal ===");
        System.out.println(pekerja1.toString());
        
        // 3. Ubah nama pekerja menggunakan setter dan tampilkan ulang
        pekerja1.setNama("Raka Mushaddaq");
        System.out.println("\n=== Informasi Setelah Ubah Nama ===");
        System.out.println(pekerja1.toString());
        
        System.out.println("\n===================================");
        
        // 4. Coba akses langsung atribut (Penjelasan ada di bawah)
        
        // pekerja1.nama = "Andi";      // Akan terjadi ERROR jika tanda komentar (//) dihapus
        
        // pekerja1.gaji = 20000000;    // Akan terjadi ERROR jika tanda komentar (//) dihapus
        
        pekerja1.usia = 21;             // BISA DIAKSES (Tidak Error) karena protected dan satu package
        System.out.println("Usia berhasil diakses langsung: " + pekerja1.usia);
    }  
}
