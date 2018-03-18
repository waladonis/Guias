
package guiaejercicio3;


public class Guiaejercicio3 {

    
    public static void main(String[] args) {
        // Calcular el volumen de una esfera. Se debe de poder ingresar el radio o el diámetro de la esfera y mostrar el resultado correcto 
        esfera Esfera = new esfera();
        Esfera.menu();
        Esfera.dato();
        Esfera.calculo();
        Esfera.imprimir(Esfera.volumen);
    }
    
}
