package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos Guardam em mémoria um valor simples
        // int, double, float, char, byte, short, long, boolean
        // casting -> força o java a colocar uma váriavel menor dentro de uma maior
        /*a sintaxe = é passar o tipo menor, passar o valor e ao final colocar a letra
        que identifica o tipo maior a ser colocado o valor*/
        int exe = (int) 1000000000L;
        long numberBig = (long) 155.23;

        int age = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.00F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 60; // imprime o valor conforme a tabela ASCII
        char caractereUniCode = '\u0041'; // sintaxe unicode
        String nome = "Mario Roberto";
        var omitir = "Omitir"; //Omiti a varíavel

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(caractereUniCode);
        System.out.println(numberBig);
        System.out.println("Olá o nome do camarada é: " + nome);
    }
}
