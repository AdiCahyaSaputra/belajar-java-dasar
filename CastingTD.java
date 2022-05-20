public class CastingTD {
	public static void main(String[] args) {
		// dari kiri ke kanan byte > short > int > long 
		byte iniByte = 100;
		short iniShort = iniByte;
		int iniInt = iniShort;
		long iniLong = iniInt;

		// dari kanan ke kiri ( manual ) 
		long mengLong = 1_000_000_000;
		int mengInt = (int) mengLong;
		short mengShort = (short) mengInt;
		byte mengByte = (byte) mengShort;

		System.out.println(sum(10, 12));
	}
	public static int sum(int a, int b) {
		return a + b;
	}
}
