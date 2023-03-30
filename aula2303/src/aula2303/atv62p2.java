package aula2303;

public class atv62p2 {
    
    public static int EncontrarMaiorTemperatura(int[] temperaturas) {
        int maior = temperaturas[0];
        for(int i = 1; i < temperaturas.length; i++) {
            if(temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }
        return maior;
    }
    
    
    public static int EncontrarMenorTemperatura(int[] temperaturas) {
        int menor = temperaturas[0];
        for(int i = 1; i < temperaturas.length; i++) {
            if(temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }
        return menor;
    }
    
    
    public static void MostrarResultado(int temperatura, String tipo, int[] temperaturas) {
        String nomeMes = "";
        int indice = -1;
        if(tipo.equals("maior")) {
            for(int i = 0; i < temperaturas.length; i++) {
                if(temperaturas[i] == temperatura) {
                    indice = i;
                    break;
                }
            }
            nomeMes = ObterNomeMes(indice);
            System.out.println("A maior temperatura do ano foi " + temperatura + "º no mês de " + nomeMes + ".");
        }
        else {
            for(int i = 0; i < temperaturas.length; i++) {
                if(temperaturas[i] == temperatura) {
                    indice = i;
                    break;
                }
            }
            nomeMes = ObterNomeMes(indice);
            System.out.println("A menor temperatura do ano foi " + temperatura + "º no mês de " + nomeMes + ".");
        }
    }
    

    public static String ObterNomeMes(int indice) {
        String[];
    }
}
