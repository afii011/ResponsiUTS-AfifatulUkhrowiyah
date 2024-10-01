/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.afifatulukhrowiyah;

/**
 *
 * @author afifa
 */
public class Makanan extends Produk {
    private String tglKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tglKadaluarsa) {
        super(namaProduk, harga);
        this.tglKadaluarsa = tglKadaluarsa;
    }
    public String getTglKadaluarsa() {
        return tglKadaluarsa;
    }
    public void setTglKadaluarsa() {
        this.tglKadaluarsa = tglKadaluarsa;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa : " + tglKadaluarsa);
    }
}
