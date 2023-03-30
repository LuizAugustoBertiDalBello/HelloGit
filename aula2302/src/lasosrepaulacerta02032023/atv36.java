/*3.6	Construir um programa que leia um número inteiro n1 e um número real n2.  Em seguida imprima no console:
a.	uma contagem de 0 até n1
b.	mostre a média entre n1 e n2 (note que eles têm tipos de dados diferentes)
c.	verifique se n1 é par ou ímpar, se for ímpar ler mais 2 números inteiros n3 e n4 e verificar qual deles é o maior número
 */

package lasosrepaulacerta02032023;

import java.util.Scanner;

public class atv36 {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		System.out.println("escreva n1");
		int n1 = 0;
		float n2 =0;
		n1 = tc.nextInt();
		System.out.println("escreva n2");
		n2 = tc.nextInt();
		
		for (int i=0; i <= n1; i++) {
			System.out.println(i);
		}
		
		float media = (n1 + n2)/ 2;
			System.out.printf("a media e %.2f\n",media);
		
		if((n1 % 2) == 0) {
			System.out.println("o valor e par");}
		else {
			System.out.println("o valor e impar fale 2 numeros:");
			int n3, n4 = 0;
			System.out.println("N3:");
			n3 = tc.nextInt();
			System.out.println("N4:");
			n4 = tc.nextInt();
			int maior = n3;
			if(n4 > maior) {
				maior = n4;
			}
			System.out.println("O maior valor e: "+ maior);
		}
		
		
		tc.close();
	}
}
