package pepperSnacks;

public class ArrayFunctions{



	public static int arrayLargest(int[] arr){

		int largest = arr[0];

		for(int count = 1; count < arr.length; count++){

			if(arr[count] > largest){

				largest = arr[count];
			}

		}

		return largest;


	}



	public static int[] oddPositions(int[] arr){

		int newLength = 0;

		if(arr.length % 2 != 0){
			
			newLength = (arr.length + 1) / 2;

		}else{

			newLength = arr.length / 2;

		}
		int[] oddDisplay = new int[newLength]; 


		int index = 0;
		for(int count = 0; count < arr.length; count += 2){

			oddDisplay[index] = arr[count];
			index++;
		}

		return oddDisplay;

	}




	public static int[] evenPositions(int[] arr){

		int newLength = arr.length / 2;
		int[] evenDisplay = new int[newLength]; 

		int index = 0;
		for(int count = 1; count < arr.length; count += 2){

			evenDisplay[index] = arr[count];
			index++;

		}

		return evenDisplay;

	}



	public static int sumOf(int[] arr){

		int total = 0;

		for(int count = 0; count < arr.length; count++){

			total += arr[count];

		}

		return total;

	}



	public static boolean arrChecker(int[] arr, int number){

		for(int count = 0; count < arr.length; count++){

			if(number == arr[count]){

				return true;

			}

		}

		return false;

	}



	public static boolean isPalindrome(String word){

		word = word.toLowerCase();

		int wordStart = 0;
		int wordEnd = word.length() - 1;

		while(wordStart < wordEnd){

			if(word.charAt(wordStart) != word.charAt(wordEnd)){

				return false;

			}

			wordStart++;
			wordEnd--;

		}

		return true;

	}




	public static int[] reverse(int[] arr){

		int[] reversed = new int[arr.length];

		int index = 0;
		for(int count = arr.length -1; count >= 0; count--){

			reversed[index] = arr[count];
			index++;
		}

		return reversed;

	}



	public static int[] joinArray(int[] arrOne, int[] arrTwo){

		int newLength = arrOne.length + arrTwo.length;
		int[] combined = new int[newLength];

		
		int counter = 0;
		for(int count = 0; count < combined.length; count++){

			if(count < arrOne.length){

				combined[count] = arrOne[count];
				
			}

			if(count > arrOne.length - 1){

				combined[count + 1] = arrTwo[counter];
				counter++;
			
			}
		



		}

		return combined;


	}





	public static int[] arrayCombined(int[] arrOne, int[] arrTwo){

		int [] output = new int [arrOne.length + arrTwo.length]; 
	
		int counter = 0;
		for(int count = 0; count < output.length; count++){

			if(count <= arrOne.length - 1){

				output[count] = arrOne[count];

			}

			if(count > arrOne.length - 1){

				output[count] = arrTwo[counter];
				counter++;

			}

		}

		return output;


	}







	public static int [] combineArray(int[] arrOne, int[] arrTwo){

		int[] newArray = new int[arrOne.length + arrTwo.length];

		int firstArrayCount = 0;
		int secondArrayCount = 0;

		for(int count = 0; count < newArray.length; count++){


			if(firstArrayCount < arrOne.length){

				newArray[count] = arrOne[firstArrayCount];
				firstArrayCount++;

			}

			if(secondArrayCount < arrTwo.length){
			
				newArray[++count] = arrTwo[secondArrayCount];
				secondArrayCount++;

			}

	

		}

		return newArray;


	}




	public static int indexFinder(int[] arr, int number){

		int output = 0;
		for(int count = 0; count < arr.length; count++){

			if(number == arr[count]){

				output = count;

				return output;

			} else {

				output = -1;
			}


		}		

		return output;

	}




	public static int[] numberToArray(int number){

		String digit = number + "";
		int[] array = new int[digit.length()];


		for(int count = 0; count < digit.length(); count++){

			array[count] = digit.charAt(count);


		}

		return array;
	}



}