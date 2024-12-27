package banco;


public abstract class Conta implements Iconta
{
	
	private static final int AGENCIA_PADRAO=1;
	private static int SEQUENCIAL=1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente c)
	{
		agencia=Conta.AGENCIA_PADRAO;
		numero=SEQUENCIAL++;
		cliente=c;
	}
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo=saldo-valor;
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo=saldo+valor;
	}
	@Override
	public void transferir(double valor, Conta destino) {
		// TODO Auto-generated method stub
		sacar(valor);
		destino.depositar(valor);
		
	}
	
	public void ImprimirExtrato()
	{
		
	}
	
	protected void ImprimirInfos()
	{
		System.out.printf("\n Titular: %s",cliente.getNome());
		System.out.printf("\n Agencia: %d",agencia);
		System.out.printf("\n Numero: %d",numero);
		System.out.printf("\n Saldo: %.2f \n",saldo);
	}


	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
	
	
}
