package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondiconais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("O dia " + dia + "° é final de semana, por ser Domingo!");
                break;
            case 2:
                System.out.println("O dia " + dia + "° é útil, por ser Segunda-Feira");
                break;
            case 3:
                System.out.println("O dia " + dia + "° é útil, por ser Terça-Feira");
                break;
            case 4:
                System.out.println("O dia " + dia + "° é útil, por ser Quarta-Feira");
                break;
            case 5:
                System.out.println("O dia " + dia + "° é útil, por ser Quinta-Feira");
                break;
            case 6:
                System.out.println("O dia " + dia + "° é útil, por ser Sexta-Feira");
                break;
            case 7:
                System.out.println("O dia " + dia + "° é final de semana, por ser Segunda-Feira");
            default:
                System.out.println("Dia inválido");
        }
    }
}
