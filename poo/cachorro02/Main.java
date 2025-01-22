//@Author Marcus Coelho
package cachorro;

public class Main {
	
	public static void main(String[] args) {

		Cachorro c1 = new Cachorro("Lulu", "SRD", 3);		
		Pessoa p1 = new Pessoa("Leonardo", "12345678912");
		
		c1.setDono(p1);
		p1.setPet(c1);
		
		
		System.out.println(p1.getPet());
		System.out.println(c1.getDono());
		
		
		

	}

}
