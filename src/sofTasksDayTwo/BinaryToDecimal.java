package sofTasksDayTwo;

public class BinaryToDecimal{

/*
	public static int getDecimalOf(int number){

		int decimalValue = 0;
		int digit = 0;
		String value = "" + number;

		if(number < 0){

			number *= -1;

		}

		for(int count = 0; count < value.length(); count++){

			digit = number % 10;

			if(digit <= 1){

				decimalValue += digit * (int)Math.pow(2, count);
				number /= 10;

			}else{
	
				return 0;

			}

		}

		return decimalValue;

	}
**/


	public static int getDecimalOf(int number){

		int multiple = 1;
		int decimalValue = 0;

		if(number < 0){

			return 0;

		}

		while(number != 0){

			int digit = number % 10;
			number = number / 10;

			if(digit <= 1){

				decimalValue += digit * multiple;
				multiple *= 2;

			}else{

				return 0;

			}
			
		}
		
		return decimalValue;

	}



}