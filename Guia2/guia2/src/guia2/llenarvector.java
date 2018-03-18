/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import javax.swing.JOptionPane;


public class llenarvector {
     
    
    public char[] llenarvector () {
       char vector [] =new char [10];
       for (int i =0; i<10;i++){
          do{
          String letrae = (JOptionPane.showInputDialog("ingrese una letra para la pocision "+ (i+1) +"\nen caso de escribir mas de un caracter solo se evaluara el primero")+"");
          
          if (letrae.equals("a") || letrae.equals("b")|| letrae.equals("c")|| letrae.equals("d")|| letrae.equals("e")|| letrae.equals("f")|| letrae.equals("g")|| letrae.equals("h")|| letrae.equals("i")|| letrae.equals("j")|| letrae.equals("k")|| letrae.equals("l")|| letrae.equals("m")|| letrae.equals("n")|| letrae.equals("o")|| letrae.equals("p")|| letrae.equals("q")|| letrae.equals("r")|| letrae.equals("s")|| letrae.equals("t")|| letrae.equals("u")|| letrae.equals("v")|| letrae.equals("w")|| letrae.equals("x")|| letrae.equals("y")|| letrae.equals("z") && letrae!=null){
          vector[i]= letrae.charAt(0);
          break;
          }
          else{
          JOptionPane.showMessageDialog(null,"letra incorrecta");
          
          }
          
          }while(true);
           
       }
       
        return vector;
    
}
    
    public char[] ordenar (char vector[]){
        
        char modelo [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        char ordena[] = new char[10];
        int pocision = 0;
        for(int i=0;i<modelo.length;i++){
            for(int i2=0;i2<10;i2++){
              if (vector[i2] == modelo [i]){
                  ordena[pocision]= vector[i2];
                  pocision++;
              
              }
            
            }
        
        }
       
    
    return ordena;
    }
}
