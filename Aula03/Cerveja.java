
/* 

Código feito por Davidzaque, Daniel e Henrique

*/

package aula;

import java.util.Scanner;

public class Cerveja {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int nCervejas= 0;
		
		System.out.println("Digite o numero de cervejas da freezer: \n");
		
		nCervejas = leitor.nextInt();
		
		while(nCervejas>0){
			System.out.println(nCervejas + " Cerverjas na freezer\nPego uma garrafa, passo pra frente");
			nCervejas-=1;
			System.out.println("Agora são " + nCervejas +" Cervejas na freezer\n");
			
			if(nCervejas==0){
				System.out.println("A Cerveja acabou\n");
				System.out.println("Deseja colocar quantas Cervejas a mais?: \n");
				nCervejas= leitor.nextInt();
			}
			
				
		}
		
		
		
		
		
	}
}