package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {

    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >=1000

        double parcela;
        double valorCarro = 20000;
        /*Nesse caso nós temos um decremento das parcelas(contador), no caso o valor inicial
        * da parcela é o valor do carro e cada vez que ele passar pelo for ele
        * decrementará o valor. Nós temos uma lógica onde ele dividirá o valor total
        * do carro pelo valor da parcela(contador), abaixo temos uma condicional que quando o
        * valor da parcela que enquanto o valor da parcela for menor do que 1000 ele continuará
        * a executar o for, quando atingir parcelas apartir de 1000 ele sairá do if e apresentará
        * o valor da parcela*/
        for (parcela = valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + "R$ " + valorParcela);
        }
    }
}
