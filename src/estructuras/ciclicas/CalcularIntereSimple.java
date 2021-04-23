package estructuras.ciclicas;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class CalcularIntereSimple {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("INGRESAR LA SIGUIENTE INFORMACION:");
            System.out.println("Cantidad de dinero depositado:");
            double cantidad = Double.parseDouble(leer.nextLine());
            
            System.out.println("Cantidad de años del repositorio");
            int años = Integer.parseInt(leer.nextLine());
            
            System.out.println("Interes anual por el deposito: ");
            double interes = Double.parseDouble(leer.nextLine());
            System.out.println("-------------------------------------");
            
            interesSimple(cantidad, años, interes);            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void interesSimple(double cantidad, int años, double interes){
        for(int i = 1; i <= años; i++){
            double interesPoraños = cantidad * (interes / 100);
            cantidad += cantidad * (interes / 100);
            System.out.println("Cantidad interes en el año: " + i + ": " + interesPoraños);
            System.out.println("Monto interes mas dinero: " + cantidad);
            System.out.println("----------------------------------------");            
        }
    }
    
}
