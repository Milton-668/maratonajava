package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Somente tipos de referência podem ser inicializados como nulo
        int[] idades = new int[3]; // Criado um array com 3 posições
        idades[0] = 21; // atribuindo valores ao seus índice
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]); // Apresentação dos valores apartir do índice
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
