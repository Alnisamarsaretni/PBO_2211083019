/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.model;

/**
 *
 * @author LENOVO
 */
public class Pesanan {
    private String kodePesanan;
    private String namaPemesan;
    private String tglPesanan;
    private String harga;
    private String ongkosKirim;
    private String diskon;
    
    public Pesanan() {
          
    }
    
    public Pesanan(String kodePesanan, String namaPemesan, String tglPemesan, String harga, String ongkosKirim, String diskon) {
        this.kodePesanan = kodePesanan;
        this.namaPemesan = namaPemesan;
        this.tglPesanan = tglPesanan;
        this.harga = harga;
        this.ongkosKirim = ongkosKirim;
        this.diskon = diskon;
    }
    
    public String getkodePesanan() {
        return kodePesanan;
    }
    
    public String getnamaPemesan() {
        return namaPemesan;
    }
    
    public String gettglPesanan() {
        return tglPesanan;
    }
    
    public String getharga() {
        return harga;
    }
    
    public String getongkosKirim() {
        return ongkosKirim;
    }
    
    public String getdiskon() {
        return diskon;
    }
}
