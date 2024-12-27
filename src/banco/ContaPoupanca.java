package banco;

public class ContaPoupanca extends Conta
{

	ContaPoupanca(Cliente c)
	{
		super(c);
	}
	@Override
	public void ImprimirExtrato()
	{
		System.out.println("===== Extrato Conta Poupanca =====");
		super.ImprimirInfos();
		System.out.println("=================================");
		
	}
	@Override
	public String toString() {
		return "ContaPoupanca [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente
				+ "]";
	}
	
	
}
