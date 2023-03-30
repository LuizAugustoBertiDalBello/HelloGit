package aula09032022;

import java.util.Scanner;

public class atv42 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		String A[] = new String [10];
		int i = 0 ;
		for(i =0; i < 10;i++) {
			A[i] = tc.nextLine();
		}
		for(i=0;i < 10;i++) {
			System.out.println(A[i]);
		}
		for(i=9;i >= 0;i--) {
			System.out.println(A[i]);
		
		}
		tc.close();
	}
}