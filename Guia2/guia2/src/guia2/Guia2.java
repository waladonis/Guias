/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;


import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author DN7B43
 */
public class Guia2 {
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String seleccion;
        llenarvector objeto = new llenarvector();
        JOptionPane.showMessageDialog(null, "llene el vector la primera vez");
        char auxiliar[] = objeto.llenarvector();
        
       do {
       seleccion = JOptionPane.showInputDialog("ingrese 1 para llenar el vector \n ingrese 2 para ordenarla \n ingrese 3 para mostrarla");
       
       if (seleccion.equals("1")){
        auxiliar = objeto.llenarvector();
       }
        if (seleccion.equals("2")){
           auxiliar = objeto.ordenar(auxiliar);
           JOptionPane.showMessageDialog(null, "ordenado correctamente");
       
       }
        if (seleccion.equals("3")){
        
        
        String salida ="";
        
            for(int i2=0;i2<10;i2++){
              salida =salida + String.valueOf(auxiliar[i2] + "\t");
              
            
        salida=salida+"\n";
       
        }
         JTextArea hoja = new JTextArea(salida);
        JOptionPane.showMessageDialog(null, hoja);
        salida = "";
        }

         if (seleccion.equals("0")){
             JOptionPane.showMessageDialog(null, "Adios!!!");
          break;
       }
       
       }while(true);
    }
    
}
