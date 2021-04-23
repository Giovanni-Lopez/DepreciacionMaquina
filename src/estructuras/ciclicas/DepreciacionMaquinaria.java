package estructuras.ciclicas;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Alexis López
 */
public class DepreciacionMaquinaria {
    /*
    1-. Hacer un programa que determine la depreciación aplicada a bienes basado en el costo de la maquinaria y el número de
    años en que será depreciada utilizando el método de la suma de los dígitos del año. 
    
    El programa deberá permitir ingresar el costo de la maquinaria, el nombre de la máquina y el periodo de tiempo en el cual esta será depreciada. 
    
    El programa deberá imprimir el valor de la depreciación en cada año de uso de la maquinaria.
    
    Para el método de la suma de los dígitos del año para el cálculo de la Depreciación de Bienes, la fórmula que se aplica es: 
    (Vida Útil/Suma Dígitos)*Valor Activo
    
    Donde se tiene que: Suma de los dígitos es igual a (V(V+1))/2 donde V es la vida útil del activo.
    
    Ahora determinemos el factor. Supongamos una máquina de producción cuyo valor es de
    $30,000.00. A. (5(5+1))/2 B. (5*6)/2 = 15 Luego C. 5/15 = 0.3333
    
    Es decir que para el primer año, la depreciación será igual al 33.333% del valor del activo.
    (30,000.00 * 33.3333% = 10,000.00)
    
    Para el segundo año: 4/15 = 0.2666
    Es decir que para el segundo año la depreciación corresponde al 26.666% del valor del activo
    (30,000.000 * 26,666% = 8,000.00)
    
    Para el tercer año: 3/15 = 0.2
    Quiere decir entonces que la depreciación para el tercer año corresponderá al 20 del valor del activo. (30,000.00 * 20% = 6,000.00)
    */
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese costo de la maquinaria: ");
            double costoMaquinaria = Double.parseDouble(leer.nextLine());
            
            System.out.println("Ingrese nombre de la maquinaria: ");
            String nombreMaquinaria = leer.nextLine();

            sumaDígitosAño(costoMaquinaria, 5);
            
            System.out.println("COSTO DE MAQUINARIA: $" + costoMaquinaria);
            System.out.println("NOMBRE DE LA MAQUINARIA: " + nombreMaquinaria);
            
                                  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void sumaDígitosAño(double costoMaquinaria, double años){        
        NumberFormat formato = new DecimalFormat("#,###.##");
        
        double sumaDigitos = (años * (años + 1)) / 2;
        
        System.out.println("===============Datos===============");
        
        for(int i = 1; i <= años; años--){
                        
            double factor = (años / sumaDigitos);
            double depreciacion = costoMaquinaria * factor;
            
            System.out.println("Año : " + formato.format(años));
            System.out.println("Factor: " + formato.format(factor));
            System.out.println("Depreciacion: " + formato.format(depreciacion));
            System.out.println("===================================");           
        }
       
        
    }
    
}
