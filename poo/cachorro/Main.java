//@author Marcus Coelho
package cachorro;

public class Main {
	
	public static void main(String[] args) {

		Cachorro c1 = new Cachorro();
		c1.setNome("Tobi");
		c1.setRaca("Pé duro");
		c1.setIdade(8);
		
		System.out.println("Nome: " + c1.getNome() + ", raça: " + c1.getRaca() + ", idade: " + c1.getIdade());
		//ou//
		System.out.println(c1.toString());
		
		c1.dormir();
		c1.latir();
		
		

	}

}
