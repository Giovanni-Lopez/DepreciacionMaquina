package estructuras.ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraWhile {
        
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingresar un numero limite de repeticiones");
            String limite = leer.nextLine();
            
            if(limite == null){
                System.out.println("Datos invalidos");                
            }else{
                intruccionWhileSencillo(Integer.parseInt(limite));
            }            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }            
    }
    public static void intruccionWhileSencillo(int valorLimite){
        int i = 1;
        while (i <= valorLimite) {            
            System.out.println("El valor de la repeticion es: " + i);
            i++;            
        }
    }
}
