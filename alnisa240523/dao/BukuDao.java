/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;
import alnisa240523.model.Buku;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku)throws SQLException;
    void delete(String nobp) throws SQLException;
    Buku getPeminjaman(String kodebuku)throws SQLException;
    
    public List<Buku>getAll()throws SQLException;
}