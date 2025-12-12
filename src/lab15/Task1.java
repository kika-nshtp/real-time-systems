package lab15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);

    JButton addButton = new JButton("Add");
    JButton subButton = new JButton("Sub");
    JButton multButton = new JButton("Mult");
    JButton devButton = new JButton("Dev");
    LabExample(){
        super("Example");
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(300,200);
        JLabel label1 = new JLabel("1st Number");
        JLabel label2 = new JLabel("2nd Number");
        jta1.setBounds(110,10,100,20);
        jta2.setBounds(110,50,100,20);
        label1.setBounds(30,10,100,20);
        label2.setBounds(30,50,100,20);
        addButton.setBounds(30,90,85,20);
        subButton.setBounds(125,90,85,20);
        multButton.setBounds(30,120,85,20);
        devButton.setBounds(125,120,85,20);
        add(label1);
        add(label2);
        add(jta1);
        add(jta2);
        add(addButton);
        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Answer",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(subButton);
        subButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1-x2),"Answer",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(multButton);
        multButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1*x2),"Answer",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(devButton);
        devButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1/x2),"Answer",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!","ALERT!" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);

    }
    public static void main(String[]args){
        new LabExample();
    }
}