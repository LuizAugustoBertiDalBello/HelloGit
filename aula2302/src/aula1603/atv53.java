package aula1603;
import java.util.Scanner;

public class atv53 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
        
        // lê a frase informada pelo usuário
        System.out.print("Digite uma frase: ");
        String frase = tc.nextLine();
        
        // solicita a palavra a ser substituída
        System.out.print("Digite a palavra a ser substituída: ");
        String pAntiga = tc.nextLine();
        
        // procura a palavra na frase
        int posicao = frase.indexOf(pAntiga);
        if (posicao == -1) {
            System.out.println("A palavra não foi encontrada na frase.");
            return;
        }
        
        // solicita a nova palavra
        System.out.print("Digite a nova palavra: ");
        String pNova = tc.nextLine();
        
        // substitui a palavra na frase
        String fraseModificada = frase.substring(0, posicao) + pNova + frase.substring(posicao + pAntiga.length());
        
        // mostra a frase original e a frase modificada
        System.out.println("Frase original: " + frase);
        System.out.println("Frase modificada: " + fraseModificada);
    
        tc.close();
	}

}
