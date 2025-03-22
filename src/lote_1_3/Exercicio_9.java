package lote_1_3;

public class Exercicio_9 {
	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		
		int valor = 1;
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					System.out.print("["+(valor)+"]");
				}else {
					System.out.print("["+matriz[i][j]+"]");
				}
			}
			System.out.println("");
			valor *= 4;	
		}
	} 
}
