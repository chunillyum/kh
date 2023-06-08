package day7_method;
import java.util.Scanner;
public class methodEx {
	
	public static String drink() {
		Scanner sc=new Scanner(System.in);
		System.out.println("무슨 음료가 먹고싶노");
		String getmenu=sc.nextLine();
		if(getmenu.equals("콜라")) {
			return getmenu="콜라입니다.";
		}
			else if (getmenu.equals("사이다")){
			return getmenu= "사이다입니다.";
			}
		return getmenu;
		}
	
	

	public static void main(String[] args) {
		System.out.println(drink());
	}

}
