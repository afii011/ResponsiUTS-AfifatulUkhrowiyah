/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.afifatulukhrowiyah;

/**
 *
 * @author afifa
 */
public class Produk {
    private String namaProduk;
    private double harga;
    
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk() {
        this.namaProduk = namaProduk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga() {
        this.harga = harga;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : " + harga);
    }
}
