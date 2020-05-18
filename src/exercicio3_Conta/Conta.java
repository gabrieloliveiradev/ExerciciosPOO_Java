package exercicio3_Conta;

//3-Criar uma classe Conta Corrente com os seguintes
//atributos: número da agência, número da conta, saldo atual,
//operação (depósito ou saque) e valor. Implementar os
//seguintes métodos:
//Método para depósito.
//Método para saque.
//Método para imprimir o saldo atual.

public class Conta {
	int numAgencia = 0;
	int numConta = 0;
	int saldoAtual = 0;
	int operacao = 0;
	
	public Conta(int numAgencia, int numConta, int saldoAtual, int operacao) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldoAtual = saldoAtual;
		this.operacao = operacao;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(int saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}
	
	public void deposito(int numDep) {
		int valorNovo = getSaldoAtual() + numDep;
		setSaldoAtual(valorNovo);
		
	}
	public void saque(int numSaque) {
		int valorNovo = getSaldoAtual() - numSaque;
		setSaldoAtual(valorNovo);
	}
	public void imprimiSaldo() {
		System.out.println("O saldo da conta: " + getNumAgencia() + "-" + getNumConta() + " é de: " + getSaldoAtual());
		
	}
}
