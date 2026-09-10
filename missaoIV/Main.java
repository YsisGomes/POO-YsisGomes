package missaoIV;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Produto> catalogoNatural = new TreeSet<>();

        Produto p1 = new Produto("Teclado", 120.00);
        Produto p2 = new Produto("Mouse", 80.00);
        Produto p3 = new Produto("Monitor", 900.00);
        Produto p4 = new Produto("Notebook", 3500.00);

        catalogoNatural.add(p1);
        catalogoNatural.add(p2);
        catalogoNatural.add(p3);
        catalogoNatural.add(p4);

        System.out.println("CATÁLOGO ORDENADO POR NOME:");

        for (Produto produto : catalogoNatural) {
            System.out.println(produto);
        }

        TreeSet<Produto> catalogoPreco =
                new TreeSet<>(new ComparadorPorPreco());

        catalogoPreco.add(p1);
        catalogoPreco.add(p2);
        catalogoPreco.add(p3);
        catalogoPreco.add(p4);

        System.out.println("\nCATÁLOGO ORDENADO POR PREÇO:");

        for (Produto produto : catalogoPreco) {
            System.out.println(produto);
        }
    }
}