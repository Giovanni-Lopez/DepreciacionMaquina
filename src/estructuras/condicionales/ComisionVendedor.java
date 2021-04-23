package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class ComisionVendedor {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese valor de la venta");
            double valorVenta = Double.parseDouble(leer.nextLine());
            
            System.out.println("Ingrese el genero del vendedor");
            String genero = leer.nextLine();
             calcularComision(valorVenta, genero.toUpperCase().charAt(0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }
    public static void calcularComision( double valorVenta, char generoVendedor){
    double comision, salario = 0.0;
    
    String genero = "";
    
    if(generoVendedor == 'M'){
        genero = "Masculino";
        comision = valorVenta * 0.03;
        salario = comision + 200;        
    }else if(generoVendedor == 'F'){
        genero = "Femenino";
        comision = valorVenta * 0.05;
        salario = comision + 200;        
    }
        System.out.println("El salario del vendedor " +  genero + " es de " + salario);
    }
}
