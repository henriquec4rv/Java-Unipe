package aula;

import java.util.Scanner;

public class Condicoes {

	public static void main(String[] args)
	{
		int z = 0;
		Scanner digite = new Scanner(System.in);
		System.out.println("Insira um valor para ser atribuido em Z: ");
		z = digite.nextInt();
		
		if (z == 10){
			System.out.println("Z é igual a 10: ");
		}
		else {
			System.out.println("Z não é igual a 10: ");
		}
		System.out.println("E isso é enrolação!");
		digite.close()
	}
}
