/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;
import alnisa240523.model.*;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author LENOVO
 */
public interface AnggotaDao {
    void insert(Anggota anggota)throws SQLException;
    void update(Anggota anggota)throws SQLException;
    void delete (String nobp)throws SQLException;
    Anggota getAnggota (String nobp) throws SQLException;
    List<Anggota> getAll() throws SQLException;
}