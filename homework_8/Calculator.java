package homework_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;

import javax.swing.JTextField;


public class Calculator extends JFrame {
    JTextField txt1 = null;
    int res = 0;
    int res1 = 0;
    String op = "";
    Calculator() {
        setBounds(500, 500, 400, 300);
        setTitle("GridLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final TextField txt1 = new TextField();
        txt1.setBounds(10, 10, 235, 25);

        JButton bRes = new JButton("=");
        bRes.setBounds(85, 270, 75, 50);
        Font bigFont = new Font("serif", Font.BOLD, 22);
        bRes.setFont(bigFont);

        JButton bPlus = new JButton("+");
        bPlus.setBounds(170, 40, 75, 50);
        Font bigFontPlus = new Font("serif", Font.BOLD, 22);
        bPlus.setFont(bigFontPlus);

        JButton bMinus = new JButton("-");
        bMinus.setBounds(170, 110, 75, 50);
        Font bigFontMinus = new Font("serif", Font.BOLD, 22);
        bMinus.setFont(bigFontMinus);

        JButton bMulti = new JButton("*");
        bMulti.setBounds(170, 190, 75, 50);
        Font bigFontMulti = new Font("serif", Font.BOLD, 22);
        bMulti.setFont(bigFontMulti);

        JButton bDivision = new JButton("/");
        bDivision.setBounds(170, 270, 75, 50);
        Font bigFontDivision = new Font("serif", Font.BOLD, 22);
        bDivision.setFont(bigFontDivision);
        GridLayout setLayout = new GridLayout(4, 3);
        JButton b0 = new JButton("0");
        b0.setBounds(10, 270, 75, 50);

        JButton b1 = new JButton("1");
        b1.setBounds(10, 190, 50, 50);

        JButton b2 = new JButton("2");
        b2.setBounds(60, 190, 50, 50);

        JButton b3 = new JButton("3");
        b3.setBounds(110, 190, 50, 50);

        JButton b4 = new JButton("4");
        b4.setBounds(10, 110, 50, 50);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(txt1);
        add(bRes);
        add(bPlus);
        add(bMinus);
        add(bMulti);
        add(bDivision);
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                txt1.setText(txt1.getText() + 1);
                if (res==0) {
                    res = Integer.valueOf(txt1.getText());
                } else {
                    res1 = Integer.valueOf(txt1.getText());
                }
            }
        });

        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                txt1.setText(txt1.getText() + 2);
                if (res==0) {
                    res = Integer.valueOf(txt1.getText());
                } else {
                    res1 = Integer.valueOf(txt1.getText());
                }
            }
        });

        b3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                txt1.setText(txt1.getText() + 3);
                if (res==0) {
                    res = Integer.valueOf(txt1.getText());
                } else {
                    res1 = Integer.valueOf(txt1.getText());
                }
            }
        });

        b4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                txt1.setText(txt1.getText() + 4);
                if (res==0)
                {
                    res = Integer.valueOf(txt1.getText());
                } else {
                    res1 = Integer.valueOf(txt1.getText());
                }
            }
        });
        bPlus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                res = Integer.valueOf(txt1.getText());
                txt1.setText("");
                op = "+";
            }
        });

        bMinus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                res = Integer.valueOf(txt1.getText());
                txt1.setText("");
                op = "-";
            }
        });

        bMulti.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                res = Integer.valueOf(txt1.getText());
                txt1.setText("");
                op = "*";
            }
        });

        bDivision.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg1)
            {
                res = Integer.valueOf(txt1.getText());
                txt1.setText("");
                op = "/";
            }
        });

        bRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int num = Integer.valueOf(res);
                int num1 = Integer.valueOf(res1);
                String strOp = op;
                MetodCalcu mc = new MetodCalcu();
                String strRes = String.valueOf(mc.calc(num, strOp, num1 ));
                txt1.setText(strRes);

            }
        });
        setVisible(true);
        }
}





