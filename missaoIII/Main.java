package missaoIII;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<CupomDesconto> conjuntoCupons = new HashSet<>();

        CupomDesconto cupom1 = new CupomDesconto("PROMO10", 10);
        CupomDesconto cupom2 = new CupomDesconto("PROMO20", 20);
        CupomDesconto cupom3 = new CupomDesconto("PROMO10", 30);

        boolean resultado1 = conjuntoCupons.add(cupom1);
        boolean resultado2 = conjuntoCupons.add(cupom2);
        boolean resultado3 = conjuntoCupons.add(cupom3);

        System.out.println("Cupom 1 adicionado? " + resultado1);
        System.out.println("Cupom 2 adicionado? " + resultado2);
        System.out.println("Cupom 3 adicionado? " + resultado3);

        System.out.println("\nCupons cadastrados:");

        for (CupomDesconto cupom : conjuntoCupons) {
            System.out.println(cupom);
        }
    }
}