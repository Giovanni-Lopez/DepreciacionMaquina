package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class Calculadora {
    /*
        1-. El ejercicio de la calculadora de la guía 2 modificarlo de tal manera que el usuario permita seleccionar que operación realizar
        S = Suma; R = Resta; M = Multiplicación y D = División, tomando en cuenta que no se puede dividir entre 0.
    */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese la operacion a realizar S, R, M, D");
            String operacion = leer.nextLine();
            
            calculadora(operacion.toUpperCase().charAt(0));
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void calculadora(char operacion){
        Scanner leer = new Scanner(System.in);
        String mensajeOperacion = "";
        
        double cantidad1, cantidad2;
        double resultado = 0.0;
        
        switch(operacion){
            case 'S':
                mensajeOperacion = "Suma";                
                System.out.println("Ingrese primera cantidad: ");
                cantidad1 = Double.parseDouble(leer.nextLine());
                
                System.out.println("Ingrese segunda cantidad: ");
                cantidad2 = Double.parseDouble(leer.nextLine());
                
                resultado = cantidad1 + cantidad2;
                break;
            case 'R':
                mensajeOperacion = "Resta";
                System.out.println("Ingrese primera cantidad: ");
                cantidad1 = Double.parseDouble(leer.nextLine());
                
                System.out.println("Ingrese segunda cantidad: ");
                cantidad2 = Double.parseDouble(leer.nextLine());
                
                resultado = cantidad1 - cantidad2;
                break;
            case 'M':
                mensajeOperacion = "Multiplicacion";
                System.out.println("Ingrese primera cantidad: ");
                cantidad1 = Double.parseDouble(leer.nextLine());
                
                System.out.println("Ingrese segunda cantidad: ");
                cantidad2 = Double.parseDouble(leer.nextLine());
                
                resultado = cantidad1 * cantidad2;
                break;
            case 'D':
                mensajeOperacion = "Division";
                
                System.out.println("Ingrese primera cantidad: ");
                cantidad1 = Double.parseDouble(leer.nextLine());
                
                System.out.println("Ingrese segunda cantidad: ");
                cantidad2 = Double.parseDouble(leer.nextLine());
                
                if(cantidad2 == 0){
                    System.out.println("\nNo es posible dividir entre 0!!!\n");
                }else{
                resultado = cantidad1 / cantidad2;
                }

                break;
            default:
                System.out.println("Operacion erronea!!");
                break;
        }
        System.out.println("Operacion seleccionada: " + mensajeOperacion + "\nResultado: " +  resultado);
    }
}
