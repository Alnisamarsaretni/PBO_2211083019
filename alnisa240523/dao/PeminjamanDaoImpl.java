/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;
import java.sql.Connection;
import alnisa240523.model.Peminjaman;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
    Connection connection;
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    
    }
    
    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql="Insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
        
    }
    
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql="update peminjaman set Nobp=?, Kodebuku=?, tglpinjam=?, where tglkembali=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException{
        String sql="delete from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(String nobp) throws SQLException {
        String sql="select * from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    public List<Peminjaman>getAll() throws SQLException{
        String sql="select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman = null;
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> peminjamanList = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            peminjamanList.add(peminjaman);
        }
        return peminjamanList;
    }
}