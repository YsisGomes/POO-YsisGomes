package missaoI;

public class CargaTransportadora implements Rastreavel{
	@Override
	public String getStatusRastreio() {
		return "Carga da transportadora: aguardando entrega.";
	}
}
