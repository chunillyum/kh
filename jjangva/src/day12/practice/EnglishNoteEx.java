package day12.practice;
import java.util.Scanner;
public class EnglishNoteEx {
//영어 단어장을 만들기 위해 필요한 객체를 만들고 테스트를 해보세요
	/*
	 * 영어 단어장
	 * 영어단어장을 만들기 위해 필요한거
	 * 	 */
	static class note {
	private int keyNum;
	private String keyword;
	private String wordMean;
	
	public int wordnum() {
		int i=1;
		System.out.println(i + "번째 단어입니다.");
		for(i = i; i<i; i++) {
		}
		return i;
	}
	
	public String inputword() {
		System.out.println("input Keyword! : ");
		Scanner sc=new Scanner(System.in);
		String userWord = sc.nextLine();
		return userWord;
	}
	public String wordMean() {
		System.out.println("단어의 뜻은?");
		Scanner sc=new Scanner(System.in);
		String userMean = sc.nextLine();
		return userMean;
		
	}
	
	}
	public static void main(String[] args) {
		note userNote = new note();
		System.out.println("안녕하세요 당신을 영어씹고수의 세계로 이끌어줄 영씹고 영단어장입니다.");
		userNote.wordnum();
		userNote.inputword();
		userNote.wordMean();
	}
//시발
}
