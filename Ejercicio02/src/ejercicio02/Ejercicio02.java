
package ejercicio02;
// autor pablo
import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double lado1, lado2, lado3, lado4, lado5, lado6;
        System.out.println("Ingresa el lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Ingresa el lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Ingresa el lado 3");
        lado3 = teclado.nextDouble();
        lado4 = lado1 + lado2;
        lado5 = lado1 + lado3;
        lado6 = lado2 + lado3;
        System.out.println("===============================");
        if ((lado4 < lado3) || (lado5 < lado2) || (lado6 < lado1)){
            System.out.println("No es triangulo");
        } else if ((lado1 == lado2) && (lado2 == lado3)){
            System.out.println("equilatero");
        } else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)){
            System.out.println("isosceles");
        } else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)){
            System.out.println("escaleno");
        }    
    }
}
        
    
