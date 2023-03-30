package aula2303;

import java.util.Scanner;
public class Matrizlinha {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, j;
		float matriz[][], vetor[];
		matriz = new float[3][5];
		vetor = new float[3];
		
		for(i=0; i<3; i++) {
			vetor[i]=0;
		}
		System.out.println("Informe os valores para a matriz: ");
		for(i=0; i<3; i++) {
			for (j=0; j<5; j++) {
				matriz[i][j] = ler.nextFloat();
			}				
		}
		//chamada do método somaLinhas
		somaLinhas(matriz, vetor);
		
		for(i=0; i<3; i++) {
			System.out.printf("A soma da linha %d é %.2f.\n", i, vetor[i]);
		}
		ler.close();
	}
	// le as linhas depois as colunas
	public static void somaLinhas(float m[][], float v[]) {
		int i,j;
		for (i=0; i<m.length; i++) {
			for (j=0; j<m[i].length;j++) {
				v[i] += m[i][j];
			}
		}
	}
	public static void mostra(float m[][], float v[]) {
		System.out.println("Matriz");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
			 	System.out.printf(" %.2f ",m[i][j]);
			}
			System.out.println(" ");
		}

		// com laço for 	
		System.out.println("Vetor");
		for(int i = 0; i < 3; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println(" ");

		// ou com forEach
		System.out.println("Vetor");
		for(float x: v) {
			System.out.print(x +" ");
		}
		System.out.println(" ");
	}

}
