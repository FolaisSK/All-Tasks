package pepperSnacks;

public class LogisticsTest{

public static void main(String[]args){

int testOne = CodexLogisticsServices.ridersWage(25);

System.out.println("First Pay Bracket");
System.out.println(testOne);


int testTwo = CodexLogisticsServices.ridersWage(55);

System.out.println("Second Pay Bracket");
System.out.println(testTwo);



int testThree = CodexLogisticsServices.ridersWage(67);

System.out.println("Third Pay Bracket");
System.out.println(testThree);



int testFour = CodexLogisticsServices.ridersWage(80);

System.out.println("Fourth Pay Bracket");
System.out.println(testFour);

}


}