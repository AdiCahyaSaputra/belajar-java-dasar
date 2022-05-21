/*
* Tipe Data Bukan Primitif 
* adalah tipe data yg tidak memiliki default value .
* tipe data primitif itu udh bawaan dari os, sedangkan 
* tipe data NonPrimitif itu tidak.
*
* default value tipe data NonPrimitif sebenernya adalah null 
* Tipe data NonPrimitif memiliki method/function bak layaknya object 
*
*/

public class NonPrimitif {
	public static void main(String[] args) {
		// beda nya cuma huruf kapital di awal aja sih wkwkwk
		Integer iniInteger = 256;
		Boolean iniBool = true;

		Short iniShort; // default nya null 
		iniShort = 125;

		// Convert dari primitif ke NonPrimitif 
		int iniInt = 300;
		Integer iniIntInteger = iniInt;

		// tidak sama sama int 
		short mengShort = iniIntInteger.shortValue();
		long mengLong = iniIntInteger.longValue();
	}
}
