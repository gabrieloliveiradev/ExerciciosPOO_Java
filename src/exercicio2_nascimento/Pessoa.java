package exercicio2_nascimento;

public class Pessoa {
	String nome = "";
	int ano_nascimento = 0;
	
	public Pessoa (String nome,int ano_nascimento) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	
	public void CalculaNascimento() {
		int anoAtual = 2020;
		int idade = 0;
		
		idade = anoAtual - getAno_nascimento();
		System.out.println("A idade de " + getNome() + " É: " + idade + " anos.");
	}
	public void IdadeCinquenta() {
		int anoAtual = 2020;
		int anoCinquenta = anoAtual + 50;
		int idadeCinquenta = anoCinquenta - getAno_nascimento();
		System.out.println("A idade de " + getNome() + " em 50 anos é: " + idadeCinquenta + " anos.");
	}
}
