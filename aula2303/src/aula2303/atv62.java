package aula2303;

import java.util.Scanner;

public class atv62 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Declarando os vetores que armazenarão as temperaturas
        int[] temperaturaMaxima = new int[12];
        int[] temperaturaMinima = new int[12];
        
        // Preenchendo os vetores com os dados do usuário
        for(int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura máxima do mês " + (i+1) + ": ");
            temperaturaMaxima[i] = input.nextInt();
            System.out.print("Digite a temperatura mínima do mês " + (i+1) + ": ");
            temperaturaMinima[i] = input.nextInt();
        }
        
        // Chamando os métodos estáticos para encontrar a maior e a menor temperatura
        int maiorTemperatura = EncontrarMaiorTemperatura(temperaturaMaxima);
        int menorTemperatura = EncontrarMenorTemperatura(temperaturaMinima);
        
        // Mostrando os resultados na tela
        MostrarResultado(maiorTemperatura, "maior", temperaturaMaxima);
        MostrarResultado(menorTemperatura, "menor", temperaturaMinima);
    }
}