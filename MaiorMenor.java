package maiorMenor;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, maior, menor;
		
		System.out.println("Voc� dever� digitar dois numeros...");
		
		System.out.println("Digite o primeiro: ");
		num1 = ler.nextInt();
			
		System.out.println("Digite o segundo: ");
		num2 = ler.nextInt();
			
			
			if(num1 > num2) {
				maior = num1;
				menor = num2;
			}else {
				maior = num2;
				menor = num1;
			}
			
			System.out.println("O maior �: " + maior + " e o menor �: " + menor);
			
			
			
			
	}

}
