package com.smallplayz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Wordle {
    static String word = ""; // THE VARIABLE FOR THE WORDLE WORD
    static int line = 0; // THE VARIABLE FOR WHICH LINE 0-5 YOU'RE ON

    public static void main(String[] args) throws FileNotFoundException {
        //**************// CREATES FRAME //**************//
        JFrame frame = new JFrame("Wordle");

        //**************// CREATES FIRST ROW //**************//
        JTextField a0 = new JTextField();
        JTextField a1 = new JTextField();
        JTextField a2 = new JTextField();
        JTextField a3 = new JTextField();
        JTextField a4 = new JTextField();

        //**************// CREATES SECOND ROW //**************//
        JTextField b0 = new JTextField();
        JTextField b1 = new JTextField();
        JTextField b2 = new JTextField();
        JTextField b3 = new JTextField();
        JTextField b4 = new JTextField();

        //**************// CREATES THIRD ROW //**************//
        JTextField c0 = new JTextField();
        JTextField c1 = new JTextField();
        JTextField c2 = new JTextField();
        JTextField c3 = new JTextField();
        JTextField c4 = new JTextField();

        //**************// CREATES FOURTH ROW //**************//
        JTextField d0 = new JTextField();
        JTextField d1 = new JTextField();
        JTextField d2 = new JTextField();
        JTextField d3 = new JTextField();
        JTextField d4 = new JTextField();

        //**************// CREATES FIFTH ROW //**************//
        JTextField e0 = new JTextField();
        JTextField e1 = new JTextField();
        JTextField e2 = new JTextField();
        JTextField e3 = new JTextField();
        JTextField e4 = new JTextField();

        //**************// CREATES SIXTH ROW //**************//
        JTextField f0 = new JTextField();
        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField f3 = new JTextField();
        JTextField f4 = new JTextField();

        //**************// CREATES BUTTON //**************//
        JButton button = new JButton("Enter");

        //**************// CREATES LABEL //**************//
        JLabel label = new JLabel("Wordle");

        //**************// SETS FONT AND SIZE FOR BUTTON //**************//
        button.setFont(new Font("Serif",Font.ITALIC,25));

        //**************// SETS FONT AND SIZE FOR LABEL //**************//
        label.setFont(new Font("Serif", Font.PLAIN, 50));

        //**************// SETS FONT AND SIZE FOR FIRST ROW //**************//
        a0.setFont(new Font("Verdana",Font.BOLD,50));
        a1.setFont(new Font("Verdana",Font.BOLD,50));
        a2.setFont(new Font("Verdana",Font.BOLD,50));
        a3.setFont(new Font("Verdana",Font.BOLD,50));
        a4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// SETS FONT AND SIZE FOR SECOND ROW //**************//
        b0.setFont(new Font("Verdana",Font.BOLD,50));
        b1.setFont(new Font("Verdana",Font.BOLD,50));
        b2.setFont(new Font("Verdana",Font.BOLD,50));
        b3.setFont(new Font("Verdana",Font.BOLD,50));
        b4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// SETS FONT AND SIZE FOR THIRD ROW //**************//
        c0.setFont(new Font("Verdana",Font.BOLD,50));
        c1.setFont(new Font("Verdana",Font.BOLD,50));
        c2.setFont(new Font("Verdana",Font.BOLD,50));
        c3.setFont(new Font("Verdana",Font.BOLD,50));
        c4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// SETS FONT AND SIZE FOR FOURTH ROW //**************//
        d0.setFont(new Font("Verdana",Font.BOLD,50));
        d1.setFont(new Font("Verdana",Font.BOLD,50));
        d2.setFont(new Font("Verdana",Font.BOLD,50));
        d3.setFont(new Font("Verdana",Font.BOLD,50));
        d4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// SETS FONT AND SIZE FOR FIFTH ROW //**************//
        e0.setFont(new Font("Verdana",Font.BOLD,50));
        e1.setFont(new Font("Verdana",Font.BOLD,50));
        e2.setFont(new Font("Verdana",Font.BOLD,50));
        e3.setFont(new Font("Verdana",Font.BOLD,50));
        e4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// SETS FONT AND SIZE FOR SIXTH ROW //**************//
        f0.setFont(new Font("Verdana",Font.BOLD,50));
        f1.setFont(new Font("Verdana",Font.BOLD,50));
        f2.setFont(new Font("Verdana",Font.BOLD,50));
        f3.setFont(new Font("Verdana",Font.BOLD,50));
        f4.setFont(new Font("Verdana",Font.BOLD,50));

        //**************// CENTERS FIRST ROW //**************//
        a0.setHorizontalAlignment(JTextField.CENTER);
        a1.setHorizontalAlignment(JTextField.CENTER);
        a2.setHorizontalAlignment(JTextField.CENTER);
        a3.setHorizontalAlignment(JTextField.CENTER);
        a4.setHorizontalAlignment(JTextField.CENTER);

        //**************// CENTERS SECOND ROW //**************//
        b0.setHorizontalAlignment(JTextField.CENTER);
        b1.setHorizontalAlignment(JTextField.CENTER);
        b2.setHorizontalAlignment(JTextField.CENTER);
        b3.setHorizontalAlignment(JTextField.CENTER);
        b4.setHorizontalAlignment(JTextField.CENTER);

        //**************// CENTERS THIRD ROW //**************//
        c0.setHorizontalAlignment(JTextField.CENTER);
        c1.setHorizontalAlignment(JTextField.CENTER);
        c2.setHorizontalAlignment(JTextField.CENTER);
        c3.setHorizontalAlignment(JTextField.CENTER);
        c4.setHorizontalAlignment(JTextField.CENTER);

        //**************// CENTERS FOURTH ROW //**************//
        d0.setHorizontalAlignment(JTextField.CENTER);
        d1.setHorizontalAlignment(JTextField.CENTER);
        d2.setHorizontalAlignment(JTextField.CENTER);
        d3.setHorizontalAlignment(JTextField.CENTER);
        d4.setHorizontalAlignment(JTextField.CENTER);

        //**************// CENTERS FIFTH ROW //**************//
        e0.setHorizontalAlignment(JTextField.CENTER);
        e1.setHorizontalAlignment(JTextField.CENTER);
        e2.setHorizontalAlignment(JTextField.CENTER);
        e3.setHorizontalAlignment(JTextField.CENTER);
        e4.setHorizontalAlignment(JTextField.CENTER);

        //**************// CENTERS SIXTH ROW //**************//
        f0.setHorizontalAlignment(JTextField.CENTER);
        f1.setHorizontalAlignment(JTextField.CENTER);
        f2.setHorizontalAlignment(JTextField.CENTER);
        f3.setHorizontalAlignment(JTextField.CENTER);
        f4.setHorizontalAlignment(JTextField.CENTER);

        //**************// BUTTON SETS BOUNDS//**************//
        button.setBounds(205, 27, 155, 43);

        //**************// LABEL SETS BOUNDS//**************//
        label.setBounds(25, 0, 300, 100);

        //**************// FIRST ROW SETS BOUNDS//**************//
        a0.setBounds(25, 75, 65,65 );
        a1.setBounds(100, 75, 65,65 );
        a2.setBounds(175, 75, 65,65 );
        a3.setBounds(250, 75, 65,65 );
        a4.setBounds(325, 75, 65,65 );

        //**************// SECOND ROW SETS BOUNDS//**************//
        b0.setBounds(25, 150, 65,65 );
        b1.setBounds(100, 150, 65,65 );
        b2.setBounds(175, 150, 65,65 );
        b3.setBounds(250, 150, 65,65 );
        b4.setBounds(325, 150, 65,65 );

        //**************// THIRD ROW SETS BOUNDS//**************//
        c0.setBounds(25, 225, 65,65 );
        c1.setBounds(100, 225, 65,65 );
        c2.setBounds(175, 225, 65,65 );
        c3.setBounds(250, 225, 65,65 );
        c4.setBounds(325, 225, 65,65 );

        //**************// FOURTH ROW SETS BOUNDS//**************//
        d0.setBounds(25, 300, 65,65 );
        d1.setBounds(100, 300, 65,65 );
        d2.setBounds(175, 300, 65,65 );
        d3.setBounds(250, 300, 65,65 );
        d4.setBounds(325, 300, 65,65 );

        //**************// FIFTH ROW SETS BOUNDS//**************//
        e0.setBounds(25, 375, 65,65 );
        e1.setBounds(100, 375, 65,65 );
        e2.setBounds(175, 375, 65,65 );
        e3.setBounds(250, 375, 65,65 );
        e4.setBounds(325, 375, 65,65 );

        //**************// SIXTH ROW SETS BOUNDS//**************//
        f0.setBounds(25, 450, 65,65 );
        f1.setBounds(100, 450, 65,65 );
        f2.setBounds(175, 450, 65,65 );
        f3.setBounds(250, 450, 65,65 );
        f4.setBounds(325, 450, 65,65 );

        //**************// ADDS BUTTON TO FRAME//**************//
        frame.add(button);

        //**************// ADDS LABEL TO FRAME//**************//
        frame.add(label);

        //**************// ADDS FIRST ROW TO FRAME//**************//
        frame.add(a0);
        frame.add(a1);
        frame.add(a2);
        frame.add(a3);
        frame.add(a4);

        //**************// ADDS SECOND ROW TO FRAME//**************//
        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        //**************// ADDS THIRD ROW TO FRAME//**************//
        frame.add(c0);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);

        //**************// ADDS FOURTH ROW TO FRAME//**************//
        frame.add(d0);
        frame.add(d1);
        frame.add(d2);
        frame.add(d3);
        frame.add(d4);

        //**************// ADDS FIFTH ROW TO FRAME//**************//
        frame.add(e0);
        frame.add(e1);
        frame.add(e2);
        frame.add(e3);
        frame.add(e4);

        //**************// ADDS SIXTH ROW TO FRAME//**************//
        frame.add(f0);
        frame.add(f1);
        frame.add(f2);
        frame.add(f3);
        frame.add(f4);

        //**************// FRAME THINGS //**************//
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        //**************// GENERATES RANDOM WORD FROM TXT FILE USING METHOD//**************//
        randomWord();

        //**************// KEEPS TEXT FIELDS TO ONE CHARACTER PER BOX //**************//
        a0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (a0.getText().length() >= 1 )
                    e.consume();
            }
        });
        a1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (a1.getText().length() >= 1 )
                    e.consume();
            }
        });
        a2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (a2.getText().length() >= 1 )
                    e.consume();
            }
        });
        a3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (a3.getText().length() >= 1 )
                    e.consume();
            }
        });
        a4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (a4.getText().length() >= 1 )
                    e.consume();
            }
        });
        b0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (b0.getText().length() >= 1 )
                    e.consume();
            }
        });
        b1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (b1.getText().length() >= 1 )
                    e.consume();
            }
        });
        b2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (b2.getText().length() >= 1 )
                    e.consume();
            }
        });
        b3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (b3.getText().length() >= 1 )
                    e.consume();
            }
        });
        b4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (b4.getText().length() >= 1 )
                    e.consume();
            }
        });
        c0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (c0.getText().length() >= 1 )
                    e.consume();
            }
        });
        c1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (c1.getText().length() >= 1 )
                    e.consume();
            }
        });
        c2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (c2.getText().length() >= 1 )
                    e.consume();
            }
        });
        c3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (c3.getText().length() >= 1 )
                    e.consume();
            }
        });
        c4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (c4.getText().length() >= 1 )
                    e.consume();
            }
        });
        d0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (d0.getText().length() >= 1 )
                    e.consume();
            }
        });
        d1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (d1.getText().length() >= 1 )
                    e.consume();
            }
        });
        d2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (d2.getText().length() >= 1 )
                    e.consume();
            }
        });
        d3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (d3.getText().length() >= 1 )
                    e.consume();
            }
        });
        d4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (d4.getText().length() >= 1 )
                    e.consume();
            }
        });
        e0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e0.getText().length() >= 1 )
                    e.consume();
            }
        });
        e1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e1.getText().length() >= 1 )
                    e.consume();
            }
        });
        e2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e2.getText().length() >= 1 )
                    e.consume();
            }
        });
        e3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e3.getText().length() >= 1 )
                    e.consume();
            }
        });
        e4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (e4.getText().length() >= 1 )
                    e.consume();
            }
        });
        f0.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (f0.getText().length() >= 1 )
                    e.consume();
            }
        });
        f1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (f1.getText().length() >= 1 )
                    e.consume();
            }
        });
        f2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (f2.getText().length() >= 1 )
                    e.consume();
            }
        });
        f3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (f3.getText().length() >= 1 )
                    e.consume();
            }
        });
        f4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (f4.getText().length() >= 1 )
                    e.consume();
            }
        });
        //**************// MAKES IT ALWAYS CAPS //**************//
        a0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        a1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        a2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        a3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        a4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        b0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        b1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        b2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        b3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        b4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        c0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        c1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        c2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        c3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        c4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        d0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        d1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        d2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        d3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        d4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        e0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        e1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        e2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        e3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        e4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        f0.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        f1.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        f2.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        f3.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });
        f4.addKeyListener(new KeyAdapter() {

            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (Character.isLowerCase(keyChar)) {
                    e.setKeyChar(Character.toUpperCase(keyChar));
                }
            }
        });


        b0.setEditable(false);
        b1.setEditable(false);
        b2.setEditable(false);
        b3.setEditable(false);
        b4.setEditable(false);

        c0.setEditable(false);
        c1.setEditable(false);
        c2.setEditable(false);
        c3.setEditable(false);
        c4.setEditable(false);

        d0.setEditable(false);
        d1.setEditable(false);
        d2.setEditable(false);
        d3.setEditable(false);
        d4.setEditable(false);

        e0.setEditable(false);
        e1.setEditable(false);
        e2.setEditable(false);
        e3.setEditable(false);
        e4.setEditable(false);

        f0.setEditable(false);
        f1.setEditable(false);
        f2.setEditable(false);
        f3.setEditable(false);
        f4.setEditable(false);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                word = word.toUpperCase();
                boolean filled0 = true, filled1 = true, filled2 = true, filled3 = true, filled4 = true, filled5 = true;

                if(a0.getText().equals(""))
                    filled0 = false;
                else if(a1.getText().equals(""))
                    filled0 = false;
                else if(a2.getText().equals(""))
                    filled0 = false;
                else if(a3.getText().equals(""))
                    filled0 = false;
                else if(a4.getText().equals(""))
                    filled0 = false;

                if(b0.getText().equals(""))
                    filled1 = false;
                else if(b1.getText().equals(""))
                    filled1 = false;
                else if(b2.getText().equals(""))
                    filled1 = false;
                else if(b3.getText().equals(""))
                    filled1 = false;
                else if(b4.getText().equals(""))
                    filled1 = false;

                if(c0.getText().equals(""))
                    filled2 = false;
                else if(c1.getText().equals(""))
                    filled2 = false;
                else if(c2.getText().equals(""))
                    filled2 = false;
                else if(c3.getText().equals(""))
                    filled2 = false;
                else if(c4.getText().equals(""))
                    filled2 = false;

                if(d0.getText().equals(""))
                    filled3 = false;
                else if(d1.getText().equals(""))
                    filled3 = false;
                else if(d2.getText().equals(""))
                    filled3 = false;
                else if(d3.getText().equals(""))
                    filled3 = false;
                else if(d4.getText().equals(""))
                    filled3 = false;

                if(e0.getText().equals(""))
                    filled4 = false;
                else if(e1.getText().equals(""))
                    filled4 = false;
                else if(e2.getText().equals(""))
                    filled4 = false;
                else if(e3.getText().equals(""))
                    filled4 = false;
                else if(e4.getText().equals(""))
                    filled4 = false;

                if(f0.getText().equals(""))
                    filled5 = false;
                else if(f1.getText().equals(""))
                    filled5 = false;
                else if(f2.getText().equals(""))
                    filled5 = false;
                else if(f3.getText().equals(""))
                    filled5 = false;
                else if(f4.getText().equals(""))
                    filled5 = false;

                String a = a0.getText()+a1.getText()+a2.getText()+a3.getText()+a4.getText();
                String b = b0.getText()+b1.getText()+b2.getText()+b3.getText()+b4.getText();
                String c = c0.getText()+c1.getText()+c2.getText()+c3.getText()+c4.getText();
                String d = d0.getText()+d1.getText()+d2.getText()+d3.getText()+d4.getText();
                String ee = e0.getText()+e1.getText()+e2.getText()+e3.getText()+e4.getText();
                String f = f0.getText()+f1.getText()+f2.getText()+f3.getText()+f4.getText();
                String triedWord = a.toLowerCase();

                System.out.println(triedWord);

