/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa240523.DataBase;

import alnisa240523.model.Anggota;
import alnisa260403.model.AnggotaDao;
import alnisa260403.model.AnggotaDaoImpl;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class DataBaseHelper {
    public static Connection connection;
    
    public static Connection getConnection() throws SQLException {
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/alnisa_2211083019");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        try{
            Connection Connection = DataBaseHelper.getConnection();
            Anggota anggota = new Anggota();
            anggota.setNobp("2211083019");
            anggota.setNama("Ali");
            anggota.setAlamat("Padang");
            anggota.setJenisKelamin("L");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            JOptionPane.showMessageDialog(null, "Koneksi OK");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}