package Cbilletes;

public class Diez {
    public int C;

    public void sacar(int C){
        if (C >= 10){
            int N = C/10;
            System.out.println(" se entrega "+ N +" billetes de 10 dolares ");
        }
    }
}
