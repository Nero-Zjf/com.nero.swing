package com.nero.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleJFrame simpleJFrame = new SimpleJFrame();
            //定义一个用户关闭这个框架时的响应动作。对于这个程序而言，只让程序简单地退出即可
            simpleJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            simpleJFrame.setIconImage(new ImageIcon(Objects.requireNonNull(SimpleJFrame.class.getClassLoader().getResource("Image.png"))).getImage());
            simpleJFrame.setLocationByPlatform(true);
            JButton button = new JButton("click me", new ImageIcon(Objects.requireNonNull(SimpleJFrame.class.getClassLoader().getResource("Image.png"))));

            button.addActionListener(e -> {
                System.exit(0);
            });
           simpleJFrame.getContentPane().add(button);
            //显示框架
            simpleJFrame.setVisible(true);
        });
    }
}
