package day4;
import java.util.Scanner;
public class NumberEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = scanner.nextInt();
		if (num>0) {
			System.out.println("양수군요");
		}
		else if (num<0) {
				System.out.println("음수군요");
			}
		else if(num==0){
					System.out.println("0이네요");
				}
			}
	
	}
