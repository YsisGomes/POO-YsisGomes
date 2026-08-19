package excecao;

import java.util.Scanner;

public class ValidacaoIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException(
                    "Erro: a idade deve estar entre 0 e 150 anos."
                );
            }

            System.out.println("Idade válida: " + idade);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}