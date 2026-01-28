package chapterSix;

public class CalculatePie{

	public static void main(String... args){

		float pie = 0;

		for(int count = 1; count <= 200000;){

			pie += 4/count;

			count += 2;

			pie -= 4/count;

			count += 2;

		}

		System.out.println(pie);

	}

}