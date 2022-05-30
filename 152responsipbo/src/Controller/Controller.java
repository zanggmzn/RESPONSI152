/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import Main.Main;
import Model.Model;
import View.EditKaryawan;
import View.InputKaryawan;
import View.Menu;
import View.TampilKaryawan;
import View.TotalGaji;
/**
 *
 * @author asus
 */
public class Controller {
    
    Model modell;
    TampilKaryawan tampilVieww;
    InputKaryawan inputt;
    EditKaryawan editt;
    TotalGaji total;
    
    public Controller(TampilKaryawan tampilview, Model model,InputKaryawan input, EditKaryawan edit){
        this.modell = model;
        this.tampilVieww = tampilview;
        this.inputt = input;
        this.editt = edit;
        
        if(modell.getBanyakData()!=0){
            String dataKaryawan[][] = modell.readContact();
            tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        inputt.bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = inputt.getNama();
                String usia = inputt.getUsia();
                String gaji =inputt.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readContact();
                tampilVieww.tabel.setModel((new JTable(dataKaryawan, tampilVieww.namaKolom)).getModel());
            }
        });
         inputt.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                Menu m = new Menu();
                   
            }
        });
        inputt.bReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputt.tNama.setText(null);
                inputt.tUsia.setText(null);  
                inputt.tGaji.setText(null);
            }
        });
        editt.bkembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
                

            }
        });
        tampilVieww.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilVieww.dispose();

            }
        });
        editt.bTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,cek, usia, gaji);
                edit.dispose();
                TotalGaji totalg = new TotalGaji();
              
                edit.dispose();
            }
        });
        edit.bupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String cek = edit.getCek();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
//                model.hitung(nama,cek, usia, gaji);
                edit.dispose();
            }
        });
        
        edit.bhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getCek();
                model.delete(cek);
                edit.dispose();
            }
        });
              tampilVieww.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilVieww.tabel.getSelectedRow();
                
                String id = tampilVieww.tabel.getValueAt(baris, 0).toString();
                String nama = tampilVieww.tabel.getValueAt(baris, 1).toString();
                String usia = tampilVieww.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilVieww.tabel.getValueAt(baris, 3).toString();
                
                tampilVieww.dispose();
                EditKaryawan ed = new EditKaryawan();
                ed.fnama.setText(nama);
                ed.fcek.setText(id);
                ed.fusia.setText(usia);
                ed.fgaji.setText(gaji);
                TampilKaryawan lh = new TampilKaryawan();
                lh.dispose();
                InputKaryawan ik = new InputKaryawan();
                ik.dispose();
                Model md = new Model();
                Controller ct = new Controller(lh,md,ik,ed);
                System.out.println("");
                        
            }
        }
        );
    }
}
