package numPares;
import java.util.Scanner;

public class NumPares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		//Imprima de 1 à 10
		for(int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		
		System.out.println("");
		System.out.println("");
		
		//Imprima os números pares de 0 à 20
		for(int i = 0; i <= 20; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("");
		
		//Imprima o fatorial de um numero
		float fatorial = 10;
		for(int i = 1; i <= 5; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		
		System.out.println("");
		
		//Imprima um quadrado de n *
		System.out.println("* * * * * * *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("*           *");
		System.out.println("* * * * * * *");
		
		System.out.println("");
		
		//Imprima os números primos até 100
		int num = 100;
		for(int i = 2; i < num; i++) {
			if(num % i == 1) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
}