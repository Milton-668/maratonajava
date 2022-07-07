package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

    public static void main(String[] args) {
        int[] numeros = new int[3]; //Tamanho do Array
        int[] numeros2 = {1, 2, 3, 4, 5}; //Tamanho do Array, com seu conteúdo
        int[] numeros3 = new int[]{5, 4, 3, 2, 1}; //Tamanho do Array com seu tipo e com seu conteúdo

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        System.out.println("-------------------");
        /*O foreach faz uma varredura apartir da variável de referência
         * que é necessário ser do mesmo tipo do Array, passando por cada
         * um dos valores do Array*/
        for (int num : numeros2) {
            System.out.println(num);
        }
        System.out.println("--Exemplo de funcionamento do forEach--");
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3[1];
        System.out.println(num);

    }
}
