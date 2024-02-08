package for_;

import java.util.Scanner;

public class cd7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, plus=0;
		while(true) {
			System.out.println("숫자 입력");
			a = sc.nextInt();
			if(a>=1 && a<=20) {
				if(a%2==0) {
					plus += a;
					System.out.println("숫자를 더합니다");
					System.out.println("현재 숫자는"+plus+"입니다.");
				
				} if(a%2!=0) {
					plus -= a;
					System.out.println("숫자를 뺄게");
					System.out.println("현재 숫자는"+plus+"입니다");
				}else if(plus<0 && plus >100) {
					System.out.println("합계 못내려가");
				}else if(plus==100) {
					System.out.println("100이래 ㅋㅋ");
				}
			}else{
				System.out.println("선 넘지마");
				
			}
		}
	}
}