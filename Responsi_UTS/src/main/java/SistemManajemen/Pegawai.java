/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemManajemen;

/**
 *
 * @author ACER
 */
// 1. KELAS INDUK PEGAWAI
public class Pegawai {
    private String namaPegawai;
    private int gaji; // Diubah jadi int agar output tidak ada desimal

    public Pegawai(String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }

    public String getNamaPegawai() { return namaPegawai; }
    public void setNamaPegawai(String namaPegawai) { this.namaPegawai = namaPegawai; }
    public int getGaji() { return gaji; }
    public void setGaji(int gaji) { this.gaji = gaji; }

    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
}

// 2. TURUNAN PEGAWAI: PEGAWAI TETAP
class PegawaiTetap extends Pegawai {
    private int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil print Nama & Gaji dari induk
        System.out.println("Tunjangan: " + tunjangan);
    }
}

// 3. TURUNAN PEGAWAI: PEGAWAI KONTRAK
class PegawaiKontrak extends Pegawai {
    private int lamaKontrak; // dalam bulan

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil print Nama & Gaji dari induk
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}