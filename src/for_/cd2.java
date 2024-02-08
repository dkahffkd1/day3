package for_;

import java.util.Scanner;

public class cd2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int num1,result;
	System.out.println("숫자 입력");
	num1= sc.nextInt();
		
	for(int i=1; i<=num1;i++) {
		for(int j=1; j<10; j++) {
			result = i*j;
		System.out.println(i+"X"+j+"="+result);
		
		}
	}
	
}
}
