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
public class PeminjamanController {
    FormPeminjaman formPeminjaman;
    Peminjaman peminjaman;
    PeminjamanDao dao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman) throws SQLException {
        this.formPeminjaman = formPeminjaman;
        try {
            dao = new PeminjamanDaoImpl(DataBaseHelper.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseHelper.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void clearForm() {
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtKodebuku().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
        formPeminjaman.getTxtTglpinjam().setText("");
    }
    
    public void insert(){
        try {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
            peminjaman.setKodebuku(formPeminjaman.getTxtKodebuku().getText());
            peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
            peminjaman.setTglkembali(formPeminjaman.getTxtTglpinjam().getText());
            dao.insert(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
        }
    }
    
    public void tampilTabel(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for (Peminjaman peminjaman1 : list){
                Object [] row = {
                    peminjaman1.getNobp(),
                    peminjaman1.getKodebuku(),
                    peminjaman1.getTglpinjam(),
                    peminjaman1.getTglkembali(),
                };
                tabelModel.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getPeminjaman(){
        try {
            String nobp = formPeminjaman.getTblPeminjaman().getValueAt(formPeminjaman.getTblPeminjaman()
                    .getSelectedRow(),0).toString();
            peminjaman = dao.getPeminjaman(nobp);
            if(peminjaman != null){
                formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
                formPeminjaman.getTxtKodebuku().setText(peminjaman.getKodebuku());
                formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
                formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(){
        try {
            peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
            peminjaman.setKodebuku(formPeminjaman.getTxtKodebuku().getText());
            peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
            peminjaman.setTglkembali(formPeminjaman.getTxtTglkembali().getText());
            dao.update(peminjaman);
            JOptionPane.showMessageDialog(formPeminjaman, "Entri Data Ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
        }
    }
    
    public void delete(){
        try {
            String Nobp = formPeminjaman.getTxtNobp().getText();
            dao.delete(Nobp);
            JOptionPane.showMessageDialog(formPeminjaman, "Delete Data OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(formPeminjaman, ex.getMessage());
        }
    }
    
   
}