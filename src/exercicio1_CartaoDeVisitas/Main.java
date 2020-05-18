package exercicio1_CartaoDeVisitas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nome = "";
		String email = "";
		String telefone = "";
		
		Scanner entrada = new Scanner (System.in);
		
		Pessoa cliente = new Pessoa (nome, email, telefone);
		
		System.out.print("Informe o nome: ");
		nome = entrada.nextLine();
		cliente.setNome(nome);
		
		System.out.print("Informe o email: ");
		email = entrada.nextLine();
		cliente.setEmail(email);
		
		System.out.print("Informe o telefone: ");
		telefone = entrada.nextLine();
		cliente.setTelefone(telefone);
		
		cliente.CartaoDeVisita();
	}

}
