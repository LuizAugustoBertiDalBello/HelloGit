package aula2302;

import java.util.Calendar;

public class calendario {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);
		
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia = "+ dia);
		
		int mes = calendario.get(Calendar.MONTH);
		//mes++;
		System.out.printf("Mês = %d\n", mes+1);

	}

}