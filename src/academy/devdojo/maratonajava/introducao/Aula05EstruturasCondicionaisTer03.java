package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisTer03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNDoar = "Ainda não há condições, mas terei";
        // (condicao)? verdadeiro : falso; -> Sintaxe Operador Ternário
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNDoar;

        System.out.println(resultado);


    }

}

