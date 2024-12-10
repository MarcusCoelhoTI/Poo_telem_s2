package aprovadoReprovado;
import java.util.Scanner;

public class AprovadoReprovado {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		Double nota;
		
		System.out.println("Digite a nota do aluno: 'use virgula para casas decimais' 'entre 0 e 10'");
		nota = ler.nextDouble();
		
		if(nota >= 0 && nota <= 10) {
			if(nota <3) {
				System.out.println("Reprovado");
			}else if(nota >= 3 && nota <7) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Aprovado");
			}
		}else {
			System.out.println("Nota inválida");
		}
	}

}
