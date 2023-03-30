package aula2302;

public class atividade {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = maior(a,b);
		if(c != 0) {
			System.out.print("O maior valor é " + c);
		}else {
			System.out.println("Os valores são iguais");
		}

	}	
	
	public static int maior(int x, int y) {
		if (x>y) return x;
		else if(x<y) return y;
		else return 0;
	}
}