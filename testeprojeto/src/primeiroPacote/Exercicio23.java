/*Construa um programa para que o usuário informe a altura entre 2 andares de uma construção e informe a quantidade de degraus que deseja construir.  Em seguida o sistema deve calcular e mostrar qual a altura de cada um dos degraus que deverão ser construídos para que a escada ligue o primeiro ao segundo andar.  Note que todos os degraus devem ter a mesma altura.  A altura entre os andares será fornecida em metros e a altura do degrau deverá ser fornecida em centímetros.
 */
package primeiroPacote;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe a altura entre 2 andares");
		float Altura = teclado.nextFloat();//Altura em Metros
		System.out.println("infome quantos degraus");
		int Degrau = teclado.nextInt();
		float alturaDegrau = Altura / Degrau;
		System.out.printf("Os degraus terão %.2f de altura", alturaDegrau );
		teclado.close();
	}

}
