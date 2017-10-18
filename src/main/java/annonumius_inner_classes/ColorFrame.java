package annonumius_inner_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    public ColorFrame() throws HeadlessException {

        JButton button = new JButton("click to change color");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.BLACK);
            }
        });
        add(button, BorderLayout.NORTH);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
