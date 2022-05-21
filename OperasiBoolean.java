public class OperasiBoolean {
	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true != false);

		int nilai = 75;
		int absen = 100;

		boolean lulus = nilai >= 70 && absen >= 80;

		System.out.println(lulus);
	}
}
