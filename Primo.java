 //@Author Marcus Victor

package primo;

public class Primo {

	public static void main(String[] args) {

		int num = 100;

		for (int i = 2; i < num; i++) {
			boolean primo = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					primo = false;
				}
			}
			if (primo) {
				System.out.print(i + " ");
			}

		}
	}
}
