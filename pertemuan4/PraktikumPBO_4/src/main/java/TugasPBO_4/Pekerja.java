/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_4;

/**
 *
 * @author ACER
 */
public class Pekerja extends Manusia {
    // Atribut tambahan
    private double gaji;
    
    // Constructor memanggil atribut induk (super) dan atribut sendiri
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor class Manusia
        this.gaji = gaji;
    }
    
    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }
    
    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Override method toString untuk menampilkan semua info
    @Override
    public String toString() {
        // Memanggil getNama() karena atribut nama bersifat private di class induk
        return "Nama      : " + getNama() + "\n" +
               "Usia      : " + usia + " Tahun\n" +
               "Pekerjaan : " + pekerjaan + "\n" +
               "Gaji      : Rp " + gaji;
    }
}
