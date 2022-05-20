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

		/*
		 * Number Overflow 
		 * ketka long 1 T di convert ke byte yg cuma 
		 * mentok 127, maka nanti nya si byte kena 
		 * number overflow. ketka sudah mentok di 127 , 
		 * byte bakal mundur lagi jadi -127 lalu di tambah 
		 * terus tambah ( mentok = MUNDUR LAGI ) sampe 
		 * hasil nya 1 T .
		*/

	}
}
