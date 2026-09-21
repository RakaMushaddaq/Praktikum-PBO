package praktikum5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
// Level 1: Kelas Induk Paling Atas
class KendaraanTugas {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Level 2: Kelas Menengah (Mewarisi KendaraanTugas)
class KendaraanDaratTugas extends KendaraanTugas {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}

// Level 3: Kelas Turunan Paling Bawah (Mewarisi KendaraanDaratTugas)
class MobilTugas extends KendaraanDaratTugas {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Level 3: Kelas Turunan Paling Bawah (Mewarisi KendaraanDaratTugas)
class SepedaMotorTugas extends KendaraanDaratTugas {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

// KELAS UTAMA
public class TugasKendaraan {
    public static void main(String[] args) {
        System.out.println("=== Spesifikasi Mobil ===");
        // Menggunakan class MobilTugas yang baru
        MobilTugas mobilKu = new MobilTugas();
        mobilKu.nama = "Toyota Avanza";
        mobilKu.kecepatan = 150;
        mobilKu.jumlahRoda = 4;
        mobilKu.jumlahPintu = 4;
        mobilKu.tampilkanInfo(); 

        System.out.println("\n=== Spesifikasi Sepeda Motor ===");
        // Menggunakan class SepedaMotorTugas yang baru
        SepedaMotorTugas motorKu = new SepedaMotorTugas();
        motorKu.nama = "Yamaha NMAX";
        motorKu.kecepatan = 110;
        motorKu.jumlahRoda = 2;
        motorKu.jenisMesin = "4-Tak";
        motorKu.tampilkanInfo();
    }
}
