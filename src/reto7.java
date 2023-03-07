import java.util.Random;
import java.util.Scanner;

public class reto7 {
    public static void main(String[] args){
        //Declarar variables
        String nomUsu;
        int usu; 
        int consola;
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

        System.out.println("Por favor ingresa tu nombre");
        nomUsu = lectura.next();
        System.out.println("Ingresa el número de veces que quieres jugar, como máximo 10: ");
        numRepe = lectura.nextInt();    
        
        //Crear la conidición
        if (numRepe > 10 || numRepe < 0) {
            System.out.println("El número de juegos supera el maximo");
            return;
        }
        System.out.println("Ingresa el saldo a inicial: ");
        saldo = lectura.nextDouble();
        System.out.println("Ingresa el valor que desea apostar: ");
        valorAp = lectura.nextInt();

        

        while (vidas > 0 || juegosJug < numRepe) {
        
        System.out.println("Bienvenido al juego de piedra, papel o tijeras");
        System.out.println("Por favor, seleccione: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        usu = lectura.nextInt();

        
        if (usu < 1 || usu > 3) {
            System.out.println("Opción incorrecta, por favor seleccione 1 o 3");
            return;
        }

        consola = rand.nextInt(3) + 1;

        System.out.print("El bot eligio: ");

        switch (consola) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijeras");
                break;
        }

        if (usu == consola) {
            System.out.println("Empataron");
            juegosJug = juegosJug + 1;
            System.out.println("Has jugado: " + juegosJug);
        } else if(usu == 2 || consola == 3 || usu == 1 || consola == 2 || usu == 3 || consola == 2){            
            System.out.println("Ganaste venciste a el bot");
            sumaP = valorAp * 0.3;
            valorAp = valorAp + sumaG;
            juegosJug = juegosJug + 1;
            saldo = saldo + valorAp;
            System.out.println("Gracias por jugar: " + nomUsu +" su saldo anterior es de: " +saldo+ " ganaste: " +sumaG+ " los has hecho en: " +juegosJug);
            sumaT = valorAp + sumaG;
        }else{
            System.out.println("Perdiste el bot te gano");
            sumaP = valorAp * 0.3;
            valorAp = valorAp - sumaP;
            System.out.println("Gracias por jugar: " + nomUsu +" su saldo anterior es de: " +saldo+ " perdiste: " +sumaP+ " los has hecho en: " +juegosJug);
            vidas = vidas - 1;
            System.out.println("Te quedan: "+vidas+" vidas");
            sumaT = valorAp - sumaP;
        }
        }
            System.out.println("Gano o perdio: " + sumaT);

            System.out.println("Gracias por usar el programa.");

            //Limpiar el buffer
            lectura.close();
        }
}