/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_6;

/**
 *
 * @author ACER
 */
class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.10; // Diskon 10%
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.20; // Diskon 20%
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    @Override
    public double hitungDiskon() {
        return harga * 0.15; // Diskon 15%
    }
}

// NetBeans mewajibkan ada satu public class yang namanya sama dengan nama file
public class TurunanProduk {
    // Biarkan kosong saja
}


