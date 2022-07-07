package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*Padrão de inicialização de arrays por tipos*/
        // byte, short, int, long, float e double -> 0
        // char -> '\u0000'
        // boolean -> false
        // Objects references - String  -> null

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Roberta";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        //Quando atribuimos o array novamente ele perde sua referência inicial
        //e agora a sua referência passa a ser apartir da nova atribuição
        nomes = new String[5];
    }
}
