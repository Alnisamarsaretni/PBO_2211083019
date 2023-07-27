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
public class Buku {
    private String kodebuku;
    private String judulbuku;
    private String pengarang;
    private String penerbit;
    private String tahunterbit;
    
    public Buku(){}
    
    public Buku(String kodebuku, String judulbuku, String pengarang, String penerbit, String tahunterbit){
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunterbit = tahunterbit;
    }
    
     public void setKodebuku(String kodebuku){
        this.kodebuku = kodebuku;
    }
    public void setJudulbuku(String judulbuku){
        this.judulbuku = judulbuku;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    public void setTahunterbit(String tahunterbit){
        this.tahunterbit = tahunterbit;
    }
    
      public String getKodebuku(){
        return kodebuku;
    }
    public String getJudulbuku(){
        return judulbuku;
    }
    public String getPengarang(){
        return pengarang;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public String getTahunterbit(){
        return tahunterbit;
    }
}