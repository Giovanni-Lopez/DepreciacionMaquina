package estructuras.condicionales;

/**
 *
 * @author Alexis López
 */

import java.util.Scanner;

public class EstructuraIfSencilla {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresa la cantidad de su salario");
            double salario = Double.parseDouble(leer.nextLine());
            ifSencillo(salario);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void ifSencillo (double salario){
        if(salario > 235){
            System.out.println("Usted gana mas del salario minimo");
        }
    }
}
