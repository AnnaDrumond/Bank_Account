package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
						
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);	
		
		
		if (option == 'y'){
			System.out.print ("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			// instanciação da classe Account com 03 argumentos, em caso de deposito SIM:
			account = new Account (number,name,initialDeposit);
		} else {
			// instanciação da classe Account com 02 argumentos, em caso de deposito NAO:
			account = new Account (number,name);
		}
				
		System.out.println("\nAccount data: \n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		// nao confunda esta variavel com o atributo da classe
		// agora preciso que o valor digitado pelo usuario aqui, seja usado como
		// parametro no metodo "deposit" da minha classe:
		account.deposit(depositValue);
		// isso fará a atualização do valor dentro do objeto account no atributo balance
		// agora vamos mostrar:
		System.out.println("Updated account data: \n" + account );
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		// agora preciso que o valor digitado pelo usuario aqui, seja usado como
		// parametro no metodo "withdraw" da minha classe:
		account.withdraw (withdrawValue);
		// isso fará a atualização do valor dentro do objeto account no atributo balance
				// agora vamos mostrar:
		System.out.println("Updated account data: \n" + account );
		
		
		sc.close();

	}

}
