package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {

    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100

        int num = 0;

        for (int i = 0; i <= 100; i++) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
