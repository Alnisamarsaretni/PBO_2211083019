/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.model;

import alnisa260403.model.Anggota;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface PesananDao {
    Pesanan save(Pesanan pesanan);
    Pesanan update(int index, Pesanan pesanan);
    void delete (int index);
    Pesanan getPesanan (int index);
    List<Pesanan> getAllPesanan();
}
