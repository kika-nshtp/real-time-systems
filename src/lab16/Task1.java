package lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;


public class Task1 extends JFrame {
    int tries = 3;
    public Task1(){
        int answer = (int)(Math.random()*21+1);
        System.out.println(answer);
        setSize(300,150);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        Label triesl = new Label("Попытки: "+tries);
        add(triesl);
        Label result = new Label("Угадайка                                          ");
        result.setSize(10,200);
        add(result);
        JTextField guess = new JTextField(10);
        add(guess);
        JButton button = new JButton("Угадать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int ans = Integer.parseInt(guess.getText());
                    guess.setText("");
                    tries-=1;
                    triesl.setText("Попытки: "+tries);
                    if (tries!=0){
                        if (ans==answer){
                            result.setForeground(Color.GREEN);
                            result.setText("Игра выиграна");
                            button.removeActionListener(this);
                        } else if (ans>answer){
                            result.setForeground(Color.BLACK);
                            result.setText("Число меньше");

                        } else {
                            result.setForeground(Color.BLACK);
                            result.setText("Число больше");
                        }
                    } else {
                        if (ans==answer){
                            result.setForeground(Color.GREEN);
                            result.setText("Игра выиграна");
                        } else {
                            result.setForeground(Color.RED);
                            result.setText("Игра проиграна");
                            button.removeActionListener(this);
                        }
                    }
                } catch (Exception e){
                    result.setForeground(Color.RED);
                    result.setText("Что то пошло не так");
                }
            }
        });
        add(button);
        setVisible(true);
    }
    public static void main (String[]args){
        new Task1();
    }
}