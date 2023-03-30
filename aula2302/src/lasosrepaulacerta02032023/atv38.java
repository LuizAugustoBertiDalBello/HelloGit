package lasosrepaulacerta02032023;

import java.util.Calendar;

public class atv38 {

	public static void main(String[] args) {

		Calendar cal= Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		float salario = 1000;
		float aumento = 0.015f;
		
		salario *= (1 + aumento);
		System.out.printf("Ano: 2018\nSalario: %.2f \n", salario);
		
		for(int ano = 2019; ano <= anoAtual; ano++ ) {
			salario *= (1 + aumento);
			System.out.printf("Ano: %d \nSalario: %.2f \n",ano, salario);
			aumento *= 2;
			
		}
	}
}
