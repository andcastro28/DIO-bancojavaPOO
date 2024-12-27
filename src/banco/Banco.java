package banco;

import java.util.List;

public class Banco
{
	 private String nome;
	 private List<Conta> contas;

	 public String getNome() {
	 	return nome;
	 }

	 public void setNome(String nome) {
	 	this.nome = nome;
	 }

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void ListarContas()
	{
		for(int x=0; x<contas.size(); x++)
		{
			System.out.println("Conta bancaria="+contas.get(x));
		}//for
	}

}//class
