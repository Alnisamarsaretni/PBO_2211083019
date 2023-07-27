/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.controller;
import alnisa240523.DataBase.DataBaseHelper;
import alnisa240523.dao.*;
import alnisa240523.model.*;
import alnisa240523.view.*;
import alnisa240523.database.*;
import alnisa270423.view.FormBuku;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class BukuController {
    FormBuku formBuku;
    Buku buku;
    BukuDao dao;
    
    public BukuController(FormBuku formBuku) throws SQLException {
        this.formBuku = formBuku;
        try {
            dao = new BukuDaoImpl(DataBaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHelper.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void clearForm() {
        formBuku.getTxtKodebuku().setText("");
        formBuku.getTxtJudulBuku().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahunterbit().setText("");
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodebuku(formBuku.getTxtKodebuku().getText());
            buku.setJudulbuku(formBuku.getTxtJudulbuku().getText());
            buku.setPengarang(formBuku.getTxtPengarang().getText());
            buku.setPenerbit(formBuku.getTxtPenerbit().getText());
            buku.setTahunterbit(formBuku.getTxtTahunterbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(formBuku, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formBuku, ex.getMessage());
        }
    }
    
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formBuku.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku buku1 : list){
                Object [] row = {
                    buku1.getKodebuku(),
                    buku1.getJudulbuku(),
                    buku1.getPengarang(),
                    buku1.getPenerbit(),
                    buku1.getTahunterbit(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getBuku(){
        try {
            String kodebuku = formBuku.getTblPeminjaman().getValueAt(formBuku.getTblBuku()
                    .getSelectedRow(),0).toString();
            buku = dao.getPeminjaman(kodebuku);
            if(buku != null){
                formBuku.getTxtKodebuku().setText(buku.getKodebuku());
                formBuku.getTxtJudulbuku().setText(buku.getJudulbuku());
                formBuku.getTxtPengarang().setText(buku.getPengarang());
                formBuku.getTxtPenerbit().setText(buku.getPenerbit());
                formBuku.getTxtTahunterbit().setText(buku.getTahunterbit());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            buku.setKodebuku(formBuku.getTxtKodebuku().getText());
            buku.setJudulbuku(formBuku.getTxtJudulbuku().getText());
            buku.setPengarang(formBuku.getTxtPengarang().getText());
            buku.setPenerbit(formBuku.getTxtPenerbit().getText());
            buku.setTahunterbit(formBuku.getTxtTahunterbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(formBuku, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formBuku, ex.getMessage());
        }
    }
    
    public void delete(){
        try {
            String Kodebuku = formBuku.getTxtKodebuku().getText();
            dao.delete(Kodebuku);
            JOptionPane.showMessageDialog(formBuku, "Delete Data OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formBuku, ex.getMessage());
        }
    }
    
   
}