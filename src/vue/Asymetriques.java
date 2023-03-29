/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author tekeu
 */
public class Asymetriques extends javax.swing.JFrame{
    
      public Asymetriques() {
          
        JFrame f=new JFrame();
        f.setBounds(100, 10,700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        Container a=f.getContentPane();
        
        JLabel l=new JLabel();
        l.setBounds(0, 0, 700, 500);
       
        JLabel l1=new JLabel("message claire");
        l1.setBounds(100, 0, 400, 50);
        a.add(l1);
                
        JTextField t1=new JTextField();
        t1.setBounds(100, 50, 400, 100);
        a.add(t1);
         
        JLabel l3=new JLabel("mot de codage");
        l3.setBounds(100, 150, 400, 50);
        a.add(l3);
        
        JTextField t3=new JTextField();
        t3.setBounds(100, 200, 400, 50);
        a.add(t3);       
        
        JLabel l2=new JLabel("message codé");
        l2.setBounds(100, 250, 400, 50);
        a.add(l2);
        
        JTextField t2=new JTextField();
        t2.setBounds(100, 300, 400, 100);
        a.add(t2);
        
        JButton b1=new JButton("chiffrer");
        b1.setBounds(550, 100, 100, 50);
        a.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String k=t1.getText();
                String z=t3.getText();
                
                char table[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                
                for(int i=0;i<k.length();i++){
                    for(int j=0;j<25;j++){
                        if(k.charAt(i)==table[j]){
                          for(int h=0;h<25;h++){
                              if(z.charAt(i%z.length())==table[h]){
                               int r=(h+j%26);
                               t2.setText(t2.getText()+table[r]+"");
                              }
                          }
                        }
                            
                    
                    }
                
                }
            }
        
        });
        
        JButton b3=new JButton("effacer");
        b3.setBounds(550, 200, 100, 50);
        a.add(b3);
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });
        
        JButton b2=new JButton("déchiffrer");
        b2.setBounds(550, 300, 100, 50);
        a.add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String k=t2.getText();
                String z=t3.getText();
                
                char table[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                
                for(int i=0;i<k.length();i++){
                    for(int j=0;j<25;j++){
                        if(k.charAt(i)==table[j]){
                          for(int h=0;h<25;h++){
                              if(z.charAt(i%z.length())==table[h]){
                               int r=(h-j);
                               if(r<0){
                                  r=r+26;
                                  r=r%26;
                               }else {
                                  r=r%26; 
                               }    
                               
                               t1.setText(t1.getText()+table[r]+"");
                              }
                          }
                        }
                            
                    
                    }
                
                }
            }
        
        });
        
        
        a.add(l);
        f.setVisible(true);
      
  /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
}


