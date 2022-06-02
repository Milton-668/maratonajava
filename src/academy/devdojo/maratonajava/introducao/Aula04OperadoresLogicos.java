package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {

        // Operadores Lógicos && (AND) || (OR) ! (NOR)
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation
                || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        System.out.println("----------------------------------------------------------");

    }
}
