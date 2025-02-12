@Marcus Coelho
package polimorfismoHeranca;

public class Bufalo extends Animal implements Mamifero{

	@Override
	void comer() {
		System.out.println("Bufalo, comeu...");
		
	}

	@Override
	void dormir() {
		System.out.println("Bufalo, dormiu...");
		
	}

	@Override
	public void mamar() {
		System.out.println("Bufalo, mamando...");
	}

}
