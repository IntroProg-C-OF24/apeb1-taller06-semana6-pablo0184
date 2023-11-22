
package ejercicio03;
// autor pablo
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double var1;
        String var2;
        System.out.println("Ingresa tu region (local, nacional, ...)");
        var2 = teclado.nextLine();
        System.out.println("Ingresa el peso del paquete");
        var1 = teclado.nextDouble();
        if ((var1 < 5) && (var2.equals("local"))){
            System.out.println("El costo vale $5");
        } else if (((var1 >= 5) && (var1 <=10)) && (var2.equals("nacional"))){
            System.out.println("El costo vale $10");
        } else {
            System.out.println("El costo vale $15");
        }
    }
}
        // TODO code application logic here
    
    

