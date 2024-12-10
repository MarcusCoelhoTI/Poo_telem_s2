 //@Author Marcus Victor

package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int escolha, continuar;
		Double num1, num2, res;

		System.out.println("Calculadora básica - Você deve digitar dois números para fazer uma operação matemática.");
		do {
			System.out.println("Digite o primeiro número: ");
			num1 = ler.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = ler.nextDouble();

			do {
				System.out.println("Digite qual operação você deseja realizar");
				System.out.println("Código-> 1 - Multiplicação  |  2 - Divisão  |  3 - Soma  |  4 - Subtração");
				escolha = ler.nextInt();
				if (escolha < 1 || escolha > 4) {
					System.out.println("Código inválido...");
				}
			} while (escolha < 1 || escolha > 4);
			switch (escolha) {
			case 1:
				res = num1 * num2;
				System.out.println(num1 + " x " + num2 + " = " + res);
				break;
			case 2:
				res = num1 / num2;
				System.out.println(num1 + " : " + num2 + " = " + res);
				break;
			case 3:
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				break;
			case 4:
				res = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + res);
				break;
			default:
				System.out.println("Código inválido!");
				break;
			}

			do {
				System.out.println("Você deseja fazer outra operação?");
				System.out.println("1 - Sim  |  2 - Não");
				continuar = ler.nextInt();
				if (continuar < 1 || continuar > 2) {
					System.out.println("Código inválido...");
				}
			} while (continuar < 1 || continuar > 2);

		} while (continuar == 1);
		System.out.println("Você saiu da calculadora!");
	}

}
