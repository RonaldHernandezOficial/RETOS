import java.util.Random;
import java.util.Scanner;

public class reto8{
    public static void main(String[] args) {
        //Declarar variables
        int Aleatorio = 0;
        int intentos = 0;
        boolean numadi = false;
        int numIntentos = 0;
        int numeroIngresado = 0;

        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random random=new Random();
        Aleatorio = random.nextInt(100) + 1;

        System.out.println("Adivina un número del 1 al 100:");
        System.out.println("Ingrese el número de intentos que deseas tener maximo (10):");
        numIntentos = lectura.nextInt();

        //Crear la condición
        
        while(numadi || intentos < numIntentos){
            numeroIngresado = lectura.nextInt();
            intentos++;

            if (numeroIngresado == Aleatorio) {
                System.out.println("Felicidades, has adivinado el número en " + intentos + " intentos.");
                numadi = true;
            } else if (numeroIngresado < Aleatorio) {
                System.out.println("El número es mayor que, ya casi " + numeroIngresado);
            } else {
                System.out.println("El número es menor que, ya casi " + numeroIngresado);
            }
        }   

        if (numadi) {
            System.out.println("Has superado el número máximo de intentos, tienes mala suerte");
            System.out.println("El número era: " + Aleatorio);
        }

        //Limpiar el buffer
        lectura.close();

    }
}