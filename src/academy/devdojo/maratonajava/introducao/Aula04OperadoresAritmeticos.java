package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresAritmeticos {
    public static void main(String[] args) {
        // Operadores aritméticos + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        /*Quando temos uma String no meio do sout, tudo que está após a String
        é considerado uma concatenação, oque vier antes da string será feita
        operação nesse caso abaixo ficará 30 Valor 10 20 */
        System.out.println(numero01 + numero02 + " Valor:" + resultado);
        System.out.println(resultado);
        System.out.println(numero01 - numero02);
        System.out.println("------------------------------------------");
        // % resto da divisão
        int resto = 20 % 7;
        System.out.println("O resto da divisão é: " + resto);

    }
}
