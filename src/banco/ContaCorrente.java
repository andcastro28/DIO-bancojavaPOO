package banco;

public class ContaCorrente extends Conta
{
	ContaCorrente(Cliente c)
	{
		super(c);
	}
	
	@Override
	public void ImprimirExtrato()
	{
		System.out.println("===== Extrato Conta Corrente =====");
		super.ImprimirInfos();
		System.out.println("=================================");
		
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ "]";
	}
	
	
}
