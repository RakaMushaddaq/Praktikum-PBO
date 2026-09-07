package praktikum3;

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
        // Membuat object hewan dengan nama kucing
        Hewan kucing = new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan("Ica", 2);
        anjing.berlari();
    }
}
