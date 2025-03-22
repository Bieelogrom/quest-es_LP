package Lote_1_1;

public class exercicio_41 {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = 1; j <= 6; j++){
                if(j + i == 7){
                    System.out.println(i+" + "+j+" = "+(i+j));
                }
            }
        }
    }
}
