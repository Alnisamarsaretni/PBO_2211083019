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
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman(){}
    
    public Peminjaman(String nobp, String kodebuku, String tglpinjam, String tglkembali){
        this.nobp = nobp;
        this.kodebuku = kodebuku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
        
    }
    
     public void setNobp(String nobp){
        this.nobp = nobp;
    }
    public void setKodebuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    public void setTglpinjam(String tglpinjam){
        this.tglpinjam = tglpinjam;
    }
    public void setTglkembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    
      public String getNobp(){
        return nobp;
    }
    public String getKodebuku(){
        return kodebuku;
    }
    public String getTglpinjam(){
        return tglpinjam;
    }
    public String getTglkembali(){
        return tglkembali;
    }
}