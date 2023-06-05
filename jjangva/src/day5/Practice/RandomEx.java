package day5.Practice;

public class RandomEx {

	public static void main(String[] args) {
		int min = 1, max = 10;
		int random =  (int)(Math.random() * (max - min + 1) + min);//(int)Math.random()*100+1
		System.out.println(random);
	}

}
