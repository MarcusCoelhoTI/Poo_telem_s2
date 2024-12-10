package precoFrutas;

import java.util.Scanner;

public class PrecoFrutas {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Consulta de preço de produtos...");
		System.out.println("Códigos-> 1 - Banana | 2 - Maçã | 3 - Laranja | 4 - Mamão | 5 - Melão");
		
		System.out.println("Digite o código do produto escolhido:");
		int escolha;
		escolha = ler.nextInt();
		
		switch(escolha) {
			case 1:
				System.out.println("Preço: Banana R$6,00 / kg");
				break;
			case 2:
				System.out.println("Preço: Maça R$12,00 / kg");
				break;
			case 3:
				System.out.println("Preço: Laranja R$8,00 / kg");
				break;
			case 4:
				System.out.println("Preço: Mamão R$5,00 / kg");
				break;
			case 5:
				System.out.println("Preço: Melão R$5,00 / kg");
				break;
			default:
				System.out.println("Código inválido");
				break;
		
		
		}
		
		

	}

}
