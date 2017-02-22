package aula;

import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Informe sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
		
		
	}

}
