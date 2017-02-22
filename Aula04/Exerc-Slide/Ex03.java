package aula;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int anoNascimento;
		int anoAtual;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o ano de nascimento: ");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = leitor.nextInt();
		
		System.out.println("Sua idade é: " +  (anoAtual - anoNascimento));
		
		
	}
}
