
package guiaejercicio4;

import javax.swing.JOptionPane;


public class cubo {
    private double diagonal;
    private double volumen;
    private double arista;
    
    public double dato (){
        diagonal= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la diagonal del cubo"));
        return diagonal;
    }
    public double calculo (){
        diagonal=diagonal;
        arista= diagonal/ Math.sqrt(2);
        volumen= arista*arista*arista;
        return volumen;
    }
    public void imprimir () {
        System.out.println(volumen);
    }
    
    
}
