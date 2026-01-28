package pepperSnacks;

public class CodexLogisticsServices{


	public static int ridersWage(int deliveries){

		int basePay = 5000;
		int wage = 0;
		
			if(deliveries < 50){

			wage = deliveries * 160 + basePay;

			}else if(deliveries >= 50 && deliveries < 60){

			wage = deliveries * 200 + basePay;

			}else if(deliveries >= 60 && deliveries < 70){

			wage = deliveries * 250 + basePay;

			}else{

			wage = deliveries * 500 + basePay;
			
			}	

			
		return wage;

	}




}