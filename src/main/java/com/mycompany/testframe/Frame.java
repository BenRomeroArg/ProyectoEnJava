/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testframe;

import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class Frame extends JFrame {

    private double n1 = 0.0, n2, descu = 0.0, pago;
    private final JLabel v1, v2;
    private JLabel aviso, resultado;
    private JTextField valor1, valor2;
    private final JButton boton, boton2;

    public Frame() {
        v1 = new JLabel("Ingresar valor del producto: ");
        v1.setFont(new Font("Courier New", Font.BOLD, 14));
        v1.setForeground(Color.BLACK);
        v1.setBounds(20, 25, 230, 70);
        valor1 = new JTextField(10);
        valor1.setBounds(280, 45, 80, 25);
        v2 = new JLabel("Ingrese el % de interes: ");
        v2.setFont(new Font("Courier New", Font.BOLD, 14));
        v2.setForeground(Color.BLACK);
        v2.setBounds(20, 65, 230, 70);
        valor2 = new JTextField(10);
        valor2.setBounds(280, 85, 80, 25);
        boton = new JButton("CALCULAR");
        boton.setBounds(100, 160, 150, 30);
        boton2 = new JButton("SALIR");
        boton2.setBounds(100, 200, 150, 30);

        aviso = new JLabel();
        aviso.setBounds(50, 210, 300, 100);
        aviso.setFont(new Font("Courier New", Font.BOLD, 18));
        aviso.setForeground(Color.BLUE);
        resultado = new JLabel();
        resultado.setBounds(50, 265, 300, 100);
        resultado.setFont(new Font("Algerian", Font.BOLD, 22));
        resultado.setForeground(Color.RED);
        Container panel = getContentPane();
        panel.setLayout(null);
        panel.add(v1);
        panel.add(v2);
        panel.add(aviso);
        panel.add(valor1);
        panel.add(valor2);
        panel.add(boton);
        panel.add(boton2);
        panel.add(resultado);
        panel.setBackground(Color.lightGray);
        boton.addActionListener((ActionEvent e) -> {
            n1 = Float.parseFloat(valor1.getText());
            n2 = Integer.parseInt(valor2.getText());
            descu = (n1 / 100) * n2;
            pago = n1 + descu;
            if (n1 > 10) {
               
                aviso.setText("Total de interes: " + descu);
                resultado.setText("El precio final : " + pago);
            }
        });
        boton2.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
    }
}
