
import java.util.Scanner;

public class ListaEstruturaEx01 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		float salario;
		float porcentagem;
		float novoSalario;

		
		System.out.println("Informe o salário: ");
		salario = leitor.nextFloat();
		
		System.out.println("Informe o aumento do salário em porcentagem: ");
		porcentagem = leitor.nextFloat();
		
		novoSalario = salario + (salario * porcentagem / 100);
		
		System.out.println("O novo salário é: " + novoSalario);
		
		
				
		
	}
}
