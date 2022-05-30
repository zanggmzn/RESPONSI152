/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author asus
 */
public class EditKaryawan extends JFrame{
    JLabel ljudul = new JLabel("Update Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
        
    JLabel lLembur = new JLabel("Lembur:");
    public final JTextField fLembur = new JTextField(10);
    
    public JButton bupdate = new JButton("Update");
    public JButton bhapus = new JButton("Hapus");
    public JButton bTotal = new JButton("Total Gaji");
    public JButton bkembali = new JButton("Kembali");
    
     public EditKaryawan(){
        setTitle("Update Karyawan");
        setSize(300,300);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);  
        add(lLembur);
        add(fLembur);
        add(bupdate);
        add(bhapus); 
        add(bkembali);
        add(bTotal);
        
        ljudul.setBounds(105,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(65,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(65,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(65,90,200,20);
        
        lLembur.setBounds(15,120,120,20);
        fLembur.setBounds(65,120,200,20);
        
        bTotal.setBounds(80,150,150,20);
        bupdate.setBounds(55,185,90,20);;
        bupdate.setBackground(Color.green);
        bupdate.setForeground(Color.white);
        bhapus.setBounds(155,185,90,20);
        bhapus.setBackground(Color.red);
        bhapus.setForeground(Color.white);
        bkembali.setBounds(15,215,250,20);
        bkembali.setBackground(Color.blue);
        bkembali.setForeground(Color.white);
        
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fnama.getText();
    }
    public String getCek(){
        return fcek.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
    
    public String getLembur(){
        return fLembur.getText();
    }
    }