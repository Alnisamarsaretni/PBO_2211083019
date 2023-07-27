/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.model;

/**
 *
 * @author LENOVO
 */
public class Pengembalian {
     private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;
    
    public Pengembalian() {
        
    }
    
    public Pengembalian(String nobp, String kodeBuku, String tglPinjam, String tglDikembalikan, int terlambat, double denda) {
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
        
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglDikembalikan;
    }

    public void setTglKembali(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }
}
