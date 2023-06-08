package homeWork;

public class StarEx5 {
//다이아몬드 별 찍기
	//1 3 5 7 5 3 1
	public static void main(String[] args) {
		System.out.println();
		for(int r=0; r<10; r++) {
			for (int t=1; t<10-r; t++) {
				System.out.print(" ");
			}
			for(int u=0; u<=r; u++) {
				System.out.print("**");
				
			}
			System.out.println();
		}
		for(int q=0; q<10; q++) {
			for (int w=10; q<w; w--) {
				System.out.print("**");
			}
			System.out.println();
			for(int e=0; e<=q; e++) {
				System.out.print(" ");
			}
		}
	}
}

