/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.controller;

import UTSB.model.Pesanan;
import UTSB.model.PesananDao;
import UTSB.view.FormPesanan;
import UTSB.view.FormPesanan;
import UTSB.model.PesananDaoImpl;
import UTSB.model.Pesanan;
import UTSB.model.Pesanan;
import alnisa260403.model.AnggotaDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author LENOVO
 */
public class PesananController {
    private FormPesanan formPesanan;
    private Pesanan pesanan;
    private PesananDao pesananDao;
    
    public PesananController(FormPesanan formPesanan) {
       this.formPesanan = formPesanan;
       pesananDao = new AnggotaDaoImpl();
    }
    
    public void bersihForm() {
        formPesanan.getTxtkodePesanan().setText("");
        formPesanan.getTxtnamaPemesan().setText("");
        formPesanan.getTxttglPesan().setText("");
        formPesanan.getTxtharga().setText("");
        formPesanan.getTxtongkosKirim().setText("");
        formPesanan.getTxtdiskon().setText("");
    }
    
    public void savePesanan() {
        pesanan = new Pesanan();
        pesanan.setkodePesanan(formPesanan.getTxtkodePesanan().getText());
        pesanan.setnamaPemesan(formPesanan.getTxtnamaPemesan().getText());
        pesanan.settglPesan(formPesanan.getTxtPesanan().getText());
        pesanan.setharga(formPesanan.getTxtPesanan().getText());
        pesanan.setongkosKirim(formPesanan.getTxtPesanan().getText());
        pesanan.setdikirim(formPesanan.getTxtPesanan().getText());
        pesananDao.save(pesanan);
        JOptionPane.showMessageDialog(formAnggota, "Insert Ok");
        
        public void tampil() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        List<Pesanan> list = pesananDao.getAllPesanan();
        for (Pesanan pesanan1 : list) {
            Object row[] = {
                pesanan1.getkodePesanan(),
                pesanan1.getnamaPemesan(),
                pesanan1.gettglPesanan(),
                pesanan1.getharga(),
                pesanan1.getongkosKirim(),
                pesanan1.getdikirim(),
            };
            tabelModel.addRow(row);
        }
    }
  }
    
}