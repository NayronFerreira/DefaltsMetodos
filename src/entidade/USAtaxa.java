package entidade;

public class USAtaxa implements TaxaServico {

	private double usaTaxa;

	public USAtaxa(double usaTaxa) {
		this.usaTaxa = usaTaxa;
	}

	@Override
	public double getTaxa() {
		return usaTaxa;
	}
	
}
