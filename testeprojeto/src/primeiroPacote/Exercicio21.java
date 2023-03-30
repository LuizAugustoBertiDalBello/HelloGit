/*uma empresa contrata programadores para desenvolver projetos em suas casas. faça um programa que pergunte ao usuário qual o valor pago a ele por hora de trabalho e quantas horas ele trabalhou em um projeto. em seguida, mostre o valor equivalente a ser recebido por ele.  lembre-se de formatar os números. */
package primeiroPacote;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor");
		float valor = teclado.nextFloat();
		System.out.println("Quantas horas: ");
		int horas = teclado.nextInt();
		
		float total = (float) valor * horas;
		System.out.printf("o valor total = R$%.2f", total);
		
		teclado.close();
	}

}
