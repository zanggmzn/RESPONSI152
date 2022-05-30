/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
/**
 *
 * @author asus
 */
public class TotalGaji extends JFrame{
   JLabel ljudul = new JLabel("Total Gaji");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
        
    JLabel lTotalG = new JLabel("Lembur:");
    public final JTextField fTotalG = new JTextField(10);
    public JButton bkembali = new JButton("Kembali");
        
    public TotalGaji(){

        setTitle("Total Gaji");
        setSize(300,300);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);  
        add(lTotalG);
        add(fTotalG);
        add(bkembali);

        ljudul.setBounds(105,5,200,20);
        lnama.setBounds(15,30,120,20);
        fnama.setBounds(65,30,200,20);
        
        lusia.setBounds(15,60,120,20);
        fusia.setBounds(65,60,200,20);
        
        lgaji.setBounds(15,90,120,20);
        fgaji.setBounds(65,90,200,20);
        
        lTotalG.setBounds(15,120,120,20);
        fTotalG.setBounds(65,120,200,20);
       
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
    
    public String getTotalG(){
        return fTotalG.getText();
    }
}