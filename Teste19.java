public class Teste19 {
	public static void main(String [] args) {

		int inicial = 1;
		int proximo = 1;

		do {
			System.out.print(inicial + " ");
			System.out.print(proximo + " ");

			inicial += proximo;
			proximo += inicial;
		} while (proximo <= 200);
	}
}