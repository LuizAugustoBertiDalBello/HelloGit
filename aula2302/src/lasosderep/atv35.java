//Construir um programa que obtenha a data do sistema e mostra essa informação com o nome do mês por extenso, usando switch.  

package lasosderep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class atv35 {

	public static void main(String[] args) {
		 // obtém a data atual do sistema
        LocalDate dataAtual = LocalDate.now();
        
        // define o formato para exibição da data com o nome do mês por extenso
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        
        // exibe a data atual com o nome do mês por extenso
        System.out.println("Data atual: " + dataAtual.format(formato));
        
        // obtém o número do mês atual
        int mesAtual = dataAtual.getMonthValue();
        
        // exibe o nome do mês atual por extenso, usando switch
        switch (mesAtual) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido.");
        }
	}
}
