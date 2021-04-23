package estructuras.ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class LecturaCaracteres {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre: ");
            String nombre = leer.nextLine();
            
            leerCaracteresFor(nombre.toUpperCase());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void leerCaracteresFor(String palabra){
        for(int i = 0; i < palabra.length(); i++){
            System.out.println("Caracter: " + i + "->: " + palabra.charAt(i));            
        }
        
    }
}
