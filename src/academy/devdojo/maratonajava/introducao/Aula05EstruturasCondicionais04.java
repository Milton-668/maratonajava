package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        /*
         * Dados os valores salariais anuais, calcule o valor
         * de imposto pagos anualmente
         * 0 - 34.712 -> 9,70%
         * 34.413 - 68.507 -> 37,35%
         * 68.508 -> 49,50%
         * */
        double salario = 50000;
        double calculoImposto;

        if (salario <= 34712) {
            calculoImposto = salario * 0.97;
        } else if (salario >= 34413 && salario <= 68507) {
            calculoImposto = (salario * 35.35) / 100;
        } else {
            calculoImposto = (salario * 49.50) / 100;
        }

        System.out.println("O valor do calculo do imposto anual em cima do salario: " + salario + " é: " + calculoImposto);
    }

}

