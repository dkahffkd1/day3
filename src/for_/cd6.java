package for_;

import java.util.Scanner;

public class cd6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("점수 입력");
			int a = sc.nextInt();
			if(a <=0 || a > 100){
				System.out.println("불합격");break;
			} 
			else if(a>=80) {
				System.out.println("합격");
			}else {
				System.out.println("불 합격");
			}
				
				
			}
			
		}
		}