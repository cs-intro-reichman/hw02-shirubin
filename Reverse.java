/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reversedString="";
		char middleLetter=word.charAt(word.length()/2);
		for (int i = word.length()-1; i >= 0; i--) {
			reversedString = reversedString + word.charAt(i);
		}
		System.out.println(reversedString);
		System.out.println("The middle character is " + middleLetter);
	}
}
