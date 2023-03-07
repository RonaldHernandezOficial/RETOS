import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        //Declarar variables
        Float pesoBebe;
        double mesesBebe;
        double dosisVacuna;
        String nombreRep;
        String nombreEnf;

        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese el nombre del representante legal: ");
        nombreRep = lectura.nextLine();

        System.out.println("Ingrese el nombre del enfermero(a) encargado de la vacunación:");
        nombreEnf = lectura.next();

        System.out.println("Ingrese el peso del bebé:");
        pesoBebe = lectura.nextFloat();

        System.out.println("Ingrese cuantos meses tiene el bebé:");
        mesesBebe = lectura.nextDouble();

        //Crear la condición
        dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10)) * 8;

        System.out.println("El bebé pesa: " + pesoBebe + " Kg");
        System.out.println("Los meses del bebé son: " + mesesBebe);
        System.out.println("El representante del bebé es: " + nombreRep);
        System.out.println("El encargado de la dósis es: " + nombreEnf);
        System.out.println("La cantidad de dosis a aplicar es: " + dosisVacuna + " Mlg ");
        
        //Limpiar el buffer
        lectura.close();
    }
}
