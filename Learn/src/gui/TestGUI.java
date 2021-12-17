package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUI {
    public static void main (String[] args) {
        JFrame f = new JFrame("LJY");
        //窗口大小
        f.setSize(400, 300);
        // 主窗体设置位置
        f.setLocation(200, 200);
        // 主窗体中的组件设置为绝对定位
        f.setLayout(null);
        // 按钮组件

        JButton b1 = new JButton("LiJinyu NM$L");
        b1.setBounds(50, 50, 280, 30);
        f.add(b1);

        JButton b2 = new JButton("LiJinyu Ni ma you si le");
        b2.setBounds(50, 120, 280, 30);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 让窗体变得可见
        f.setVisible(true);
    }
}
