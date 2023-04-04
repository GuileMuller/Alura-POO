
public class TestaFor {

	public static void main(String[] args) {
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		System.out.println(contador);
		// não funciona pois o contador é temporário no for
	}
}
