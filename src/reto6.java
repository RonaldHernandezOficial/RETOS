import java.util.Random;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        //Declarar variables
        String nomUsu;
        int usu; 
        int bot;
        int numRepe = 0;
        int juegosJug = 0;
        int vidas = 3;
        double sumaG = 0;
        double sumaP = 0;
        double valorAp = 0;
        double saldo = 0;
        double sumaT = 0;
       
        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        Random rand=new Random();

        System.out.println("Por favor digite su nombre");
        nomUsu = lectura.next();
        System.out.println("Digite el numero de veces que quieres jugar máximo 10: ");
        numRepe = lectura.nextInt();   
        
        //Crear la condición
        if (numRepe > 10 || numRepe < 0) {
            System.out.println("El numero de juegos no es correcto");
            return;
        }
        System.out.println("digite el saldo a inicial: ");
        saldo = lectura.nextDouble();
        System.out.println("digite el valor que desea apostar: ");
        valorAp = lectura.nextInt();

        while (vidas > 0 && juegosJug < numRepe) {
        
        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.println("Por favor, seleccione:");
        System.out.println("1. Cara");
        System.out.println("2. Sello");

        usu = lectura.nextInt();
        
        if (usu < 1 || usu > 2) {
            System.out.println("Opción incorrecta. Por favor seleccione 1 o 2.");
            return;
        }

        bot = rand.nextInt(2) + 1;

        System.out.print("Cayó: ");

        switch (bot) {
            case 1:
                System.out.println("Cara");
                break;
            case 2:
                System.out.println("Sello");
                break;
        }

        if (usu == bot) {
            System.out.println("Ganaste venciste la maquina");
            sumaG = valorAp * 0.1;
            valorAp = valorAp + sumaG;
            System.out.println("Has ganado: " + valorAp);
            saldo = saldo + valorAp;
            System.out.println("Tu saldo es: " + saldo);
            juegosJug = juegosJug + 1;
            System.out.println("Usted ha jugado: "+ juegosJug);
            sumaT = sumaT + sumaG;
        } else {            
            System.out.println("Perdiste la maquina te vencio");
            sumaP = valorAp * 0.1;
            valorAp = valorAp - sumaP;
            System.out.println("Gracias por jugar: " + nomUsu + " perdio: "+sumaP);
            vidas = vidas - 1;
            saldo = saldo - valorAp;
            System.out.println("Tu saldo es de: " + saldo);
            System.out.println("Te quedan: " + vidas + " vidas");
            juegosJug = juegosJug + 1;
            System.out.println("Has jugado: "+ juegosJug);
            sumaT = sumaT - sumaP;
        }
        
        }
            System.out.println("Gano o perdio: " + sumaT);

            //Limpiar el buffer
            lectura.close();

    }
}