/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;

import alnisa240523.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface PengembalianDao {
    void insert (Pengembalian peminjaman) throws SQLException;
    void update(Pengembalian peminjaman)throws SQLException;
    void delete(Pengembalian peminjaman)throws SQLException;
    Pengembalian getPengembalian(String nobp, String kodeBuku, String tglDikembalikan, int terlambat, double denda)throws SQLException;
    List<Pengembalian> getAll()throws SQLException;   
    int seliihTanggal (String tgl1, String tgl2) throws Exception;
}