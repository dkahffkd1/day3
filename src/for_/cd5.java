package for_;//3조

import java.util.Scanner;

public class cd5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all,kor,j =1;
		System.out.println("총 학생 수");
		all = sc.nextInt();;
		for(int i =0;i<all;i++ ) {
			System.out.println( j +"번 학생 국어 성적 : ");
			kor = sc.nextInt();
			if(kor<0 && kor<=100) {
				kor += kor;
				j++;
			}
			else{
			System.out.println(j+"번 학생 다시 입력해주세요: ");
			kor = sc.nextInt();
			
			}
		}
	}
}
