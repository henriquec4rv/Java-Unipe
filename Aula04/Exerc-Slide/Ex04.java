package aula;

import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		nota1 = leitor.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leitor.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = leitor.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("Sua média é: " + media);
		
		if(media >= 7.0){
			System.out.println("Você foi aprovado, parabéns!!");
		}
		else if(media >= 5.0 && media < 7.0){
			System.out.println("Você está de recuperação!");
		}
		else {
			System.out.println("Você foi reprovado!");
		}
		
	}
}
