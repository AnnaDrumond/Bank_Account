package entities;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	// como tem a hip�tese de n�o ocorrer dep�sito inicial, eu tenho de criar um construtor que recebe
	// somente os argumentos name e number
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
	//ao inv�s de colocar o atributo balance recebendo balance, eu vou "chamar" o m�todo "deposit"
	// recebendo inicialDeposit como argumento, pois se no futuro precisar mudar as regras de neg�cio de dep�sitos, basta
	//alterar o m�todo, n�o sendo necess�rio, alterar o construtor
		deposit (initialDeposit);
	}// este construtor, na hora de instanciar o objeto, o construtor val ler os dados e atribuir
	// estes dados para os atributos do objeto

	/*
	 * os m�todos get (p/ aceder o atributo) e set ( p/ alterar o atributo) vir�o
	 * depois dos construtores.
	 */

	// get (p/ aceder o atributo)
	// como conta n�o poder� ser nunca alterada, n�o criei um m�todo set.
	public int getNumber () {
		return number;
	}

	public String getName() {
		return name;
	}

	// set ( p/ alterar o atributo)
	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
		
	// Aqui eu encapsulei a regra de neg�cio de dep�sitos dentro deste m�todo, e em outros lugares eu chamo o m�todo
	// e assim eu encapsulei apenas um ponto de altera��o, caso a regra de neg�cio mude no futuro
	public void deposit(double amount) {
	     this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount + 5.0;
	}

	// � toString - converte o objeto (aqui account) para string
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

}
