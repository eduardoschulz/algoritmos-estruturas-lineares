import javax.swing.*;
public class Javaxa {
    public static void main(String[] args) {
        JButton[][] buttons = new JButton[10];
        JFrame f = new JFrame("Cinema");
        JButton bu = new JButton();
        f.add(bu);
        for (int j = 0; j < buttons.length; i++){
            for (int i = 0; i < buttons.length[j]; i++) {
                buttons[i] = new JButton(i + "");
                buttons[i].setBounds(i * 100, 200, 50, 50);
                f.add(buttons[i]);
        }}

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(System.out::println);


        }
    }
}