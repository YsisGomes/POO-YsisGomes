package missaoII;

import java.util.List;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		List<String> fila = new LinkedList<>();
		
		fila.add("Pedido 001");
		fila.add("Pedido 002");
		fila.add("Pedido 003");
		
		fila.add(0,"Pedido Prioritário");
		
		System.out.println("FILA DE PEDIDOS");
		for(String pedido: fila) {
			System.out.println(pedido);
		}
		
		Vector<String> eventos = new Vector<>();
		
		eventos.add("Ususario realizou login");
		eventos.add("Pedido 001 criado");
		eventos.add("Pagamento aprovado");
		eventos.add("Pedido enviado");
		
		System.out.println("\nREGISTRO DE EVENTOS ");
		for (String evento : eventos) {
            System.out.println(evento);
        }
	}
}
