package conta.model;

public abstract class Conta {
	
	// Atributos / Caracteristicas
	// Encapsulamento: Encapsular/Proteger algo
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	// Métodos Construtor => criação de objetos da classe
	public Conta(int numeroConta, int agencia, int tipo, String titular, float saldo) {
		this.numero = numeroConta; // Conta.numero recebe o valor do arg.numero
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Métodos de Acesso(Get/getter - Set//Setter)
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numeroConta) {
		this.numero = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	// Métodos / Ações
		public boolean sacar(float valor) {

			if (this.getSaldo() < valor) {
				System.out.println("\n Saldo Insuficiente!");
				return false;
			}

			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		
		public void depositar(float valor) {
			this.setSaldo(this.getSaldo() + valor);
		}

		public void visualizar() {
			String tipo = "";

			switch (this.tipo) {
			case 1:
				tipo = "Conta Corrente";
				break;
			case 2:
				tipo = "Conta Poupança";
				break;
			}

			System.out.println("\n\n***********************************************************");
			System.out.println("Dados da Conta:");
			System.out.println("***********************************************************");
			System.out.println("Numero da Conta: " + this.numero);
			System.out.println("Agência: " + this.agencia);
			System.out.println("Tipo da Conta: " + tipo);
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo: " + this.saldo);
		}
	
	
	
}
