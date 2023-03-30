/*4.1  Solicitar ao usuário para alimentar dois vetores A e B com 10 números inteiros
 a) calcular C, sendo C[i] = A[i] / B[i], e imprimi-los de forma invertida;
 b) imprimir os números pares do vetor A.
 */


package aula09032022;

import java.util.Scanner;

public class atv41 {

	public static void main(String[] args) {
			Scanner tc = new Scanner (System.in); 
			int vetA[]= new int[10];
			int vetB[]= new int[10];
			int vetC[]= new int[10];
			int i =0;
			for(i =0; i < 10;i++) {
				vetA[i]=tc.nextInt();
			}
			
			for(i = 0; i < 10; i++) {
				vetB[i]=tc.nextInt();
			}
			
			for(i =0; i < 10; i++) {
				vetC[i] = vetA[i] / vetB[i];

			}

			for(i = 9; i >= 0; i--) {
				System.out.println(vetC[i]);
			}
			
			for(i =0; i < 10; i++) {
				if ((vetA[i] % 2)==0) {
					System.out.println(vetA[i]);
				}
			}
			tc.close();
		}
}
