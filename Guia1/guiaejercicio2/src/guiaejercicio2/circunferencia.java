/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author yese
 */
public class circunferencia {
    private double datos;
    private int numero;
    public double area;
    public int  menu () {
        
        do {
            numero= Integer.parseInt(JOptionPane.showInputDialog("Que dato desea ingresar?\n 1-Ingresar Radio.\n 2-Ingresar diametro"));
        }while(numero<0 || numero>2);
        return numero;   
    }
    public double dato (){
        if (numero==1){
        datos=Integer.parseInt(JOptionPane.showInputDialog("ingrese el radio"));}
        else {datos=Integer.parseInt(JOptionPane.showInputDialog("ingrese el diametro"));}
        return datos;
       
    }
    public double calculo (){
        if (numero==1){
            area= Math.PI*datos*datos;
        }
        else {area= Math.PI*(datos/2)*(datos/2);
        }
        return area;
    }
    public void imprimir (double area){
        System.out.println("el area de la circunferencia es\nA="+area);
    }
    
   
    
}
