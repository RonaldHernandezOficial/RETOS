import java.util.Random;
import java.util.Scanner;

public class reto4{
    public static void main(String[] args) {

        //Declarar variables
        int jugador;
        int bot;
        int ronda = 1;
        int puntajeJugador = 0;
        int puntajeBot = 0;
        int saldo = 0;
        int apuesta;


        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random rand=new Random();

        System.out.println("¿Quieres jugar al juego de Piedra, Papel o Tijera?");
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
        System.out.println("El primer jugador en ganar 3 rondas será el ganador.");
        System.out.println("Tu saldo actual es: " + saldo);

        while (puntajeJugador < 3 && puntajeBot < 3) {
            System.out.println("Ronda " + ronda + ":");
            System.out.println("Por favor, selecciona tu opción:");
            System.out.println("1. Piedra");
            System.out.println("2. Papel");
            System.out.println("3. Tijera");

            jugador = lectura.nextInt();

            if (jugador < 1 || jugador > 3) {
                System.out.println("Opción inválida. Por favor selecciona 1, 2 o 3.");
                continue;
            }

            bot = rand.nextInt(3) + 1;

            System.out.println("El bot seleccionó: " + bot);

            if (jugador == bot) {
                System.out.println("Empate :O");
            } else if (jugador == 1 && bot == 3 || jugador == 2 && bot == 1 || jugador == 3 && bot == 2) {
                saldo = saldo + apuesta ;
                System.out.println("Ganaste la ronda :D ");
                puntajeJugador++;
            } else {
                System.out.println("El bot ganó la ronda :( )");
                saldo = saldo - apuesta;
                puntajeBot++;
            }


            System.out.println("Puntaje actual:");
            System.out.println(nombre + ": " + puntajeJugador);
            System.out.println("Bot: " + puntajeBot);

            ronda++;
        }

        if (puntajeJugador > puntajeBot) {
            System.out.println("Felicidades " + nombre + " Has ganado el juego, eres mejor que el bot :D ");
        } else {
            System.out.println("Lo siento, " + nombre + ". el bot ha ganado el juego, el bot es mejor que tu, mala suerte :( ");
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