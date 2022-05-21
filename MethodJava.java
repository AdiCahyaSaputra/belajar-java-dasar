public class MethodJava {
	public static void main(String[] args) {
		sayHello("Adi");
		System.out.println(sumAll(4, 8));

		// print rest parameter 
		getRestParam(17, 2, 8, 9);

		// or 
		int[] restParam = { 17, 2, 11, 18 }; // bikin array nya harus dari variable btw, g bisa langsung masukin di argumen wkwkw	
		getRestParam(restParam);

		// overloading 
		getRestParam("Method sama ", restParam);

		// rekursif 
		System.out.println(factorial(5));
	}

	static void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	static int sumAll(int a, int b) {
		return a + b;
	}

	// Rest Parameter 
	static void getRestParam(int... param) {
		for(int el : param) {
			System.out.println(el);
		}
	}

	// Method Overloading ( method sama tapi ber beda ) 
	static void getRestParam(String methodName, int... param) {
		for(int el : param) {
			System.out.println(methodName + el);
		}		
	}	

	// Rekursif 
	static int factorial(int num) {
		if(num == 1) {
			return num;
		}

		return num * factorial(num - 1);
	}
}
