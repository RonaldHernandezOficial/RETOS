import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Declarar variables
        int cantidadProducto;
        double valorCompra = 0;
        int cantidadProductReg = 0;
        int precioProducto; 
        String nombrePro;
        double iva = 0;

        //Instanciar clases
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de los productos a comprar: ");
        cantidadProducto= lectura.nextInt();

        //Crear la condición
        while(cantidadProductReg < cantidadProducto){
        System.out.println("Digite el nombre del producto");
        nombrePro = lectura.next();
            System.out.println("Ingrese el valor del producto: ");
            precioProducto = lectura.nextInt();

            valorCompra =  precioProducto + valorCompra;
            cantidadProductReg = cantidadProductReg + 1;

        }

        iva = valorCompra * 0.19;
        valorCompra = valorCompra + iva;
        
        System.out.println("El total de su compra es: " + valorCompra);

        //Limpiar el buffer
        lectura.close();

    }
}
