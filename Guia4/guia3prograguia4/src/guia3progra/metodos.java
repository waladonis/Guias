
package guia3progra;


public class metodos {
    public int puntaje;
    public int modelos;
    public int bateriapantalla (int pantalla , double bateria){
        if (pantalla==4 && bateria<=1200){
            puntaje=3; 
        }
        else if(pantalla==4 && bateria>1200 || bateria<=2400){
            puntaje=4;
        }
         else if(pantalla==4 && bateria>2400 || bateria<=3100){
            puntaje=5;
        }
         else if(pantalla==4 && bateria>3100){
            puntaje=6;
        }
        if (pantalla<=5 && pantalla>4 && bateria<=1200 ){
            puntaje=1;    
        }
         else if(pantalla<=5 && pantalla>4 && bateria>1200 || bateria<=2400){
            puntaje=2;
        }
        else if(pantalla<=5 && pantalla>4 && bateria>2400 || bateria<=3100){
            puntaje=3;
        }
         else if(pantalla<=5 && pantalla>4  && bateria>3100){
            puntaje=4;
        }
       return puntaje; 
    }
    public int refDeMarca(int modelos){
        if (modelos==0 || modelos==9 || modelos==2 || modelos==3 || modelos==5){
            puntaje=4;
        }
        else if (modelos==6 || modelos ==7 || modelos==8){
            puntaje=3;
        }
        else {puntaje=2;}
        
       return puntaje; 
    }
    public int rangoPrecio(double precio){
        if (precio<100){
          puntaje=2;   
        } 
        else if(precio>=100 || precio<=350){
            puntaje=3;
        }
        else if (precio>350){
            puntaje=4;
        }
        
    
  return puntaje;  
    }
    public int garantia(int garantia){
        if (garantia<=3){
            puntaje=1; 
        }
        else if (garantia>3 || garantia<=6){
            puntaje=2;
        }
        else if (garantia>6){
            puntaje=4;
        }
        
    return puntaje;
    } 
    public int Cpu(int cpu){
        if (cpu==2){
            puntaje=0;
        }
        else if (cpu==4){
            puntaje=1;
        }
        else if (cpu==6){
            puntaje=2;
        }
        else if (cpu==8){
            puntaje=3;
        }
        return puntaje;
    }
    public int Ram(Double ram){
        if (ram<=1){
            puntaje=0;
        }
        else if (ram>1 && ram<=2){
            puntaje=2;
        }
         else if (ram>2 && ram<=4){
            puntaje=4;
        }
         else if (ram>4){
            puntaje=6;
        }
    
    return puntaje;
    
    }
    public int pixelaje(int principal, int frontal, boolean flash){
        if (principal<=5 && frontal<2){
            puntaje=1;
        }
        else if (principal<=5 && frontal>2){
            puntaje=2;
        }
         else if (principal>5 && principal<=8 && frontal<2){
            puntaje=1;
        }
         else if (principal>5 && principal<=8 && frontal>1 && frontal<=3){
            puntaje=2;
        }
         else if (principal>5 && principal<=8 && frontal>3){
            puntaje=3;
        }
         else if (principal>8 && frontal<2){
            puntaje=1;
        }
         else if (principal>8 && frontal>2 && frontal<5){
            puntaje=2;
        }
        else if (principal>8 && frontal>5){
            puntaje=3;
        }
        
    if (flash==true){
        puntaje=puntaje;
        
    }else{puntaje=puntaje-1;}
            
    return puntaje;
    }
    
}
