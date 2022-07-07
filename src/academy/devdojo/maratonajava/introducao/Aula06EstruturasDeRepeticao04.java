package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >=1000

        double parcela;
        double valorCarro = 20000;
        /*Nesse caso nós temos um incremento das parcelas, onde o valor da parcela inicial é 1
        * enquanto o valor da parcela for menor ou igual ao do carro o contador passará
        * Dentro da for existe uma validação com o for onde que a cada vez que passar e o valor
        * for menor do que 1000 ele pulará e mostrará apenas os valores da parcela apartir de 1000*/
        for (parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcelas = valorCarro / parcela;
            if (valorParcelas < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcelas);
        }
    }
}
