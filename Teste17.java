class Teste17 {
	
	//FIBONACCI
	
	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 1;

		do {
			System.out.println(n1);
			System.out.println(n2);
			n1 += n2;
			n2 += n1;
		} while (n2 < 500);
		
	}
}