package softTasksDayOne;

public class FunctionSquareNumber{


	public static void main(String... args){

		System.out.println(productOf(4, 3));

	}


	
	public static int productOf(int firstNumber, int secondNumber){

		int total = 0;

		for(int count = 1; count <= secondNumber; count++){

			total += firstNumber;

		}

		return total;

	}



}