package aula09032022;
import java.util.Arrays;
public class atv43 {

	public static void main(String[] args) {
		int divmedia =0;
		int soma =0;
		int somapar =0;
		int i = 0;
		int Random[]= new int[10];
		
		for(i =0; i < Random.length; i++) {
			Random[i]=(int)(1 + Math.random()*(11));
			System.out.println(Random[i]);
			soma += Random[i];
			if ((Random[i] % 2) ==0) {
				somapar += Random[i];
				divmedia ++;
			}
		}
		
		System.out.println(soma);
		
		double media = (double)somapar / divmedia;
		System.out.println(media);
		
		System.out.println("Minimum value: " + Arrays.stream(Random).boxed().min(Integer::compare).get());
		
		System.out.println("Maximum value: " + Arrays.stream(Random).boxed().max(Integer::compare).get());
	}

}
