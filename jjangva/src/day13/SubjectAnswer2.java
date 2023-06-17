package day13;

public class SubjectAnswer2 {

	public static void main(String[] args) {

		SubjectAnswer sub1 = new SubjectAnswer("kor");
		sub1.print();
		
		System.out.println("===============");
		
		SubjectAnswer sub2 = new SubjectAnswer("eng", 1, 1);
		sub2.updateScore(30, 40, 10);
		sub2.print();
	}

}