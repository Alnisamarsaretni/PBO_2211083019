/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnisa290323;

/**
 *
 * @author LENOVO
 */
public class OperasiAritmatik {
    public static void main(String[] args) {
        // pastikan argumen yang diberikan sesuai
        if (args.length != 2) {
            System.out.println("Usage: java OperasiAritmatika n1 n2");
            return;
        }

        // parsing argumen ke dalam bilangan bulat
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        // melakukan operasi aritmatika dan mencetak hasilnya ke layar
        System.out.println("Tambah = " + (n1 + n2));
        System.out.println("Kurang = " + (n1 - n2));
        System.out.println("Kali = " + (n1 * n2));
        System.out.println("Bagi = " + (n1 / n2));
    }
}