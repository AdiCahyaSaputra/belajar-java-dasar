public class Looping {
	public static void main(String[] args) {
		// For
		for(int i = 0; i < 10; i++) {
			System.out.println("Perulangan Ke " + (i + 1));
		}

		// while loop 
		int j = 0;
		while( j < 10 ) {
			System.out.println("While ke " + ( j + 1 ));
			j++;
		}

		// For Each ( agak aneh sih klo di java wkwkwk ) 
		String[] arr = {
			"Adi", "Cahya", "Saputra"
		};

		for(String el : arr) {
			System.out.println(el);
		}

	}
}
