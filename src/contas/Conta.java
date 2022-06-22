/**
 * POO - Encapsulamento e m�todos 
 */
package contas;

/**
 * @author renan.flazoti
 *
 */
public class Conta {

	// Atributos
	// Para encapsular(proteger) uma vari�vel devemos usar
	// o modificador private e criar m�todos espec�ficos(get e set) para outras
	// classes e pacotes terem acesso �s vari�veis.
	// Encapsulamento - Passo 1: Modificador private
	private String cliente;
	private double saldo;

	/**
	 * Construtor
	 */
	public Conta() {
		System.out.println("-------------------");
		System.out.println("Ag�ncia 0284");
	}

	// Encapsulamento - Passo 2: Criar os m�todos espec�ficos (get e set).
	// Eclipse - bot�o direito do mouse - Source - Generate Getters and Setters -
	// Selecionar as vari�veis encapsuladas
	/**
	 * Ler o conte�do da vari�vel cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Setar(atribuir) um nome a vari�vel cliente
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * Obter o saldo do cliente
	 * 
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Setar(atribuir) um valor a conta corrente
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// M�todos
	/**
	 * M�todo simples que exibe o valor do saldo
	 */

	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}

	/**
	 * M�todo simples com uma vari�vel local para sacar um valor na conta
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("D�bito: R$ " + valor);
	}

	/**
	 * M�todo simples com uma vari�vel local para depositar um valor na conta
	 * 
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Cr�dito: R$ " + valor);
	}

	/**
	 * M�todo simples com uma vari�vel local e um objeto que ser� criado para
	 * indicar a conta de destino da transfer�ncia do valor
	 * 
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transfer�ncia: R$ " + valor);
	}
	
	/**
	 * M�todo com retorno obrigat�rio da vari�vel total
	 * @param cc1
	 * @param cc2
	 * @return total
	 */
	double soma(double cc1,double cc2) {
		double total = cc1 + cc2;
		return total;
	}

}
