public class OperatorMath {
	public static void main(String[] args) {
		int a = 80;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// augmented assignment 
		// a = a + 10; // atau 
		a += 10;
		System.out.println(a);

		// unary operator 
		b++;
		System.out.println(b);
	}
}


