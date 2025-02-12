@Marcus Coelho
package polimorfismoHeranca;

public class Gato extends Animal implements Mamifero, Felino{

	@Override
	void comer() {
		System.out.println("Gato, comeu...");
	}

	@Override
	void dormir() {
		System.out.println("Gato, dormiu...");
	}

	@Override
	public void mamar() {
		System.out.println("Gato, mamando...");
	}

	@Override
	public void arranhar() {
		System.out.println("Gato, Arranhando");
		
	}
}
