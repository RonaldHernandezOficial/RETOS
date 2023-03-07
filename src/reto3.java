import java.util.Random;
import java.util.Scanner;

public class reto3 {
        public static void main(String[] args) {

            //Declarar variables
            int jugador;
            int moneda;
            int ronda = 1;
            int puntajeJugador = 0;
            int puntajeBot = 0;
            int saldo = 0;
            int apuesta;

            //Instanciar clases
            Scanner lectura=new Scanner(System.in);
            Random rand=new Random();

            System.out.println("¿Quieres probar tu suerte en el cara y sello?");
            System.out.print("Ingresa tu nombre: ");
            String nombre = lectura.nextLine();

            
            System.out.print("Introduce tu saldo inicial, (100000) de regalo: ");
            saldo = lectura.nextInt();

            System.out.print("Introduce la cantidad que quieres apostar: ");
            apuesta = lectura.nextInt();

            //Crear la condición

            if (apuesta > saldo) {
                System.out.println("No tienes suficiente saldo para realizar esa apuesta.");
            }

            System.out.println("Hola, " + nombre + " Va a comenzar el juego, preparate ");
            System.out.println("Probemos tu suerte.");
            System.out.println("Tu saldo actual es: " + saldo);

            while (puntajeJugador < 3 && puntajeBot < 3) {
                System.out.println("Lanzamiento " + ronda + ":");
                System.out.println("Por favor, selecciona tu opción:");
                System.out.println("1. Cara");
                System.out.println("2. Sello");


                jugador = lectura.nextInt();

                if (jugador < 1 || jugador > 2) {
                    System.out.println("Opción inválida. Por favor selecciona 1 o 2");
                    continue;
                }

                moneda = rand.nextInt(3) + 1;

                System.out.println("El bot seleccionó: " + moneda);

                if (jugador == moneda) {
                    System.out.println("Empataron, los dos escogieron lo mismo");
                } else if (jugador == 1 && moneda == 2 || jugador == 2 && moneda == 1 || jugador == 1 && moneda == 2) {
                    saldo = saldo + apuesta ;
                    System.out.println("Cayó de tu lado :D ");
                    puntajeJugador++;
                } else {
                    System.out.println("Cayó del otro lado :( ");
                    saldo = saldo - apuesta;
                    puntajeBot++;
                }

                System.out.println("Puntaje actual:");
                System.out.println(nombre + ": " + puntajeJugador);
                System.out.println("Bot: " + puntajeBot);


                ronda++;
            }

            if (puntajeJugador > puntajeBot) {
                System.out.println("Felicidades " + nombre + " Has ganado el juego, tienes muy buena suerte ");
            } else {
                System.out.println("Lo siento, " + nombre + ". el bot ha ganado, tienes muy mala suerte, sigue intentandi ");
            }

            
            System.out.println(nombre + " Tu saldo final es de: " + saldo);

            if (saldo <= 0) {
                System.out.println("Has perdido todo tu dinero.");
                
            }

            System.out.println("Gracias por usar el programa.");
            
            //Limpiar el buffer

            lectura.close();
        }
}
