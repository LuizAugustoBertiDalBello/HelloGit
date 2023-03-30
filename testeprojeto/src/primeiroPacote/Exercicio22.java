/*2.2 Implemente um programa para calcular e mostrar a área de um trapézio, sabendo que:
	h = altura, b = base menor, B = base maior, Área = (h x (b + B)) / 2 
 */
package primeiroPacote;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("informe o valor de H");
		float H = teclado.nextFloat();
		System.out.println("informe o valor de b");
		float b = teclado.nextFloat();
		System.out.println("informe o valor de B");
		float B = teclado.nextFloat();
		float Area = (((b + B)*H) /2);
		
		System.out.printf("A area e %.2f", Area);
		teclado.close();
		
	}

}
