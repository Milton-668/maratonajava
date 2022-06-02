package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variáveis para os campos descritos abaixo entre <> e imprima  seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário <salario>, na data<data>
*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Mario Roberto Pinto";
        String endereco = "Rua Amador, n°90, Sp-Brasil";
        float salario = 2500.00F;
        String data = "24/02/2022";
        String relatorio = "Eu " + nome + " morador do endereço " + endereco + " " +
                "confirmo que recebi o salário " + salario + ", " +
                "na data " + data;
        System.out.println(relatorio);
    }


}
