package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraIfElseAnidada {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la cantidad de su salario");
            double salario = Double.parseDouble(leer.nextLine());
            ifElseAnidada(salario);
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void ifElseAnidada(double salario){
        if(salario > 235){
            System.out.println("Usted gana mas del salrio minimo");            
        }else if(salario > 0){
            System.out.println("Usted gana menos del salario minimo");    
    }else{
            System.out.println("Ingreso de datos erroneo!!");
        }
        
        
    }
}
