package exercicio3_Conta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numAgencia = 0;
		int numConta = 0;
		int operacao = 0;
		int saldoAtual = 0;
		int numSaque = 0;
		int numDep = 0;
		Conta cliente = new Conta(numAgencia, numConta, saldoAtual, operacao);
		
		System.out.print("Digite o número da sua agência: ");
		numAgencia = entrada.nextInt();
		cliente.setNumAgencia(numAgencia);
		
		System.out.print("Digite o número da sua conta: ");
		numConta = entrada.nextInt();
		cliente.setNumConta(numConta);
		
		System.out.println("Digite a operação desejada:");
		System.out.println("1 - Depósito");
		System.out.println("2 - Saque");
		operacao = entrada.nextInt();
		cliente.setOperacao(operacao);
		
		if(operacao == 1) {
			System.out.print("Digite o valor do depósito: ");
			numDep = entrada.nextInt();
			cliente.deposito(numDep);
		} else if(operacao == 2) {
			System.out.print("Digite o valor do saque: ");
			numSaque = entrada.nextInt();
			cliente.saque(numSaque);
		} else {
			System.out.println("Número de operação inválido");
		}
		
		cliente.imprimiSaldo();
	}

}
