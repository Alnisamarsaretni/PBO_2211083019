/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.dao;
import java.sql.Connection;
import alnisa240523.model.Buku;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class BukuDaoImpl implements BukuDao{
    
    Connection connection;
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    
    }
    
    public void insert(Buku buku) throws SQLException {
        String sql="Insert into buku values (?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getTahunterbit());
        ps.executeUpdate();
        
    }
    
    public void update(Buku buku) throws SQLException {
        String sql="update buku set Kodebuku=?, Judulbuku=?, Pengarang=?, Penerbit=?, where Tahunterbit=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getTahunterbit());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException{
        String sql="delete from buku where Kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Buku getBuku(String nobp) throws SQLException {
        String sql="select * from buku where Kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunterbit(rs.getString(5));
        }
        return buku;
    }
    public List<Buku>getAll() throws SQLException{
        String sql="select * from buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        List<Buku> bukuList = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            buku.setTahunterbit(rs.getString(4));
            bukuList.add(buku);
        }
        return bukuList;
    }

    @Override
    public Buku getPeminjaman(String kodebuku) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}