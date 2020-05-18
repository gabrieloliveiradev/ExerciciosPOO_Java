package exercicio1_CartaoDeVisitas;


//1-Criar uma classe Pessoa com os seguintes atributos: nome,
//e-mai e telefone. Implementar o método para imprimir o
//cartão de visitas tal como o exemplo abaixo:
//Maria dos Santos
//maria@gmail.com
//telefone: 2255-9999

public class Pessoa {
	private String nome = "";
	private String email = "";
	private String telefone = "";
	
	
	public Pessoa(String nome, String email, String telefone ) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void CartaoDeVisita() {
		System.out.println();
		System.out.println(getNome());
		System.out.println(getEmail());
		System.out.println("Telefone: " + getTelefone());
	}
}
