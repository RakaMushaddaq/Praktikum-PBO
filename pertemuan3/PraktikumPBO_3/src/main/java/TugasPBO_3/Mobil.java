/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_3;

/**
 *
 * @author ACER
 */
public class Mobil {
        // 1 & 7. Atribut (ditambah atribut warna)
    // Menggunakan 'private' karena kita akan memakai method getter dan setter
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    // 2. Constructor yang menerima nilai atribut
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    // 5. Method Getter dan Setter untuk setiap atribut
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }
    
    public String getWarna() { return warna; }
    // 8. Method untuk mengubah warna mobil (ini pada dasarnya adalah setter warna)
    public void setWarna(String warna) { this.warna = warna; }
    
    // 3. Method displayInfo()
    public void displayInfo() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
        System.out.println("Warna : " + warna);
        System.out.println("-------------------------");
    }
    // 6. Method startEngine()
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " menyala.");
    }    
}
