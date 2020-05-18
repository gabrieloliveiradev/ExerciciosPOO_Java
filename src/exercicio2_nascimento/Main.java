package exercicio2_nascimento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String nome = "";
		int ano_nascimento = 0;
		
		Pessoa cliente = new Pessoa (nome, ano_nascimento);
		
		System.out.print("Digite seu nome");
		nome = entrada.nextLine();
		cliente.setNome(nome);
		
		System.out.print("Digite seu ano de nascimento");
		ano_nascimento = entrada.nextInt();
		cliente.setAno_nascimento(ano_nascimento);
		
		cliente.CalculaNascimento();
		cliente.IdadeCinquenta();
	}

}
