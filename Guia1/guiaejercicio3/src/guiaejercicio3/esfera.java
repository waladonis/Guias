
package guiaejercicio3;

import javax.swing.JOptionPane;

public class esfera {
    private double datos;
    private int numero;
    public double volumen;
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
            volumen= Math.PI*datos*datos*datos*4/3;
        }
        else {volumen= Math.PI*(datos/2)*(datos/2)*(datos/2)*4/3;
        }
        return volumen;
    }
    public void imprimir (double volumen){
        System.out.println("el volumen de la esfera es\nV="+volumen);
    }
    
    
}
