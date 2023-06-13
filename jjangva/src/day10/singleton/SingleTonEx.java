package day10.singleton;

public class SingleTonEx {

	public static void main(String[] args) {
		Samsung big = Samsung.getInstance();
		Samsung big2 = Samsung.getInstance();
		System.out.println(big);
		System.out.println(big2);
	}

}

class Samsung{
	private static Samsung company = new Samsung();// 2: 삼성을 company에 담은 객체를 생성한다(static을 붙여서)
	
	private String name;
	private String address;
	private Samsung() {// 1 : 싱글톤은 생성자를 private로 만든다
		name = "samsung";
		address = "korea";
	}
	public static Samsung getInstance() { //3: 삼성을 담은 company를 리턴한다.(여기도 static을 붙여준다)
		return company;
	}
}