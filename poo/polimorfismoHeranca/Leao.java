//@Marcus Coelho
package polimorfismoHeranca;

public class Leao extends Animal implements Mamifero{
	
	@Override
	void comer() {
		System.out.println("Leão, comeu...");
		
	}

	@Override
	void dormir() {
		System.out.println("Leão, dormiu...");
		
	}

	@Override
	public void mamar() {
		System.out.println("Leão, mamando...");
	}

}
