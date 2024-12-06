/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica10;
import javax.swing.JOptionPane;


/**
 *
 * @author lizbe
 */
public class Practica10 {

    public static void main(String[] args) {
       String baseStr=JOptionPane.showInputDialog("Introduce la base del triangulo:");
       double base=Double.parseDouble(baseStr);
         // Solicitar la altura del triángulo
        String alturaStr = JOptionPane.showInputDialog("Introduce la altura del triángulo:");
        double altura = Double.parseDouble(alturaStr);
        double area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es de: "+area);
    }
}

