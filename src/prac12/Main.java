package prac12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{

    Image img = new ImageIcon("3.jpg").getImage();

    public static void main(String[] args){
        JFrame fr = new JFrame();
        fr.setSize(500,500);
        fr.setLayout(null);
        fr.setVisible(true);

        Main m = new Main();
        m.setBounds(100,100,500,500);
        fr.add(m);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0,null);
    }
}