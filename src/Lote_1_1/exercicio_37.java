package Lote_1_1;

public class exercicio_37 {
    public static void main(String[] args) {

        int fib = 0, nac = 1, aux;

        for(int i = 0; i < 9; i++){
            System.out.println(fib);
            aux = fib;
            fib = nac + fib;
            nac = aux;
        }
    }
}
