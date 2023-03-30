/*5.1 Construir um programa que lê uma frase e
- mostra o tamanho do string original
- cria outro string sem os espaços no início ou no final e mostra seu tamanho  
- conta a quantidade de vogais
- conta a quantidade de palavras
- substitui os números por * em uma nova string 
 */

package aula1603;

import java.util.Scanner;

public class atv51 {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = tc.nextLine();
        System.out.println("Frase original: " + frase);
        System.out.println("Tamanho = " + frase.length());
        
        String fraseSemEspacos = frase.trim();
        System.out.println("Frase sem espaços no início ou fim: " + fraseSemEspacos);
        System.out.println("Tamanho = " + fraseSemEspacos.length());
        
        int vogais = frase.toLowerCase().replaceAll("[^aeiou]", "").length();
        System.out.println("Quantidade de vogais: " + vogais);
        
        String[] palavras = frase.split("\\s+");
        System.out.println("Quantidade de palavras: " + palavras.length);
        
        System.out.println("Digite uma palavra a ser substituída:");
        String palavraBusca = tc.nextLine();
        
        if (frase.contains(palavraBusca)) {
            System.out.println("Digite a palavra de substituição:");
            String palavraSubstituta = tc.nextLine();
            String fraseModificada = frase.replace(palavraBusca, palavraSubstituta);
            System.out.println("Frase modificada: " + fraseModificada);
        } else {
            System.out.println("A palavra não foi encontrada na frase.");
        }
        
        tc.close();
    }
}

