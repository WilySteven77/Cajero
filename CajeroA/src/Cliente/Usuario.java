package Cliente;
import Cbilletes.Cincuenta;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args){
        while (true){
            int aumenta =0;
            System.out.println("Ingrese la cantidad que va a retirar");
            Scanner Cantidad = new Scanner(System.in);
            aumenta = Cantidad.nextInt();
            if (aumenta % 10 != 0){
                System.out.println("La cantidad no es multiplo de 10");
                return;
            }
            else {
                Cincuenta C1 = new Cincuenta();
                C1.sacar(aumenta);
            }
        }
    }
}
