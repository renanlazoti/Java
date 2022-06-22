/**
 * Seguros
 */
package seguros;

import contas.Conta;

/**
 * @author renan.flazoti
 *
 */
public class SeguroPessoaFisica extends Conta {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Cliente 3
		// Usando o modificador protected devemos usar a pr�pria heran�a
		// (SeguroPessoaFisica)
		// para criar o objeto
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.setCliente("Fernando Miranda");
		cc3.setSaldo(14000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc3.exibirSaldo();
	}

}
