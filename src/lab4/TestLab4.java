package lab4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class TestLab4  extends JFrame {
    JFrame frame = new JFrame("Match!");
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JButton but3 = new JButton("End Match");
    JButton but4 = new JButton("New Match");
    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer: N/A");
    JLabel label3 = new JLabel("Winner : None");
    public int Click_but1 =0;
    public int Click_but3 =0;

    public TestLab4(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        but1.setBounds(100,20,150,20);
        but1.setActionCommand("Milan");
        but2.setBounds(450,20,150,20);
        but2.setActionCommand("Real");
        but3.setBounds(300,35,100,20);
        but3.setActionCommand("End");
        but4.setBounds(300,5,100,20);
        but4.setActionCommand("Reset");
        label1.setBounds(100,80,150,20);
        label2.setBounds(100,120,150,20);
        label3.setBounds(100,160,150,20);
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        ActionListener actionListener = new TestActionListener();

        but1.addActionListener(actionListener);
        but2.addActionListener(actionListener);
        but3.addActionListener(actionListener);
        but4.addActionListener(actionListener);
        frame.setSize(700,700);
        frame.setVisible(true);
    }

    public class TestActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String ButText = e.getActionCommand();
            switch (ButText){
                case "Milan":
                    Click_but1++;
                    label1.setText("Result: " + Click_but1 + " X " + Click_but3);
                    label2.setText("Last Scorer: " + ButText);
                    break;
                case "Real":
                    Click_but3++;
                    label1.setText("Result: " + Click_but1 + " X " + Click_but3);
                    label2.setText("Last Scorer: "  + ButText);
                    break;
                case "End":
                    if(Click_but3 > Click_but1){
                        label3.setText("Winner: Real");
                        JOptionPane.showMessageDialog(null,"End the Winner is FC Real Madrid, congrats!", "The Result",JOptionPane.INFORMATION_MESSAGE);
                    }else if(Click_but1>Click_but3) {
                        label3.setText("Winner: Milan");
                        JOptionPane.showMessageDialog(null,"End the Winner is ACM MILAN, congrats!","The Result",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        label3.setText("Winner: Draw");
                        JOptionPane.showMessageDialog(null,"The match end : DRAW","The Result",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "Reset":
                    Click_but3 =0;
                    Click_but1 =0;
                    label1.setText("Result: " + Click_but1 + " X " + Click_but3);
                    label2.setText("Last Scorer: N/A");
                    label3.setText("Winner: None");
                    break;
                default:
                    break;

            }
        }
    }

    public static void main(String[] args){
        new TestLab4();
    }
}
