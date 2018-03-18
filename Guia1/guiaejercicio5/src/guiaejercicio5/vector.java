
package guiaejercicio5;

import javax.swing.JOptionPane;


public class vector {
    
    int tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de notas que desee"));

    double vector []= new double [tamano];
    int inicio;
    double nota;
    double suma;
    double promedio;
    public double llenar (){
        
        for (inicio=0;inicio<vector.length;inicio++){
            do{
            nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota  #"+(inicio +1)));
            
            }while(nota<0 || nota>10);
            vector[inicio]=nota;
        }
        return nota;
        
        
        
    }
    public double calculo(){
        for (inicio=0;inicio<vector.length;inicio++){
            suma= suma + vector[inicio];     
        }
        promedio= suma/tamano;
        return promedio;
    }
    
    public void imprimir (){
        System.out.println("El promedio de los alumnos es: "+promedio);
    }
    
    
    
    
}
