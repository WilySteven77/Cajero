package Cbilletes;
//import
public class Cincuenta {
    public int C;

    public void sacar(int C){
        if (C >= 50){
            int N = C/50;
            int Ret = C%50;
            System.out.println(" se entrega "+ N +" billetes de 50 dolares ");
            if (Ret != 0){
                Veinte V1 = new Veinte();
                V1.sacar(Ret);
            }
        }
        else {
            Veinte V1 = new Veinte();
            V1.sacar(C);
        }
    }
}
