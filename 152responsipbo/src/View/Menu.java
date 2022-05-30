/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Model.Model;
import View.TampilKaryawan;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author asus
 */
public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel("Main Menu");

   public JButton btambah = new JButton("Tambah Karyawan");
   public JButton blihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
        setSize(155,120);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);

        ljudul.setBounds(35,5,200,20);


        btambah.setBounds(0,25,150,20);
        blihat.setBounds(0,45,150,20);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           TampilKaryawan lh = new TampilKaryawan();
           lh.dispose();
           dispose();
           InputKaryawan ik = new InputKaryawan();
           EditKaryawan ed = new EditKaryawan();
           ed.dispose();
           Model md = new Model();
           Controller ct = new Controller(lh, md,ik,ed);
          
        }
        if(e.getSource() == blihat){
            TampilKaryawan lh = new TampilKaryawan();
           InputKaryawan ik = new InputKaryawan();
           ik.dispose();
           EditKaryawan ed = new EditKaryawan();
           ed.dispose();
           Model md = new Model();
           Controller ct = new Controller(lh, md,ik,ed);
        }

    }

}