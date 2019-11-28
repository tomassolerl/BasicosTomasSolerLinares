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
        logicos(96);
    }
    
}
