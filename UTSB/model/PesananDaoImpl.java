/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSB.model;

import UTSB.model.Pesanan;
import UTSB.model.PesananDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class PesananDaoImpl implements PesananDao {
    private List<Pesanan> data = new ArrayList<>();
    
    @Override
    public Pesanan save(Pesanan pesanan) {
        data.add(pesanan);
        return pesanan;
    }
    
    @Override
    public Pesanan update(int index, Pesanan pesanan) {
        data.set(index, pesanan);
        return pesanan;
    }
    
    @Override
    public void delete(int index) {
        data.remove(index);
    }
    
    @Override
    public Pesanan getPesanan(int index) {
        return data.get(index);
    }
    
    @Override
    public List<Pesanan> getAllPesanan () {
        return data;
    }
}
