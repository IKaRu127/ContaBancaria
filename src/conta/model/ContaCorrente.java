package conta.model;

public class ContaCorrente extends Conta {

	// Atributos específicos
	private float limite;
		
	// Construtr
	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numeroConta, agencia, tipo, titular, saldo);		
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	// Métodos Especificos da Classe ContaCorrente

		@Override // Override => Sobrescrever
		public boolean sacar(float valor) {
			if (this.getSaldo() + this.getLimite() < valor) {
				System.out.println("\n Saldo Insuficiente!");
				return false;
			}

			this.setSaldo(this.getSaldo() - valor);
			return true;
		}

		@Override // Override => Sobrescrever
		public void visualizar() {
			super.visualizar();
			System.out.println("Limite de Crédito: " + this.limite);
		}
	
}
