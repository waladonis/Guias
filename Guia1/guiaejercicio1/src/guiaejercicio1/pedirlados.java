
package guiaejercicio1;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;
import java.math.BigDecimal.*;

public class pedirlados {

   
   public double validar (){
       double lado1;
       do {
           lado1= Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero"));
       }while (lado1<0 || lado1>100);
       return lado1;
   } 
   public double calculararea (double lado1,double lado2){
       double area= lado1*lado2;
   return area;
   }
   public double diagonal (double lado1, double lado2 ){
   double diagonal= sqrt(Math.pow(lado1,2)+Math.pow(lado2,2));
       return diagonal;
   
   
   }
   public void imprimir (double area, double diagonal){
      System.out.println("el area de la figura es \n"+area+"la diegonal de la figura es \n"+diagonal);
   }
    
}
