/*Construir um programa que determine a data cronologicamente maior (posterior) entre duas datas informadas pelo usuário.  Cada data deve ser composta por 2 valores inteiros, sendo o primeiro o dia e o segundo o mês.
 * 
 */
package lasosderep;

import java.util.Scanner;

public class atividade32 {
	
	public static void main(String[] args){
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("informe a 1 data");
		int dia1 = teclado.nextInt();
		System.out.println("informe a 1 mes");
		int mes1 = teclado.nextInt();
		System.out.println("informe a 1 ano");
		int ano1 = teclado.nextInt();
		
		System.out.println("informe a 2 data");
		int dia2 = teclado.nextInt();
		System.out.println("informe a 2 mes");
		int mes2 = teclado.nextInt();
		System.out.println("informe a 2 ano");
		int ano2 = teclado.nextInt();
		
	if (ano1 > ano2 || (ano1 == ano2 && (mes1 > mes2 || (mes1 == mes2 && dia1 > dia2)))) {
			System.out.println("A primeira data é cronologicamente maior.");
		} else if (ano2 > ano1 || (ano1 == ano2 &&(mes2 > mes1 || (mes1 == mes2 && dia2 > dia1)))) {
			System.out.println("A segunda data é cronologicamente maior.");
		} else {
			System.out.println("as datas são iguais");
		}
		
		teclado.close();
	}
}
