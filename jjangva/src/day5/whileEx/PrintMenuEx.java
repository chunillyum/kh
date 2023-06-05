package day5.whileEx;
import java.util.Scanner;
public class PrintMenuEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while(menu != 3) {//메뉴가 3이 아닐 때까지 반복
		System.out.println("menu\n1.Start\n2.Save\n3.Exit\nSelect menu:");
		menu = sc.nextInt();//무한반복이 안 된 이유. 스캐너가 입력값을 기다림
		if(menu==1) {
			System.out.println("Program Start!");
		}
			else if(menu==2) {
				System.out.println("Program Save!");
			}
			else if(menu==3) {
					System.out.println("Program Exit!");
				}
			else {
				System.out.println("error");
			}
				}
			
		
		
	}

}
