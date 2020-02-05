package entidade;

public class BrasilTaxa implements TaxaServico {
	
	private double taxaBrasil;

	public BrasilTaxa(double taxaBrasil) {
		this.taxaBrasil = taxaBrasil;
	}

	@Override
	public double getTaxa() {
		return taxaBrasil;
	}
	

}
