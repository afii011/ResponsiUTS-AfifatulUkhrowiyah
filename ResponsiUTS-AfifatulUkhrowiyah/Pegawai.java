/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.afifatulukhrowiyah;

/**
 *
 * @author afifa
 */
public class Pegawai {
    private String namaPegawai;
    double gaji;
    
    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai() {
        this.namaPegawai = namaPegawai;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji() {
        this.gaji = gaji;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji : " + gaji);
    }
}
