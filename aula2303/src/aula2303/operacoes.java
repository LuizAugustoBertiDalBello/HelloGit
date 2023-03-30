package aula2303;

public class operacoes {

	int n1 = 10;
	int n2 = 20;

	// Com retorno (int)
	public static int somar(int n1, int n2) {
		int soma = 0;
		soma = n1 + n2;
		return soma;
	}

	public static int soma2(int... args) {
		int total = 0;
		for (int i = 0; i < args.length; i++) {
			total += args[i];
		}
		return total;
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

	
	public static void chamaOutro() {
		System.out.println("Executando no primeiro método");
		outroMetodo();
	}

	private static void outroMetodo() {
		System.out.println("Executando no segundo método");
		
	}

}