/*
          File file = new File("words.txt"); // the file
        Scanner sc = new Scanner(file);
        int random = (int)(Math.random()*5751), x = 1; // random number and line number
        for(int i = 1; i<random; i++){
            sc.nextLine();
            x++;
        }
        word = sc.nextLine();
        sc.close();
        System.out.println(word+" "+x);
 */
                /*
                String w = "";
                File file = new File("words.txt");
                try {
                    Scanner sc = new Scanner(file);
                    System.out.println(a);
                    String data = null;
                    while (sc.hasNextLine()) {
                        data = sc.nextLine();
                        if (data.equals(a)) {
                            System.out.println(data);
                            System.out.println("hi");
                            break;
                        }
                    }
                    System.out.println(data);
                    sc.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                */

                for (int j = 0; j < 6; j++) {
                        if (j == 0 && filled0) {
                            for (int i = 0; i < 5; i++) {
                                if (a0.getText().charAt(0) == word.charAt(0)) {
                                    a0.setBackground(Color.green);
                                    break;
                                } else if (a0.getText().charAt(0) == word.charAt(i)) {
                                    a0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    a0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (a1.getText().charAt(0) == word.charAt(1)) {
                                    a1.setBackground(Color.green);
                                    break;
                                } else if (a1.getText().charAt(0) == word.charAt(i)) {
                                    a1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    a1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (a2.getText().charAt(0) == word.charAt(2)) {
                                    a2.setBackground(Color.green);
                                    break;
                                } else if (a2.getText().charAt(0) == word.charAt(i)) {
                                    a2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    a2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (a3.getText().charAt(0) == word.charAt(3)) {
                                    a3.setBackground(Color.green);
                                    break;
                                } else if (a3.getText().charAt(0) == word.charAt(i)) {
                                    a3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    a3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (a4.getText().charAt(0) == word.charAt(4)) {
                                    a4.setBackground(Color.green);
                                    break;
                                } else if (a4.getText().charAt(0) == word.charAt(i)) {
                                    a4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    a4.setBackground(Color.lightGray);
                                }
                            }
                            a0.setEditable(false);
                            a1.setEditable(false);
                            a2.setEditable(false);
                            a3.setEditable(false);
                            a4.setEditable(false);
                            b0.setEditable(true);
                            b1.setEditable(true);
                            b2.setEditable(true);
                            b3.setEditable(true);
                            b4.setEditable(true);
                            line++;
                        }
                        if (j == 1 && filled1) {
                            for (int i = 0; i < 5; i++) {
                                if (b0.getText().charAt(0) == word.charAt(0)) {
                                    b0.setBackground(Color.green);
                                    break;
                                } else if (b0.getText().charAt(0) == word.charAt(i)) {
                                    b0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    b0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (b1.getText().charAt(0) == word.charAt(1)) {
                                    b1.setBackground(Color.green);
                                    break;
                                } else if (b1.getText().charAt(0) == word.charAt(i)) {
                                    b1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    b1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (b2.getText().charAt(0) == word.charAt(2)) {
                                    b2.setBackground(Color.green);
                                    break;
                                } else if (b2.getText().charAt(0) == word.charAt(i)) {
                                    b2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    b2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (b3.getText().charAt(0) == word.charAt(3)) {
                                    b3.setBackground(Color.green);
                                    break;
                                } else if (b3.getText().charAt(0) == word.charAt(i)) {
                                    b3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    b3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (b4.getText().charAt(0) == word.charAt(4)) {
                                    b4.setBackground(Color.green);
                                    break;
                                } else if (b4.getText().charAt(0) == word.charAt(i)) {
                                    b4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    b4.setBackground(Color.lightGray);
                                }
                            }
                            b0.setEditable(false);
                            b1.setEditable(false);
                            b2.setEditable(false);
                            b3.setEditable(false);
                            b4.setEditable(false);
                            c0.setEditable(true);
                            c1.setEditable(true);
                            c2.setEditable(true);
                            c3.setEditable(true);
                            c4.setEditable(true);
                            line++;
                        } else if (j == 2 && filled2) {
                            for (int i = 0; i < 5; i++) {
                                if (c0.getText().charAt(0) == word.charAt(0)) {
                                    c0.setBackground(Color.green);
                                    break;
                                } else if (c0.getText().charAt(0) == word.charAt(i)) {
                                    c0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    c0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (c1.getText().charAt(0) == word.charAt(1)) {
                                    c1.setBackground(Color.green);
                                    break;
                                } else if (c1.getText().charAt(0) == word.charAt(i)) {
                                    c1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    c1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (c2.getText().charAt(0) == word.charAt(2)) {
                                    c2.setBackground(Color.green);
                                    break;
                                } else if (c2.getText().charAt(0) == word.charAt(i)) {
                                    c2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    c2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (c3.getText().charAt(0) == word.charAt(3)) {
                                    c3.setBackground(Color.green);
                                    break;
                                } else if (c3.getText().charAt(0) == word.charAt(i)) {
                                    c3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    c3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (c4.getText().charAt(0) == word.charAt(4)) {
                                    c4.setBackground(Color.green);
                                    break;
                                } else if (c4.getText().charAt(0) == word.charAt(i)) {
                                    c4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    c4.setBackground(Color.lightGray);
                                }
                            }
                            c0.setEditable(false);
                            c1.setEditable(false);
                            c2.setEditable(false);
                            c3.setEditable(false);
                            c4.setEditable(false);
                            d0.setEditable(true);
                            d1.setEditable(true);
                            d2.setEditable(true);
                            d3.setEditable(true);
                            d4.setEditable(true);
                            line++;
                        } else if (j == 3 && filled3) {
                            for (int i = 0; i < 5; i++) {
                                if (d0.getText().charAt(0) == word.charAt(0)) {
                                    d0.setBackground(Color.green);
                                    break;
                                } else if (d0.getText().charAt(0) == word.charAt(i)) {
                                    d0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    d0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (d1.getText().charAt(0) == word.charAt(1)) {
                                    d1.setBackground(Color.green);
                                    break;
                                } else if (d1.getText().charAt(0) == word.charAt(i)) {
                                    d1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    d1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (d2.getText().charAt(0) == word.charAt(2)) {
                                    d2.setBackground(Color.green);
                                    break;
                                } else if (d2.getText().charAt(0) == word.charAt(i)) {
                                    d2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    d2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (d3.getText().charAt(0) == word.charAt(3)) {
                                    d3.setBackground(Color.green);
                                    break;
                                } else if (d3.getText().charAt(0) == word.charAt(i)) {
                                    d3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    d3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (d4.getText().charAt(0) == word.charAt(4)) {
                                    d4.setBackground(Color.green);
                                    break;
                                } else if (d4.getText().charAt(0) == word.charAt(i)) {
                                    d4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    d4.setBackground(Color.lightGray);
                                }
                            }
                            d0.setEditable(false);
                            d1.setEditable(false);
                            d2.setEditable(false);
                            d3.setEditable(false);
                            d4.setEditable(false);
                            e0.setEditable(true);
                            e1.setEditable(true);
                            e2.setEditable(true);
                            e3.setEditable(true);
                            e4.setEditable(true);
                            line++;
                        } else if (j == 4 && filled4) {
                            for (int i = 0; i < 5; i++) {
                                if (e0.getText().charAt(0) == word.charAt(0)) {
                                    e0.setBackground(Color.green);
                                    break;
                                } else if (e0.getText().charAt(0) == word.charAt(i)) {
                                    e0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    e0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (e1.getText().charAt(0) == word.charAt(1)) {
                                    e1.setBackground(Color.green);
                                    break;
                                } else if (e1.getText().charAt(0) == word.charAt(i)) {
                                    e1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    e1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (e2.getText().charAt(0) == word.charAt(2)) {
                                    e2.setBackground(Color.green);
                                    break;
                                } else if (e2.getText().charAt(0) == word.charAt(i)) {
                                    e2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    e2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (e3.getText().charAt(0) == word.charAt(3)) {
                                    e3.setBackground(Color.green);
                                    break;
                                } else if (e3.getText().charAt(0) == word.charAt(i)) {
                                    e3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    e3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (e4.getText().charAt(0) == word.charAt(4)) {
                                    e4.setBackground(Color.green);
                                    break;
                                } else if (e4.getText().charAt(0) == word.charAt(i)) {
                                    e4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    e4.setBackground(Color.lightGray);
                                }
                            }
                            e0.setEditable(false);
                            e1.setEditable(false);
                            e2.setEditable(false);
                            e3.setEditable(false);
                            e4.setEditable(false);
                            f0.setEditable(true);
                            f1.setEditable(true);
                            f2.setEditable(true);
                            f3.setEditable(true);
                            f4.setEditable(true);
                            line++;
                        } else if (j == 5 && filled5) {
                            for (int i = 0; i < 5; i++) {
                                if (f0.getText().charAt(0) == word.charAt(0)) {
                                    f0.setBackground(Color.green);
                                    break;
                                } else if (f0.getText().charAt(0) == word.charAt(i)) {
                                    f0.setBackground(Color.yellow);
                                    break;
                                } else {
                                    f0.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (f1.getText().charAt(0) == word.charAt(1)) {
                                    f1.setBackground(Color.green);
                                    break;
                                } else if (f1.getText().charAt(0) == word.charAt(i)) {
                                    f1.setBackground(Color.yellow);
                                    break;
                                } else {
                                    f1.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (f2.getText().charAt(0) == word.charAt(2)) {
                                    f2.setBackground(Color.green);
                                    break;
                                } else if (f2.getText().charAt(0) == word.charAt(i)) {
                                    f2.setBackground(Color.yellow);
                                    break;
                                } else {
                                    f2.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (f3.getText().charAt(0) == word.charAt(3)) {
                                    f3.setBackground(Color.green);
                                    break;
                                } else if (f3.getText().charAt(0) == word.charAt(i)) {
                                    f3.setBackground(Color.yellow);
                                    break;
                                } else {
                                    f3.setBackground(Color.lightGray);
                                }
                            }
                            for (int i = 0; i < 5; i++) {
                                if (f4.getText().charAt(0) == word.charAt(4)) {
                                    f4.setBackground(Color.green);
                                    break;
                                } else if (f4.getText().charAt(0) == word.charAt(i)) {
                                    f4.setBackground(Color.yellow);
                                    break;
                                } else {
                                    f4.setBackground(Color.lightGray);
                                }
                            }
                            f0.setEditable(false);
                            f1.setEditable(false);
                            f2.setEditable(false);
                            f3.setEditable(false);
                            f4.setEditable(false);
                            line++;
                        }
                    }
            }
        });
    }
    //**************// GETS RANDOM WORD FROM TXT FILE //**************//
    public static void randomWord() throws FileNotFoundException {
        File file = new File("words.txt"); // the file
        Scanner sc = new Scanner(file);
        int random = (int)(Math.random()*5751), x = 1; // random number and line number
        for(int i = 1; i<random; i++){
            sc.nextLine();
            x++;
        }
        word = sc.nextLine();
        sc.close();
        System.out.println(word+" "+x);
    }
}
