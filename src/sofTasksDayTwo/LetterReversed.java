package sofTasksDayTwo;

public class LetterReversed{


	public static void main(String... args){

		System.out.println(getReversed("folajimi", 'l'));

	}


	public static String getReversed(String word, char check){

		String output = "";
		char key = check;

		for(int count = 0; count < word.length(); count++){

			char letter = word.charAt(count);

			if(letter == key){

				output = output + word.charAt(count);

				for(int index = word.length() - 1; index > count; index--){

					output = output + word.charAt(index);

				}

				return output;

			}else{

				output = output + word.charAt(count);

			}

		}

		return output;	

	}


}