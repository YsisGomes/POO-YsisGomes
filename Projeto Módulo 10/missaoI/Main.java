package missaoI;

public class Main {
	public static void main(String[] args) {
		PacoteCorreios pacote = new PacoteCorreios();
		CargaTransportadora carga = new CargaTransportadora();
		EntregaExpressa entrega = new EntregaExpressa();
		String produto = "Celular";
		
		CentralRastreamento.inspecionarItem(pacote);
		CentralRastreamento.inspecionarItem(carga);
		CentralRastreamento.inspecionarItem(entrega);
		CentralRastreamento.inspecionarItem(produto);
	}
}
