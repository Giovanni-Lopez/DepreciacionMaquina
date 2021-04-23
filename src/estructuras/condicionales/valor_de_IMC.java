package estructuras.condicionales;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Alexis López
 */
public class valor_de_IMC {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese su peso en kg");
            double peso = Double.parseDouble(leer.nextLine());

            System.out.println("Ingrese su estatura, ejemplo 1.65");
            double estatura = Double.parseDouble(leer.nextLine());

            masaCorporal(peso, estatura);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }
    public static void masaCorporal(double peso, double estatura){       
        NumberFormat formato = new DecimalFormat("#,###.##");
        double imc = peso /  Math.pow(estatura,2);
                
        if(imc < 18){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Peso bajo. Necesario valorar signos de desnutrición");
        }else if(imc > 18 && imc <= 24.9){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Normal");            
        }else if(imc >= 25 && imc <= 26.9){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Sobre peso");
        }else if(imc >= 27 && imc <= 29.9){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Obesidad grado I. Riesgo relativo alto para desarrollar enfermedades cardiovasculares");           
        }else if(imc >= 30 && imc <= 39.9){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Obesidad grado II. Riesgo relativo muy alto para el desarrollo de enfermedades cardiovasculares");
        }else if(imc > 40){
            System.out.println("\nIndice de masa corporal: " + formato.format(imc) + "\nClasificacion: Obesidad grado III Extrema o Mórbida. Riesgo relativo extremadamente alto para el desarrollo de enfermedades cardiovasculares");            
        }      
    }
}
