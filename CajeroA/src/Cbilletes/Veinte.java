package Cbilletes;

public class Veinte {
    public int C;

    public void sacar(int C){
        if (C >= 20){
            int N = C/20;
            int Ret = C%20;
            System.out.println(" se entrega "+ N +" billetes de 20 dolares ");
            if (Ret != 0){
                Diez D1 = new Diez();
                D1.sacar(Ret);
            }
            else {
                Diez D1 = new Diez();
                D1.sacar(C);
            }
        }
    }
}
