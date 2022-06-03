package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        // variáveis locais não podem ser inicializadas

        int idade = 45;
        String categoria = "";
        if (idade < 15) {
            categoria = "Categoria Infantil " + idade + " anos";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil " + idade + " anos";
        } else {
            categoria = "Categoria Adulto " + idade + " anos";
        }
        System.out.println(categoria);
    }
}
