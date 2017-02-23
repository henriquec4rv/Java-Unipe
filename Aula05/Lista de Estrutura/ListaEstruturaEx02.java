import java.util.Scanner;

public class ListaEstruturaEx02 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		int x = 0;
		
		
		
		while(x < 10){
			System.out.println("Digite o número: ");
			numero = leitor.nextInt();
			
			if(numero % 2 == 0){
				System.out.println("É par!");
			}
			else {
				System.out.println("É ímpar!");
			}
			
		}
		x+=1;	
			

	}
}
