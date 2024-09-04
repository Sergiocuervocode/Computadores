/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author SERGIO CUERVO 20241222272
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

//una tienda esta ofeciendo descuento a sus clientes por el numero de equipos que compra. 
//si compra menos de cinco computadores tendra un 10% de descuento
//Si compra cinco o mas computadoras pero, menos de diez tendra un 20% de descuento
//si compra diez o mas de diez computadoras tendra un 40% de descuento
        int computadoras;
        int preciodelacompu;
        double Descuento;
        double valordelacompra;
        Scanner cliente = new Scanner(System.in);
        System.out.println("Cuantas computadoras va a comprar?: ");
        computadoras = cliente.nextInt();

        if (computadoras < 5) {
            preciodelacompu = (computadoras*500);
            Descuento = (preciodelacompu*0.10);
            valordelacompra = (preciodelacompu - Descuento);
            System.out.println("El valor de su compra incluido con el 10% de descuento es de: " + valordelacompra);
        }
        if (computadoras >= 5 && computadoras < 10) {
            preciodelacompu = (computadoras*500);
            Descuento = (preciodelacompu*0.20); 
            valordelacompra = (preciodelacompu - Descuento);
            System.out.println("El valor de su compra incluido con el 20% de descuento es de: " + valordelacompra);
        }
        if (computadoras >= 10) {
            preciodelacompu = (computadoras*500);
            Descuento = (preciodelacompu*0.40); 
            valordelacompra = (preciodelacompu - Descuento);
            System.out.println("El valor de su compra incluido con el 40% de descuento es de: " + valordelacompra);

            System.out.println("Gracias por su compra!!");
        }
    }
}
