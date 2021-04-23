package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraifElse {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de su salario");
            double salario = Double.parseDouble(leer.nextLine());
            ifElse(salario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         
    }
    
    
    public static void ifElse(double salario){
        if(salario > 235){
            System.out.println("Usted gana mas del salrio minimo");            
        }else{
            System.out.println("Usterd gana menos del salario minimo");
        }
    }
}
