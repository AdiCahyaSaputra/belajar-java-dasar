public class ArrayType {
	public static void main(String[] args) {
		// cara bikin array ( 1 ) 
		String[] arrStr;
		arrStr = new String[3];

		arrStr[0] = "Adi";
		arrStr[1] = "Cahya";
		arrStr[2] = "Saputra";

		// arrStr[3] = "Css"; // error 

		System.out.println(arrStr[1]); // Cahya 

		// cara bikin array ( 2 ) 
		int[] arrInt = {
			18, 17, 6
		}; // otomatis di batasi length nya yaitu max 3 

		System.out.println(arrInt.length);

		// cara menghapus data array[n] adalah dengan memberikan nilai default 
		arrInt[2] = 0; // karena int default nya 0 soal nya array di java itu udh fix bet length nya 

		System.out.println(arrInt[2]);

		// array di dalam array 
		String[][] namaOrang = {
			{ "Adi", "Cahya", "Saputra" },
			{ "Cahya", "Jayadi" },
			{ "Claire", "Ada Orang" }
		};

		System.out.println(namaOrang[1][1]); // jayadi 

	}
}
