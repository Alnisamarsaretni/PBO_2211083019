/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;
import alnisa240523.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman)throws SQLException;
    void delete(String nobp) throws SQLException;
    Peminjaman getPeminjaman(String nobp)throws SQLException;
    
    public List<Peminjaman>getAll()throws SQLException;
}
