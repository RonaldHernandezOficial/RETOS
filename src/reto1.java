import java.util.Scanner;

public class reto1 {
    public static void main(String[] args){
        //Declarar variables
        int precalentado;
        float gradosKelvin;
        float graFahrenheit;

        //Instanciar clase

        Scanner lectura=new Scanner(System.in);

        System.out.println("Precalentado (350° Fahrenheit) ");
        graFahrenheit = lectura.nextFloat();

        System.out.println("Precalentado (350° Kelvin) ");
        gradosKelvin = lectura.nextFloat();

        //Crear la condición
        double centigradosF = (graFahrenheit - 32) / 1.8;

        System.out.println("Los grados centigrados con Fahrenheit es: " + centigradosF);

        double centigradosK = (graFahrenheit + 459.67) * 5 / 9;

        System.out.println("Los grados centigrados con Kelvin es: " + centigradosK);

        //Limpiar el buffer
        lectura.close();

    }
}
