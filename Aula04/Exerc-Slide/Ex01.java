package aula;

import java.util.Scanner;
public class Ex01 {
	
	public static void main(String[] args) {
		int n1;
		int n2;
		int resultado;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		n1 = leitor.nextInt();
		
		System.out.println("Informe o segundo número: ");
		n2 = leitor.nextInt();
		
		resultado = n1 + n2;
				
		System.out.println("O resultado é: " + (resultado));
	}

}
