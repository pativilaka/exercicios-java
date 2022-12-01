package avulso;

public class ExemploString {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		
		System.out.println("toLowerCase: -" + s01 + "-");
		
		System.out.println("toUpperCase: -" + s02 + "-");
		
		System.out.println("trim: -" + s03 + "-");
		
		System.out.println("substring passando 2 argumento: -" + s04 + "-");
		
		System.out.println("substring passando 2 e 9 argumento: -" + s05 + "-");
		
		System.out.println("replace a por x: -" + s06 + "-");
		
		System.out.println("replace a por x: -" + s07 + "-");
		
		System.out.println("IndexOf da primeira posição bc: " + i);
		
		System.out.println("lastIndexOf da ultima posição bc: " + j);
		
		
		//Operação Split
		
		String s = "patato apple lemon";
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		//Teste
		
		String s08 = original.replaceAll(" ", "");
		System.out.println("Replace all -" + s08 + "-");
	}

}
