package br.com.meuprojeto.banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca (String numeroDaConta, float saldoInicial) {
	super (numeroDaConta, saldoInicial);
	
	}

	public void addRendimentos(float addRendimento){
		float newSaldo = getSaldo();
	    newSaldo += (newSaldo * (addRendimento/100));
		setSaldo(newSaldo);
		
	
	}
}
