/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicostomassolerlinares;

/**
 *
 * @author usuario
 */
public class BasicosTomasSolerLinares {

    /**
     * Método para mostrar ejemplos de tipos numericos.
     */
    public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
        }
    public static void cadenas(){
        String cadena;
        
        cadena="Cadena de texto.";
        
        System.out.println(cadena);
    }
    
    public static void logicos(int num){
        boolean logico;
        int valor = num;
        logico = valor == 'a';
        
        if (logico==true){
            System.out.println("El valor de lógico es true");
        }
        else{
            System.out.println("El valor de lógico es false");
        }
    }
    
    public static void main(String[] args) {
        numericos();
        cadenas();
        logicos(96);
    }
    
}
