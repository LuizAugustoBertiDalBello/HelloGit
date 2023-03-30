/*3.1 – Construir um programa que apresente uma mensagem para o usuário informando se ele pode votar, dependendo da idade que tem.  Considerar que 
a)	Até 15 anos não vota	
b)	Entre 16 e 17 é opcional
c)	Entre 18 e 70 é obrigatório
d)	Acima de 70 é opcional
 */

package lasosderep;

import java.util.Scanner;

public class atividade31 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = teclado.nextInt();
		if (idade >=18 && idade <=70) {
			System.out.println("E obrigatorio votar");}
		else if (idade <= 17 && idade > 15) {
			System.out.println("O voto e opcional");}
		else if (idade <= 15) {
			System.out.println("Nao pode votar");}
		else
			System.out.println("Acima de 70 nao volta");
		teclado.close();
		

	}

}
