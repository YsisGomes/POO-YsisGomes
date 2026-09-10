package missaoV;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, Produto> mapaEstoque = new HashMap<>();

        mapaEstoque.put("001", new Produto("Teclado", 120.00));
        mapaEstoque.put("002", new Produto("Mouse", 80.00));
        mapaEstoque.put("003", new Produto("Monitor", 900.00));
        mapaEstoque.put("004", new Produto("Notebook", 3500.00));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        
        Produto produto = mapaEstoque.get(codigo);

        if (produto != null) {
            System.out.println("Produto encontrado:");
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }

        System.out.println("\nCÓDIGOS CADASTRADOS:");

        Set<String> chaves = mapaEstoque.keySet();

        for (String chave : chaves) {
            System.out.println(chave);
        }

        System.out.println("\nPRODUTOS CADASTRADOS:");

        Collection<Produto> produtos = mapaEstoque.values();

        for (Produto p : produtos) {
            System.out.println(p);
        }

        scanner.close();
    }
}