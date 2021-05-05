package br.com.meuprojeto.banco;


public class Conta {
	private String numero;
	private float saldo;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void creditar(float valor) {
		saldo =saldo + valor;
	}
	public void debitar (float valor) {
		saldo = saldo - valor;
	}
	
	public Conta(String numeroDaConta, float saldoInicial) {
		numero = numeroDaConta;
		saldo = saldoInicial;
	}
	
	public static void main (String[] args) {
		ContaPoupanca object = new ContaPoupanca(null, 90);
		object.addRendimentos(3);
		System.out.println("Saldo"+ object.getSaldo());
		
		System.out.println("===========");
		
		Conta obj1 = new Conta("1234", 234);
		obj1.creditar(50);
		System.out.println("Numero da Conta: "+ obj1.numero +" Saldo da Conta: " + obj1.saldo);

		System.out.println("===========");
		
		Conta obj2 = new Conta("8906", 560);
		obj2.creditar(50);
		System.out.println("Número da Conta: "+ obj2.numero +" Saldo da Conta: " + obj2.saldo);
	}
	
	
	
	
	
}