package day6;
import java.util.Scanner;
import java.util.Scanner;

import java.util.Scanner;
//좆같다 잠 안 자서 머리가 텅 빈 느낌이다.
public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력해주세요(국어, 영어, 수학)");

        String n = "y";
        while (n.equals("y")) {
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            sc.nextLine(); // 개행 문자 소비
            
            double sum = kor + eng + math;
            System.out.println(sum / 3 + "\ncontinue? (y/n)");
            n = sc.nextLine();
        }
        
        System.out.println("exit");
        sc.close();
    }
}


