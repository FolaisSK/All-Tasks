package umlTask;

public class AirConditionerMain{

	public static void main(String... args){

		AirConditioner ac1 = new AirConditioner("LG AirConditioner");

		ac1.setOn(true);

		if(ac1.isOn() == false){

			System.out.println("The AC is still OFF");

		}else{

			System.out.println("The AC is ON");

		}


		while(ac1.isOn()){

			System.out.printf("NAME: %s%n%n", ac1.getProductName());

			System.out.printf("Initial Temp: %d%n", ac1.getTemperature());

			ac1.setTemperature(16);
			System.out.printf("Current Temp: %d%n", ac1.getTemperature());

			for(int count = 0; count < 16; count++){

				ac1.increaseTemperature();

			}

			System.out.printf("Temp after increasing five times: %d%n", ac1.getTemperature());
	
					



			ac1.setOn(false);


		}


	}

}