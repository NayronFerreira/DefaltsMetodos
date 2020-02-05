package entidade;

import java.security.InvalidParameterException;

public interface TaxaServico{
	
	double getTaxa(); 
	
	
	default double processarParcelas (double valor, int meses) {
		if (meses<=0) {
			throw new InvalidParameterException ("A quantidade de meses precisa ser superior a 0");
		}
		return valor * Math.pow(1+ getTaxa() /100, meses); 
	}

}
