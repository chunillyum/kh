package day7;

public class StarEx4 {

	public static void main(String[] args) {
		for(int r=0; r<10; r++) {
			for (int t=1; t<10-r; t++) {
				System.out.print(" ");
			}
			for(int u=0; u<=r; u++) {
				System.out.print("**");
				
			}
			System.out.println();
		}
	}

}
