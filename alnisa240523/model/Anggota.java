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
public class Anggota {
    private String nobp;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    
    public Anggota() {
    }
    
    public Anggota (String nobp, String nama, String alamat, String jenisKelamin) {
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void setNobp(String nobp) {
        this.nobp = nobp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void setjenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getJenisKelamin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNobp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setJenisKelamin(String l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
