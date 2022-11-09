/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue, Estudiante aprobado con un promedio: 8.1 
 * CASO CONTRARIO presentar un mensaje con el siguiente texto, 
 * Estudiante reprobado con un promedio: 7.4 
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        //Declaro variables
        double promedio1;
        double promedio2;
        double promediototal;
        
        //Pido los datos ´por teclado
        System.out.println("Ingrese el promedio de la nota 1 por favor");
        promedio1 = entrada.nextDouble();// Para ingresar valores numéricos
        
        System.out.println("Ingrese el promedio de la nota 2 por favor");
        promedio2 = entrada.nextDouble();
        
        promediototal = (promedio1 + promedio2) / 2; /*Operación para obtener
        el promedio final*/
        
        //Verificar si es promedio es mayor o igual a 7.5
        if (promediototal >= 7.5) {//Si es verdadero se ejecuta el If
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promediototal);
        }else{//Si es Falso se ejecuta el else
            System.out.printf("Estudiante reprobado con un "
                    + "promedio: %.2f\n", promediototal);
        }
    }
    
}
