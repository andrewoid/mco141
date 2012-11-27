package schwimmer.test1;

public class UnPigLatin {

	public static void main(String args[]) {

		String pigLatinWords = "omputercay ogrammingpray isway unfay";

		System.out.println("Pig Latin: " + pigLatinWords);

		System.out.print("English: ");
		System.out.print(pigLatinWords.charAt(7)
				+ pigLatinWords.substring(0, 7));
		System.out.print(" ");
		System.out.print(pigLatinWords.substring(20, 22)
				+ pigLatinWords.substring(11, 20));
		System.out.print(" ");
		System.out.print(pigLatinWords.substring(25, 27));
		System.out.print(" ");
		System.out.println(pigLatinWords.charAt(33)
				+ pigLatinWords.substring(31, 33));

	}

}
