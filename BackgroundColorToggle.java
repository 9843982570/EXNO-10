/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backgroundcolor.toggle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundColorToggle extends JFrame {
    private JPanel panel;
    private JButton colorButton;
    private boolean isColorChanged;

    public BackgroundColorToggle() {
        panel = new JPanel();
        colorButton = new JButton("Toggle Color");
        isColorChanged = false;

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isColorChanged) {
                    panel.setBackground(Color.WHITE);
                    isColorChanged = false;
                }
                else {
                    panel.setBackground(Color.black);
                }
            }
        });

        panel.add(colorButton);
        add(panel);

        setTitle("Background Color Toggle");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BackgroundColorToggle();
            }
        });
    }
}

 
