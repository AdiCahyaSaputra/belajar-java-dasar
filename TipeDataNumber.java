public class TipeDataNumber {
	public static void main(String[] args) {

		// integer number 
		byte iniByte = 100; // 1 byte ( -128 128 ) 
		short iniShort = 1000; // 2 bytes ( -32.***  32.*** ) 
		int iniInt = 100000; // 4 bytes ( -2M 2M )  
		long iniLong = 1000000; // 8 bytes ( -9MM 9MM ) 
		long iniLongLagi = 10000000L; // 8 bytes ( -9MM 9MM ) 
											
		// floating number 
		float iniFloat = 10.10F; // 4 bytes ( 3.4e-038 3.4e+038 ) 
		double iniDouble = 10.10; // 8 bytes ( 1.7e-308 1.7e+308 ) 

		// bin, hex 
		int iniBinary = 0b010101;
		int iniHexa = 0xFFF;

		// seperator 
		int myMoney = 1_000_000_000;

	}
}


