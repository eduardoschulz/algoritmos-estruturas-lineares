package cinema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//https://www.codejava.net/java-se/swing/jbutton-basic-tutorial-and-examples
public class Gui {
    public static void main(String[] args) {
        JButton[] buttons = new JButton[10];
        JFrame f = new JFrame("cinema");
        JButton bu = new JButton();
        f.add(bu);
         for (int i = 0; i < buttons.length; i++) {
                buttons[i] = new JButton(i + "");
                buttons[i].setBounds(i * 100, 200, 50, 50);
                f.add(buttons[i]);
        }

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    buttons[1].setBackground(new Color(9,29,91));
                }
            });

        }
    }
}