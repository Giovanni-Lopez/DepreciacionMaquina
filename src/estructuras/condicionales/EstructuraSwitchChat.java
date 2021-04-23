package estructuras.condicionales;

import java.util.Scanner;

/**
 *
 * @author Alexis López
 */
public class EstructuraSwitchChat {
    public static void main(String[] args) {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el estado civil de la persona:");
            String estadoCivil = leer.nextLine();
            switchChar(estadoCivil.toUpperCase().charAt(0));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void switchChar(char estadoCivil){
        String mensajeEstadoCivil;
        switch(estadoCivil){
            case 'S':
                mensajeEstadoCivil = "Soltero/a";
                break;
            
            case 'C':
                mensajeEstadoCivil = "Casado/a";
                break;
                
            case 'D':
                mensajeEstadoCivil = "Divorsiado/a";
                break;
                
            case 'A':
                mensajeEstadoCivil = "Acompañado/a";
                break;
                
            case 'F':
                mensajeEstadoCivil = "Forever Alone";
                break;
                
            default:
                mensajeEstadoCivil = "Estado civil erroneo!!!";
                break;
        }
        System.out.println("Su estado civil es: " + mensajeEstadoCivil);
        
    }
}
