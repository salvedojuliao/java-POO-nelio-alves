package videoClasses;

public class funcoes_interessantes_para_strings {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2); // Gera uma nova string a partir do parâmetro;
		String s05 = original.substring(2, 9); // Corta a partir porém ABAIXO do caractera 9;
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc"); // Primeira ocorrência/posição do "bc"
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("touUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		String s = "potato apple lemon";

		String[] vect = s.split(" ");

		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[4]);

	}

}