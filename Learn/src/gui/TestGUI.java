package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestGUI {
    public static void main (String[] args) {
        JFrame f = new JFrame("LJY");
        //窗口大小
        f.setSize(400, 300);
        // 主窗体设置位置
        f.setLocation(600, 200);
        // 主窗体中的组件设置为绝对定位
        f.setLayout(null);

        // 按钮组件
        JButton b1 = new JButton("LiJinyu NM$L");
        b1.setBounds(50, 50, 280, 30);
        /*b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b1.setVisible(false);
            }
        });*/
        f.add(b1);

        final JLabel l1 = new JLabel("#");
        l1.setForeground(Color.red);
        l1.setBounds(50, 160, 280, 30);
        f.addKeyListener(new KeyListener() {
            boolean hide = false;
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    hide = !hide;
                    l1.setVisible(hide);
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }
        });
        f.add(l1);

        JButton b2 = new JButton("LiJinyu Ni ma you si le");
        b2.setBounds(50, 120, 280, 30);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 让窗体变得可见
        f.setVisible(true);
    }
}
