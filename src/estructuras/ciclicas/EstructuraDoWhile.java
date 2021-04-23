package estructuras.ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraDoWhile {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un numero limite de repeticion:");
            String limite = leer.nextLine();
            
            instruccionDoWhile(Integer.parseInt(limite));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void instruccionDoWhile(int valorLimite){
        int i = 1;
        do{
            System.out.println("El valor de la repeticion es: " + i);
            i++;
        }while(i <= valorLimite);
        
    }
}
