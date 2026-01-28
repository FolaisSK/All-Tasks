package multiFuelDispenserSystem;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultiFuelDispenserSystem{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		String[] products = new String[20];
		int[] amounts = new int[20];
		int[] litresBought = new int[20];
		int index = 0;

		int option = -1;
		String purchaseType = "";
		int amount = 0;
		int litres = 0;
		String productName = "";

		while(option != 0){

			System.out.println(mainMenu());

			try{

				System.out.print("Enter Option: ");
				option = input.nextInt();

			}catch(InputMismatchException e){

				System.out.println("Invalid Option");
				break;

			}

			switch(option){

				case 1 -> {

					while(option != 5){

						System.out.println(productMenu());

						try{

							System.out.print("Enter Option: ");
							option = input.nextInt();
							input.nextLine();

						}catch(InputMismatchException e){

							System.out.println("Invalid Option");
							break;

						}

						switch(option){

							case 1 -> {

								productName = "Petrol";

								System.out.print("Would you like to purchase through Litre or Amount: ");
								purchaseType = input.nextLine();

								if(purchaseType.equalsIgnoreCase("Amount")){

									try{

										System.out.print("How much Petrol are you buying(650/L): ");
										amount = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(amount < 650){

										System.out.println("Amount must be above a litre price !!!");
										break;

									}else{

										litres = getPetrolPerAmount(amount);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else if(purchaseType.equalsIgnoreCase("Litre")){

									try{

										System.out.print("How many Litres of Petrol are you buying(650/L): ");
										litres = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(litres < 1 || litres > 50){

										System.out.println("Litres must be between 1 - 50 !!!");
										break;

									}else{

										amount = getPetrolPerLitre(litres);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else{System.out.println("Invalid Entry");}
								
							}

							case 2 -> {

								productName = "Diesel";

								System.out.print("Would you like to purchase through Litre or Amount: ");
								purchaseType = input.nextLine();

								if(purchaseType.equalsIgnoreCase("Amount")){

									try{

										System.out.print("How much Diesel are you buying(720/L): ");
										amount = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(amount < 720){

										System.out.println("Amount must be above a litre price !!!");
										break;

									}else{

										litres = getDieselPerAmount(amount);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else if(purchaseType.equalsIgnoreCase("Litre")){

									try{

										System.out.print("How many Litres of Diesel are you buying(720/L): ");
										litres = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(litres < 1 || litres > 50){

										System.out.println("Litres must be between 1 - 50 !!!");
										break;

									}else{

										amount = getDieselPerLitre(litres);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else{System.out.println("Invalid Entry");}

							}

							case 3 -> {

								productName = "Kerosene";

								System.out.print("Would you like to purchase through Litre or Amount: ");
								purchaseType = input.nextLine();

								if(purchaseType.equalsIgnoreCase("Amount")){

									try{

										System.out.print("How much Kerosene are you buying(550/L): ");
										amount = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(amount < 550){

										System.out.println("Amount must be above a litre price !!!");
										break;

									}else{

										litres = getKerosenePerAmount(amount);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else if(purchaseType.equalsIgnoreCase("Litre")){

									try{

										System.out.print("How many Litres of Kerosene are you buying(550/L): ");
										litres = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(litres < 1 || litres > 50){

										System.out.println("Litres must be between 1 - 50 !!!");
										break;

									}else{

										amount = getKerosenePerLitre(litres);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else{System.out.println("Invalid Entry");}

							}

							case 4 -> {

								productName = "Gas";

								System.out.print("Would you like to purchase through Litre or Amount: ");
								purchaseType = input.nextLine();

								if(purchaseType.equalsIgnoreCase("Amount")){

									try{

										System.out.print("How much Gas are you buying(480/L): ");
										amount = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(amount < 550){

										System.out.println("Amount must be above a litre price !!!");
										break;

									}else{

										litres = getGasPerAmount(amount);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else if(purchaseType.equalsIgnoreCase("Litre")){

									try{

										System.out.print("How many Litres of Gas are you buying(480/L): ");
										litres = input.nextInt();

									}catch(InputMismatchException e){

										System.out.println("Invalid Entry");
										break;
									}

									if(litres < 1 || litres > 50){

										System.out.println("Litres must be between 1 - 50 !!!");
										break;

									}else{

										amount = getGasPerLitre(litres);

									}

									//Add to Transaction History
									productsPurchased(products, productName, index);
									amountsPaid(amounts, amount, index);
									litresPurchased(litresBought, litres, index);
									index++;

									//Customers Receipt
									getTransactionReceipt(productName, amount, litres);
									break;

								}else{System.out.println("Invalid Entry");}

							}

							case 5 -> {

								System.out.println("EXITING >>>>>>>>>>>>>>>>>>>>>>");
								break;
							}

							default -> {System.out.println("Invalid Option");}
						 
						}

					}					

				}

				case 2 -> {

					System.out.println("------- ALL TRANSACTIONS -------\n");

					for(int count = 0; count < index; count++){

						System.out.print("--------------------------------\n");
						System.out.println("-- Product: " + products[count]);
						System.out.println("-- Amount: ₦" + amounts[count]);
						System.out.println("-- Litres: " + litresBought[count]);
						System.out.println("-- Date: " + receiptDate());
						System.out.print("--------------------------------\n");	

					}

				}

				case 0 -> {

					System.out.println("Thank you for banking with us 🫡");
					option = 0;

				}

				default -> {System.out.println("Invalid Option");}

			}

			

		}

		

	}



	//Main Menu
	public static  String mainMenu(){

		String menu = """
		----------- SK FILLING STATION ------------

		1. Buy Petroleum
		2. Show Transaction History
		0. Exit

		------------------------------------------- """;

		return menu;				

	}


	//Available Petroleum
	public static String productMenu(){

		String menu = """
		------------ AVAILABLE PRODUCTS ------------
		
		1. Petrol	==>		650 / Litre
		2. Diesel	==>		720 / Litre
		3. Kerosene	==>		550 / Litre
		4. Gas		==>		480 / Litre
		5. Exit

		-------------------------------------------- """;

		return menu;

	}



	//Customer transaction receipt
	public static void getTransactionReceipt(String productName, int amount, int litres){

		System.out.print("Customers Transaction Receipt\n");
		System.out.print("----------------------------------\n");
		System.out.println("-- Product: " + productName);
		System.out.println("-- Amount: ₦" + amount);
		System.out.println("-- Litres: " + litres);	
		System.out.println("-- Thank you For your Patronage --");	
		System.out.println("----------------------------------");
		System.out.println("Saving Transaction History.....");

	}


	//Petrol per amount calculations
	public static int getPetrolPerAmount(int amount){

		if(amount >= 650){

			int litres = amount / 650;
			return litres;

		}else{

			return 0;

		}

	}


	//Petrol Litres per amount calculation
	public static int getPetrolPerLitre(int litres){

		if(litres >= 1){

			int amount = litres * 650;
			return amount;

		}else{

			return 0;

		}

	}


	//Diesel per amount calculations
	public static int getDieselPerAmount(int amount){

		if(amount >= 720){

			int litres = amount / 720;
			return litres;

		}else{

			return 0;

		}

	}


	//Diesel Litres per amount calculation
	public static int getDieselPerLitre(int litres){

		if(litres >= 1){

			int amount = litres * 720;
			return amount;

		}else{

			return 0;

		}

	}


	//Kerosene per amount calculations
	public static int getKerosenePerAmount(int amount){

		if(amount >= 550){

			int litres = amount / 550;
			return litres;

		}else{

			return 0;

		}

	}


	//Kerosene Litres per amount calculation
	public static int getKerosenePerLitre(int litres){

		if(litres >= 1){

			int amount = litres * 550;
			return amount;

		}else{

			return 0;

		}

	}


	//Gas per amount calculations
	public static int getGasPerAmount(int amount){

		if(amount >= 480){

			int litres = amount / 480;
			return litres;

		}else{

			return 0;

		}

	}


	//Gas Litres per amount calculation
	public static int getGasPerLitre(int litres){

		if(litres >= 1){

			int amount = litres * 480;
			return amount;

		}else{

			return 0;

		}

	}


	// Date for Transaction History
	public static String receiptDate(){

		LocalDateTime dateAndTime = LocalDateTime.now();

		DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String formattedDate = dateAndTime.format(currentDate);

		return formattedDate;

	}


	//List of Products Purchased
	public static String[] productsPurchased(String[] products, String productName, int index){

		products[index] = productName;

		return products;

	}


	//List of Amounts Paid
	public static int[] amountsPaid(int[] amounts, int amount, int index){

		amounts[index] = amount;

		return amounts;

	}


	//List of Litres Purchased
	public static int[] litresPurchased(int[] litresBought, int litres, int index){

		litresBought[index] = litres;

		return litresBought;

	}
	




}
