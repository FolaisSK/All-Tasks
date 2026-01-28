package chapterThree;

public class PetrolPurchase{


	private String stationLocation;
	private String typeOfPetrol;
	private int litersPurchased;
	private double pricePerLiter;
	private double discount;


	public PetrolPurchase(String stationLocation, String typeOfPetrol, int litersPurchased, double pricePerLiter, double discount){

		this.stationLocation = stationLocation;
		this.typeOfPetrol = typeOfPetrol;
		this.litersPurchased = litersPurchased;
		this.pricePerLiter = pricePerLiter;
		this.discount = discount;

	}


	public void setStationLocation(String stationLocation){

		this.stationLocation = stationLocation;

	}


	public String getStationLocation(){

		return stationLocation;

	}


	public void setTypeOfPetrol(String typeOfPetrol){

		this.typeOfPetrol = typeOfPetrol;

	}


	public String getTypeOfPetrol(){

		return typeOfPetrol;

	}


	public void setLitersPurchased(int litersPurchased){

		this.litersPurchased = litersPurchased;	

	}
	

	public int getLitersPurchased(){

		return litersPurchased;

	}


	public void setPricePerLiter(double pricePerLiter){

		this.pricePerLiter = pricePerLiter;
	
	}


	public double getPricePerLiter(){

		return pricePerLiter;

	}


	public void setDiscount(double discount){

		this.discount = discount;

	}


	public double getDiscount(){

		return discount;

	}


	public double getPurchaseAmount(int litersPurchased, double pricePerLiter, double discount){

		double netPurchaseAmount = litersPurchased * pricePerLiter;
		netPurchaseAmount = netPurchaseAmount - ((discount/100) * netPurchaseAmount);

		return netPurchaseAmount;

	}





}