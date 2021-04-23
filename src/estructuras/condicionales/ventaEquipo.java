package estructuras.condicionales;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Alexis López
 */
public class ventaEquipo {
    /*
    2-. La empresa Compu Smart se dedica a la venta de equipos de computación. Vende tanto computadoras como
        dispositivos periféricos y consumibles. 
    
        La empresa cuenta con un grupo de 5 vendedores a los cuales les paga la comisión según el rango de la venta efectuada. 
    
        Si el vendedor vende de $3000 en adelante la comisión es el 10%, si vende de $1000 a $2999 gana el 8% y 
        
        si la venta es de 1$ a $999 gana un 5%. Pero cada vendedor tiene un salario base de $300 al cual se le suma el valor de la comisión por ventas. 
    
        Determinar el salario líquido de un vendedor según el monto de la venta realizada tomando en cuenta que se descuenta el 10% en concepto de renta.
    
    */
    
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese valor de vente: $");
            double valorDeVenta = Double.parseDouble(leer.nextLine());
            
            calcularSalarioLiquido(valorDeVenta);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void calcularSalarioLiquido(double valorDeVenta){
        NumberFormat formato = new DecimalFormat("#,###.##");
        
        double comision = 0.0;
        double sumaSalarioBaseMasComision = 0.0;
        double descontandoRenta = 0.0;
        double salarioLíquido = 0.0;
        
        if(valorDeVenta >= 3000){
            comision = valorDeVenta * 0.1;
            sumaSalarioBaseMasComision = 300 + comision;
            descontandoRenta = sumaSalarioBaseMasComision * 0.1;
            salarioLíquido = sumaSalarioBaseMasComision - descontandoRenta;
            
        }else if(valorDeVenta >= 1000 && valorDeVenta <= 2999){
            comision = valorDeVenta * 0.08;
            sumaSalarioBaseMasComision = 300 + comision;
            descontandoRenta = sumaSalarioBaseMasComision * 0.1;
            salarioLíquido = sumaSalarioBaseMasComision - descontandoRenta;
            
        }else if(valorDeVenta >= 1 && valorDeVenta <= 999){
            comision = valorDeVenta * 0.05;
            sumaSalarioBaseMasComision = 300 + comision;
            descontandoRenta = sumaSalarioBaseMasComision * 0.1;
            salarioLíquido = sumaSalarioBaseMasComision - descontandoRenta;
            
        }
        System.out.println("Su comision de ventas: $" + formato.format(comision));
        System.out.println("Salario base mas la comision es de: $" + formato.format(sumaSalarioBaseMasComision));
        System.out.println("Se desconto el 10% del concepto renta: $" + formato.format(descontandoRenta));
        System.out.println("Salario liquido es de: $" + formato.format(salarioLíquido));
    }
}
