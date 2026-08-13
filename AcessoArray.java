import java.util.Scanner;

public class AcessoArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] cidades = {"Niterói", "Rio de Janeiro", "São Paulo", "Belo Horizonte", "Salvador"};

        try {
            System.out.print("Digite um número de 0 a 4: ");
            int indice = scanner.nextInt();

            System.out.println("Cidade escolhida: " + cidades[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inexistente. Digite um número de 0 a 4.");
        }

        scanner.close();
    }
}