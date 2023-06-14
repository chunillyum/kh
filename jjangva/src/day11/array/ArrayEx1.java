package day11.array;
import java.util.Scanner;
public class ArrayEx1 {

	public static void main(String[] args) {
		double[] studentKorea =  new double[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			System.out.println("input :");
			studentKorea[i] = sc.nextDouble();
		}
		for(int i=0; i<3; i++) {
			System.out.println(studentKorea[i]);
		}
		double sum = 0.0;
		for(int i = 0; i<3; i++) {
			sum+=studentKorea[i];
		}
		double avg = sum/studentKorea.length;
		System.out.println(avg);
	}

}
