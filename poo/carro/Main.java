package carro;

public class Main {

	public static void main(String[] args) {
		
		//fazer o carro correr a 100km/h
		Carro car = new Carro();
		for(int i = 0; i <20; i ++) {
			car.acelerar();
		}
		//imprimir os dados do carro e a sua velocidade atual
		System.out.println(car.toString());

	}

}
