/*3.7	Dado o valor de um depósito fixo mensal e um montante desejado, determine quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.  Mostrar a cada mês qual é o valor obtido e ao final informar a quantidade de meses.
 */

package lasosrepaulacerta02032023;

import java.util.Scanner;

public class atv37 {
	
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        char operacao = entrada.next().charAt(0);
        double[][] M = new double[12][12];
        
        // ler a entrada para a matriz 2D
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = entrada.nextDouble();
            }
        }
        
        double soma = 0;
        int contador = 0;
        
        // calcular a soma ou a média dos elementos acima da diagonal
        for (int i = 0; i < 12; i++) {
            for (int j = i+1; j < 12; j++) {
                soma += M[i][j];
                contador++;
            }
        }
        
        // imprimir o resultado
        if (operacao == 'S') {
            System.out.printf("%.1f\n", soma);
        } else if (operacao == 'M') {
            double media = soma / contador;
            System.out.printf("%.1f\n", media);
        }
        
        entrada.close();
	}






}