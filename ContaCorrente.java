package conta.model;

public class ContaCorrente extends Conta{

	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite=limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float Valor) {
	
	if (this.getSaldo()+this.getLimite()<Valor) {
		System.out.println("\nNão há Saldo suficiente! ");
		return false;
	}
	
	this.setSaldo(this.getLimite()-Valor);
	return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		
		System.out.println("\nSeu Limite de Crédito é: "+this.limite);
}
}
