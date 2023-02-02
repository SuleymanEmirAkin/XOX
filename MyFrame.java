/*
Author: Suleyman Emir Akin
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton[] buttons = {new JButton(),new JButton(),new JButton(),
                         new JButton(),new JButton(),new JButton(),
                         new JButton(),new JButton(),new JButton()};
    ImageIcon x = new ImageIcon("x1.jpg");
    ImageIcon o = new ImageIcon("o.png");
    JTextField textField = new JTextField("X'S Turn");
    JPanel panel = new JPanel();
    public boolean xTurn = true;
    public boolean finished = false;
    String[] responses = {"YES","NO"};
    int again = 100;
    public MyFrame() {
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);
        panel.setLayout(new GridLayout(3,3));
        setLayout(new BorderLayout());
        for (JButton b:buttons) {
            b.setFocusable(false);
            panel.add(b);
            b.addActionListener(this);
        }
        textField.setPreferredSize(new Dimension(600,50));
        add(textField,BorderLayout.NORTH);
        add(panel,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (finished)
            return;
        if (e.getSource()==buttons[0]) {
            if (buttons[0].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[0].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[0].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[1]) {
            if (buttons[1].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[1].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[1].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[2]) {
            if (buttons[2].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[2].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[2].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[3]) {
            if (buttons[3].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[3].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[3].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[4]) {
            if (buttons[4].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[4].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[4].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[5]) {
            if (buttons[5].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[5].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[5].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[6]) {
            if (buttons[6].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[6].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[6].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[7]) {
            if (buttons[7].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[7].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[7].setIcon(o);
                xTurn = true;
            }
        }
        else if (e.getSource()==buttons[8]) {
            if (buttons[8].getIcon()!=null)
                return;
            if (xTurn) {
                buttons[8].setIcon(x);
                xTurn = false;
            }
            else {
                buttons[8].setIcon(o);
                xTurn = true;
            }
        }
        if (xTurn)
            textField.setText("X'S Turn");
        else
            textField.setText("O'S Turn");
        checkWin();
    }
    public void checkWin(){
        if(buttons[0].getIcon() != null && buttons[1].getIcon() != null && buttons[2].getIcon() != null &&
            buttons[3].getIcon() != null && buttons[4].getIcon() != null && buttons[5].getIcon() != null &&
            buttons[6].getIcon() != null  && buttons[7].getIcon() != null && buttons[8].getIcon() != null) {
                textField.setText("DRAW");
                finished = true;
                again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        if (buttons[0].getIcon()==buttons[1].getIcon() &&
                buttons[1].getIcon()==buttons[2].getIcon() && buttons[0].getIcon()!=null) {
            if (buttons[0].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[3].getIcon()==buttons[4].getIcon() &&
                buttons[4].getIcon()==buttons[5].getIcon() && buttons[3].getIcon()!=null) {
            if (buttons[3].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[6].getIcon()==buttons[7].getIcon() &&
                buttons[7].getIcon()==buttons[8].getIcon() && buttons[6].getIcon()!=null) {
            if (buttons[7].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[0].getIcon()==buttons[3].getIcon() &&
                buttons[3].getIcon()==buttons[6].getIcon() && buttons[0].getIcon()!=null) {
            if (buttons[0].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[1].getIcon()==buttons[4].getIcon() &&
                buttons[4].getIcon()==buttons[7].getIcon() && buttons[1].getIcon()!=null){
            if (buttons[1].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[2].getIcon()==buttons[5].getIcon() &&
                buttons[5].getIcon()==buttons[8].getIcon() && buttons[2].getIcon()!=null){
            if (buttons[2].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[0].getIcon()==buttons[4].getIcon() &&
                buttons[4].getIcon()==buttons[8].getIcon() && buttons[0].getIcon()!=null){
            if (buttons[4].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }
        else if (buttons[2].getIcon()==buttons[4].getIcon() &&
                buttons[4].getIcon()==buttons[6].getIcon() && buttons[2].getIcon()!=null){
            if (buttons[2].getIcon().toString()==x.toString())
                textField.setText("X WON");
            else
                textField.setText("O WON");
            finished = true;
            again = JOptionPane.showOptionDialog(
                    null,
                    "Do you want to play again?",
                    "Again",
                    JOptionPane.DEFAULT_OPTION,
                    1,
                    null,
                    responses,
                    responses[0]);
        }

        if (again==1 || again==-1)
            System.exit(0);
        if (again==0)
            reset();
    }
    public void reset() {
        textField.setText("X'S Turn");
        for (JButton b:buttons) {
            b.setIcon(null);
            xTurn = true;
            again = 100;
            finished = false;
        }
    }
}