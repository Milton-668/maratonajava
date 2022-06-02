package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresAtribuicao {
    public static void main(String[] args) {

        //Operadores de atribuição --> = +=, -=, *=, /=
        double bonus = 1800;
        /*Não é recomendado que faça hard coder porque em outro ponto do código não poderá ser
         * modificado.*/
        //bonus = 200 +
        /*Nesse caso nós estamos atribuindo o valor a varíavel, ou seja substituindo o valor
         * que estava alocado na memmória da variável bonus*/
        bonus += 1000; //Nesse caso é atribuido a bônus + 100
        bonus -= 1000;
        bonus *= 1000;
        bonus /= 1000;
        bonus %= 1000;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        //Nesse caso ele vai acrescentando de 1 em 1
        contador++;
        contador--;
        System.out.println(contador);

        int contadorTwo = 0;
        //Nesse outro caso ele acrescentará após passar pela variável
        System.out.println(contadorTwo++);
        //Nesse caso antes de operar a variável ele acrescentará 1
        System.out.println(++contadorTwo);

    }
}
