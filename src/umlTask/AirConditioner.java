package umlTask;

public class AirConditioner{


	private boolean isOn;
	private String productName;
	private int temperature = 16;


	public AirConditioner(String productName){

		this.productName = productName;

	}


	public boolean isOn(){

		return isOn;

	}


	public void setOn(boolean isOn){

		this.isOn = isOn;

	}


	public void setProductName(String productName){

		this.productName = productName;

	}


	public String getProductName(){

		return productName;

	}


	public void setTemperature(int temperature){

		if(isOn() == true){
			if(temperature > 16 && temperature <= 32)
				this.temperature = temperature;

		}else{

			this.temperature = 16;

		}

	}


	public int getTemperature(){

		return temperature;

	}


	public void increaseTemperature(){

		if(isOn() == true){
			if(temperature < 32)
				this.temperature = ++temperature;

		}



	}


	public void decreaseTemperature(){

		if(isOn() == true){
			if(temperature > 16)
				this.temperature = --temperature;

		}


	}






}