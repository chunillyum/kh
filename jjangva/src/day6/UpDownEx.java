package day6;
//;;;;;;;;
import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		System.out.println("숫자를 맞춰보세요!");
		int answer = 0;
		for(;answer != random;) {
			answer = sc.nextInt();
			sc.nextLine();
		if(answer<random) {
			System.out.println("up!");
		}
		else if(answer>random) {
			System.out.println("Down!");
		}
		else if(answer==random) {
			System.out.println("Good!");
			System.out.println("want more?\ny/n");
		}
		String y = sc.nextLine();
		while(y != "n") {
			continue;
		
		}
}
	}
}