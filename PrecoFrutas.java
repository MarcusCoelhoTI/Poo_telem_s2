package precoFrutas;

import java.util.Scanner;

public class PrecoFrutas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Consulta de pre�o de produtos...");
		System.out.println("C�digos-> 1 - Banana | 2 - Ma�� | 3 - Laranja | 4 - Mam�o | 5 - Mel�o");
		
		System.out.println("Digite o c�digo do produto escolhido:");
		int escolha;
		escolha = ler.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.println("Pre�o: Banana R$6,00 / kg");
				break;
			case 2:
				System.out.println("Pre�o: Ma�a R$12,00 / kg");
				break;
			case 3:
				System.out.println("Pre�o: Laranja R$8,00 / kg");
				break;
			case 4:
				System.out.println("Pre�o: Mam�o R$5,00 / kg");
				break;
			case 5:
				System.out.println("Pre�o: Mel�o R$5,00 / kg");
				break;
			default:
				System.out.println("C�digo inv�lido");
				break;
		
		
		}
		
		

	}

}
