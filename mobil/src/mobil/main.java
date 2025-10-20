/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;

public class main {
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Civic";
        mobil1.model = "mercy";
        mobil1.tahunPembuatan = 2022;

        // 3. Buat objek kedua
        Mobil mobil2 = new Mobil();
        mobil2.merk = "Suzuki";
        mobil2.model = "HRV";
        mobil2.tahunPembuatan = 2021;

        // Tampilkan informasi kedua mobil
        mobil1.infoMobil();
        mobil2.infoMobil();
    }
}