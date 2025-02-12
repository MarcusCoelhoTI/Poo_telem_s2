package polimorfismoHeranca;

public class Passaro extends Animal implements Voador{

	@Override
	public void voar() {
		System.out.println("Pássaro, voando...");
	}

	@Override
	void comer() {
		
	}

	@Override
	void dormir() {
		
	}
	


}
