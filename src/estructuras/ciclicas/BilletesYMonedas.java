package estructuras.ciclicas;

import static java.lang.System.in;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Giovanni López
 */
public class BilletesYMonedas {
/*
     2-. Una agencia de llamadas necesita saber el precio por las llamadas telefónicas realizadas por sus clientes y así poder
    calcular el monto a pagar. 
    
    Para ello se solicita realizar un programa en Java que determine el monto a pagar por una
    llamada telefónica y que luego diga la cantidad de billetes y monedas a pagar por el cliente teniendo en cuenta lo siguiente:
    
    Una llamada que dura hasta 3 minutos tiene un costo de 20 centavos, por cada minuto adicional que dura la llamada
    se le sumará un monto de 0.5 centavos adicionales, por lo tanto se debe leer el tiempo de la llamada.
    El programa deberá de imprimir el número de billetes y de monedas que el usuario debe de pagar por el servicio de la llamada
    realizada. Por ejemplo si el usuario tiene que pagar $15.50
    
    el programa deberá de imprimir lo siguiente: 1 billete de diez dólares, un billete de cinco dólares y dos monedas de
    veinticinco centavos.
    Monedas: 1, 5,10 y 25 centavos
    Billetes: 1, 5, 10, 20 dólares
    Considere que debe darse la menor cantidad de billetes y monedas posibles.
    El nombre de la clase creada será: BilletesYMonedas. 
*/
    
    public double minutos;

    public double getMinutos() {
        return minutos;
    }

    
    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }
    
    //METODO MAIN
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        NumberFormat formato = new DecimalFormat("#,###.##");
        
        BilletesYMonedas monto = new BilletesYMonedas();
        
        String[] vector;
        
        System.out.println("Ingrese el tiempo de duracion de la llamada");
        monto.setMinutos(Double.parseDouble(leer.nextLine()));
        
        double dinero = monto.precioPorLlamada(monto.getMinutos());
        
        // Conversion del dinero a string 
        String pisto = String.valueOf(dinero);
        
        vector = new String[pisto.length()];
        
        for (int i = 0; i < pisto.length(); i++) {
            vector[i] = pisto.substring(i);                        
        }
        System.out.println("==============================");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("" + vector[i]);            
        }
        System.out.println("El precio por su llamada es: $" +formato.format(monto.precioPorLlamada(monto.getMinutos())));
        System.out.println("==============================");                

        /*
            Monedas: 1, 5,10 y 25 centavos
            Billetes: 1, 5, 10, 20 dólares
        */
            
        double billetes_de_10, billetes_de_20, billetes_de_5 , billete_de_1;
        double moneda_de_25, moneda_de_10, moneda_de_5, monedas_de_1, moneda_001;
 
        monedas_de_1 = monto.precioPorLlamada(monto.getMinutos());
        
        billetes_de_20 =(monedas_de_1-monedas_de_1%20)/20;
        monedas_de_1 = monedas_de_1 % 20;
        
        billetes_de_10 =(monedas_de_1-monedas_de_1%10)/10;
        monedas_de_1 = monedas_de_1 % 10;
        
        billetes_de_5 =(monedas_de_1-monedas_de_1%5)/5;
        monedas_de_1 = monedas_de_1 % 5;
        
        billete_de_1 = (monedas_de_1-monedas_de_1%1)/1;
        monedas_de_1 = monedas_de_1 % 1;
        
        moneda_de_25 = (monedas_de_1-monedas_de_1%0.25)/0.25;
        monedas_de_1 = monedas_de_1 % 0.25;
        
        moneda_de_10 = (monedas_de_1-monedas_de_1 %0.10)/0.10;
        monedas_de_1 = monedas_de_1 %  0.10;
        
        moneda_de_5 = (monedas_de_1 - monedas_de_1 % 0.05)/0.05;
        monedas_de_1 = monedas_de_1 % 0.05;
        
        moneda_001 = (monedas_de_1 - monedas_de_1 % 0.01)/0.01;
        monedas_de_1 = monedas_de_1 % 0.01;
        
        System.out.println("Valor de billetes de 10 ------>" + (int)billetes_de_10);

        System.out.println("Valor de billetes de 20 ------>" + (int)billetes_de_20);

        System.out.println("Valor de billetes de 5 ------>" + (int)billetes_de_5);
        
        System.out.println("Valor de billetes de 1 ------>" + (int)billete_de_1);


        System.out.println("Valor de monedas de 0.25 centavos ------>" + (int)moneda_de_25);
        
        System.out.println("Valor de monedas de 0.10 centavos ------>" + (int)moneda_de_10);
        
        System.out.println("Valor de monedas de 0.05 centavos ------>" + (int)moneda_de_5);
                                              
        System.out.println("Valor de monedas de 0.01 centavo ------>" + (int)moneda_001);

    }        
    
    // METODO PRECIOPORLLAMADA
    public double precioPorLlamada(double tiempo_minutos){
        double costoLlamada = 0;
        double minutos_extra = 0;
        double pagominExtras = 0;
        if(tiempo_minutos > 3){
            minutos_extra = tiempo_minutos - 3; // Minutos extra          
        }else{
            minutos_extra = 0;
        }        
        pagominExtras = minutos_extra * 0.05; // centavos
        costoLlamada = 0.2 + pagominExtras;        
        return costoLlamada;
    }
    

}
