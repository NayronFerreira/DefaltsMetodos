package aplicacao;

import java.util.Scanner;

import entidade.BrasilTaxa;
import entidade.TaxaServico;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		System.out.println("Parcelamento com Juros");
		System.out.print("Informe o valor total: ");
		double valor = leia.nextDouble();
		System.out.print("Quer parcelar em quantas vezes? ");
		int meses = leia.nextInt();
		TaxaServico objeto = new BrasilTaxa(2.0);
		
		System.out.printf ("Pagamento depois de 3 meses: %.2f ", objeto.processarParcelas(valor, meses));
		
		
		
		
		
		leia.close();
	}

}
