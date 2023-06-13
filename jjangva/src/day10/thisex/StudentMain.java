package day10.thisex;

public class StudentMain {
	
	public static void main(String[] args) {
		Student1 std1 = new Student1(1,1,1,"홍길동");
		std1.print();//클래스명.클래스 메소드가 아닌 객체.클래스변수로 출력해야함.(DoYouWantDrink때 습관 때문에 자꾸 클래스.메소드 하는 중
		Student1 std2 = new Student1(1,1,2,"임꺽정");
		std2.print();
		System.out.println(Student1.studentCount);
		Student1.printCount();
	}


    static class Student1 {
	private static int studentCount;//클래스 전역변수
	private int grade, classNum, number;
	private String name;
	
	public Student1(int grade, int classNum, int number, String name){//이쪽은 매개변수 {
		this.grade = grade;//this 붙은 애들은 class Student1의 멤버변수라 this로 구분.
		this.classNum = classNum;//즉 매개변수로 받은 값을 this.xx인 맴버변수에 저장해라 이거임
		this.number = number;
		this.name = name;
		studentCount++;//객체가 생성된 후 studentCount를 하나씩 추가
	}
	public Student1() {//이 생성자는 매개변수가 없는 기본생성자이기 때문에 아래 멤버변수들에 this를 안 붙임(붙여도 상관없음)
//		grade = 1;
//		classNum = 1;
//		number = 1;
//		name = "";
		this(1,1,1,"");//이 코드가 위 4 줄과 같음. 매개변수가 정수,정수,정수,문자열인 생성자를 찾기 때문에 14줄의 생성자로 이동 
		}
	
	public void print() {
		System.out.println("====");
		System.out.println("grade : " + grade);
		System.out.println("classNum : " + classNum);
		System.out.println("number : " + number);
		System.out.println("name  : " + name);
	}
	public static void printCount() {
		System.out.println("registered student count :" + studentCount);
	}
}
}