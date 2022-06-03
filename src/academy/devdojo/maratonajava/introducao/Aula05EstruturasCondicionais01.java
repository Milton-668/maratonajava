package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("O camarada pode comprar");
        }else{
            System.out.println("O camarada não está autorizado a compra bebida");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("O camarada não podepode comprar");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do IF");
    }
}
