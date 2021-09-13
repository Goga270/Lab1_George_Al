package com.company;//

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JPanel[] pnl = new JPanel[12];

    public Main(){
        setLayout(new GridLayout(3,4));
        for(int i =0;i<pnl.length;i++){
            int r = (int) (Math.random()*255);
            int b = (int) (Math.random()*255);
            int g = (int) (Math.random()*255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }
        pnl[4].setLayout(new BorderLayout());
        pnl[4].add(new JButton("one"),BorderLayout.WEST);
        pnl[4].add(new JButton("Two"),BorderLayout.SOUTH);
        pnl[4].add(new JButton("Three"),BorderLayout.NORTH);
        pnl[4].add(new JButton("Four"),BorderLayout.EAST);
        pnl[4].add(new JButton("Five"),BorderLayout.CENTER);
        pnl[10].setLayout(new FlowLayout());
        pnl[10].add(new JButton("one"));
        pnl[10].add(new JButton("twoo"));
        pnl[10].add(new JButton("threee"));
        pnl[10].add(new JButton("fourrrr"));
        pnl[10].add(new JButton("Fiveeeee"));
        setSize(1000,1000);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
