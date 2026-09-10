package missaoI;

public class CentralRastreamento {
	
	public static void inspecionarItem(Object item) {
		if(item instanceof Rastreavel) {
			Rastreavel rastreavel = (Rastreavel) item;
			
			System.out.println(
					"Status: " + rastreavel.getStatusRastreio()
			);
		} else {
			System.out.println(
					"O item não é passível de rastreamento."
			);
		}
	}

}
