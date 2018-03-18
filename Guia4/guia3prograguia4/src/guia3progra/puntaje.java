
package guia3progra;


public class puntaje {
    
    public double bateriapantalla (double pantalla){
        int puntaje=0;
        int bateria=0;
        if (pantalla <=4 && bateria<=1200){
            puntaje=3;}
        else if(pantalla<=4 && (bateria>1200 && bateria<=2400)){
            puntaje=4;}
        else if (pantalla<=4 && (bateria>2400 && bateria<3100)){
            puntaje=5;}
        else if (pantalla<=4 && bateria>3100){
            puntaje=6;}
        return puntaje;
    }
    
    
    
    
}
