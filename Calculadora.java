//@Author Marcus Victor

package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int escolha, continuar;
		Double num1, num2, res;

		System.out.println("Calculadora b�sica - Voc� deve digitar dois n�meros para fazer uma opera��o matem�tica.");
		do {
			System.out.println("Digite o primeiro n�mero: ");
			num1 = ler.nextDouble();
			System.out.println("Digite o segundo n�mero: ");
			num2 = ler.nextDouble();

			do {
				System.out.println("Digite qual opera��o voc� deseja realizar");
				System.out.println("C�digo-> 1 - Multiplica��o  |  2 - Divis�o  |  3 - Soma  |  4 - Subtra��o");
				escolha = ler.nextInt();
				if (escolha < 1 || escolha > 4) {
					System.out.println("C�digo inv�lido...");
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
				System.out.println("C�digo inv�lido!");
				break;
			}

			do {
				System.out.println("Voc� deseja fazer outra opera��o?");
				System.out.println("1 - Sim  |  2 - N�o");
				continuar = ler.nextInt();
				if (continuar < 1 || continuar > 2) {
					System.out.println("C�digo inv�lido...");
				}
			} while (continuar < 1 || continuar > 2);

		} while (continuar == 1);
		System.out.println("Voc� saiu da calculadora!");
	}

}
