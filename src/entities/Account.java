package entities;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	// como tem a hipótese de não ocorrer depósito inicial, eu tenho de criar um construtor que recebe
	// somente os argumentos name e number
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
	//ao invès de colocar o atributo balance recebendo balance, eu vou "chamar" o método "deposit"
	// recebendo inicialDeposit como argumento, pois se no futuro precisar mudar as regras de negócio de depósitos, basta
	//alterar o método, não sendo necessário, alterar o construtor
		deposit (initialDeposit);
	}// este construtor, na hora de instanciar o objeto, o construtor val ler os dados e atribuir
	// estes dados para os atributos do objeto

	/*
	 * os métodos get (p/ aceder o atributo) e set ( p/ alterar o atributo) virão
	 * depois dos construtores.
	 */

	// get (p/ aceder o atributo)
	// como conta não poderá ser nunca alterada, não criei um método set.
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
		
	// Aqui eu encapsulei a regra de negócio de depósitos dentro deste método, e em outros lugares eu chamo o método
	// e assim eu encapsulei apenas um ponto de alteração, caso a regra de negócio mude no futuro
	public void deposit(double amount) {
	     this.balance += amount;
	}
	
	public void withdraw (double amount) {
		this.balance -= amount + 5.0;
	}

	// • toString - converte o objeto (aqui account) para string
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

}
