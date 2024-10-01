/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts.afifatulukhrowiyah;

/**
 *
 * @author afifa
 */
public class ResponsiUTSAfifatulUkhrowiyah {

    public static void main(String[] args) {
        Produk Elektronik = new Elektronik("TV", 2000000, 1);
        Produk Makanan = new Makanan("Mie Instan", 3000, "25 November 2025");
        
        Pegawai PegawaiTetap = new PegawaiTetap("Intan", 2500000, 700000);
        Pegawai PegawaiKontrak = new PegawaiKontrak("Suci", 1500000, 9);
        
        System.out.println("===========================================");
        System.out.println("Informasi Produk");
        System.out.println();
        Elektronik.tampilkanInfo();
        System.out.println();
        Makanan.tampilkanInfo();
        System.out.println("===========================================");

        System.out.println();
        System.out.println("===========================================");
        System.out.println("Informasi Pegawai");
        System.out.println();
        PegawaiTetap.tampilkanInfo();
        System.out.println();
        PegawaiKontrak.tampilkanInfo();
        System.out.println("===========================================");
    }
}
