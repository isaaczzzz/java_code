package gui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestGUI2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Test");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);

        final JLabel l = new JLabel();

        ImageIcon i = new ImageIcon("C:/Users/ZXH/Desktop/icon_steam_vr.png");
        l.setIcon(i);
        l.setBounds(50, 50, 50, 50);

        // 增加键盘监听
        f.addKeyListener(new KeyListener() {

            // 键被弹起
            public void keyReleased(KeyEvent e) {

                // 39代表按下了 “右键”
                if (e.getKeyCode() == 39) {
                    // 图片向右移动 （y坐标不变，x坐标增加）
                    l.setLocation(l.getX() + 10, l.getY());
                }
            }

            //键被按下
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub

            }

            // 一个按下弹起的组合动作
            public void keyTyped(KeyEvent e) {

            }
        });

        f.add(l);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}