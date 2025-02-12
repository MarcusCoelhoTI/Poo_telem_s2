//@Marcus Coelho
package polimorfismoHeranca;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Leao l1 = new Leao();
		Bufalo b1 = new Bufalo();
		Gato g1 = new Gato();
		Passaro p1 = new Passaro();
		Helicoptero h1 = new Helicoptero();
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(l1);
		list.add(b1);
		list.add(g1);
		
		
		for(Animal animal: list) {
			animal.comer();
			animal.dormir();
			System.out.println(" ");
		}
		
		ArrayList<Voador> list2 = new ArrayList<Voador>();
		list2.add(p1);
		list2.add(h1);
		
		for(Voador voador: list2) {
			voador.voar();
			System.out.println(" ");
		}
		

	}

}
