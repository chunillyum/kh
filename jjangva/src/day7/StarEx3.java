package day7;

public class StarEx3 {

	public static void main(String[] args) {
		for(int r=0; r<5; r++) {
			for (int t=1; t<5-r; t++) {
				System.out.print(" ");
			}
			for(int u=0; u<=r; u++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}