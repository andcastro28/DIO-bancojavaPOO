package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)
	{
		Banco banco = new Banco();
		banco.setNome("Bradesco");
		
		List<Conta> variascontas;
		
		variascontas=new ArrayList<Conta>();
		
		Cliente cli1 = new Cliente();
		cli1.setNome("Andre");
		// TODO Auto-generated method stub
		Conta cc1 = new ContaCorrente(cli1);
		Conta cp1 = new ContaPoupanca(cli1);
		cc1.depositar(150);
		cc1.transferir(50, cp1);
		
		Cliente cli2 = new Cliente();
		cli2.setNome("Maria");
		// TODO Auto-generated method stub
		Conta cc2 = new ContaCorrente(cli2);
		Conta cp2 = new ContaPoupanca(cli2);
		cc2.depositar(250);
		cc2.transferir(10, cp2);
		
		variascontas.add(cc1);
		variascontas.add(cp1);
		
		variascontas.add(cc2);
		variascontas.add(cp2);
		
		banco.setContas(variascontas);
		
		banco.ListarContas();
	}

}
