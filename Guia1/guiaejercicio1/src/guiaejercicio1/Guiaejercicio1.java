
package guiaejercicio1;

import javax.swing.JOptionPane;

 //Calcular el área,y la diagonal de una figura de 4 lados. Se debe de ser capaz de ingresar el tamaño de los lados de la figura y se debe devolver(mostrar) el resultado. 
public class Guiaejercicio1 {
    

    
    public static void main(String[] args) {
       pedirlados objeto = new pedirlados();
       
      Double Area= objeto.calculararea(objeto.validar(), objeto.validar());
      Double Diagonal= objeto.diagonal(objeto.validar(), objeto.validar());
      objeto.imprimir(Area,Diagonal );
    }
    
}
