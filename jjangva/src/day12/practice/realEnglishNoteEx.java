package day12.practice;

public class realEnglishNoteEx {

	public static void main(String[] args) {

	}

}
class Word{
	private String title;
	private String meaning[];
	
	public Word(String title, String meaning) {
		this.title = title;
		this.meaning = new String[5];
		this.meaning[0] = meaning;
	}
	public Word(String title) {
		this.title = title;
	}
}