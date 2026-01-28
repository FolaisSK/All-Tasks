package chapterThree;

import java.util.Scanner;

public class Petrol{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		PetrolPurchase petrol = new PetrolPurchase("Lekki", "Gas", 35, 500.5, 7.5);

		System.out.printf("Station: %s%n%nPetrol Type: %s%n%nLiters: %d%nPrice Per Liter: %.2f%n%nDiscount: %.2f%n%n", petrol.getStationLocation(), petrol.getTypeOfPetrol(), petrol.getLitersPurchased(), petrol.getPricePerLiter(), petrol.getDiscount());


		System.out.printf("Purchase Amount: %.2f%n%n%n", petrol.getPurchaseAmount(petrol.getLitersPurchased(), petrol.getPricePerLiter(), petrol.getDiscount()));


		petrol.setStationLocation("Yaba");
		petrol.setTypeOfPetrol("Diesel");
		petrol.setLitersPurchased(50);
		petrol.setPricePerLiter(650);
		petrol.setDiscount(5.5);

		
		System.out.printf("STATION 2%n%nStation: %s%n%nPetrol Type: %s%n%nLiters: %d%nPrice Per Liter: %.2f%n%nDiscount: %.2f%n%n", petrol.getStationLocation(), petrol.getTypeOfPetrol(), petrol.getLitersPurchased(), petrol.getPricePerLiter(), petrol.getDiscount());


		System.out.printf("Purchase Amount: %.2f%n", petrol.getPurchaseAmount(petrol.getLitersPurchased(), petrol.getPricePerLiter(), petrol.getDiscount()));




	}


}