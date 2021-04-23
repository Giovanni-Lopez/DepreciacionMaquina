package estructuras.ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraFor {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero limite de repeticiones");
            String limite = leer.nextLine();
            
            instruccionFor(Integer.parseInt(limite));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void instruccionFor(int valorLimite){
        for (int i = 1; i <= valorLimite; i++) { 
            System.out.println("El valor de la repeticion es: " + i);
        }
    }
}
