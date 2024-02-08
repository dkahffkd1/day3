package for_;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("첫번째 정수 입력 : ");
	int num1 = sc.nextInt();
	System.out.print("두번째 정수 입력 : ");
	int num2 = sc.nextInt();
	int big;
	int small;
	if (num1>num2) {
		big = num1;
		small = num2;
		} else {
		big = num2;
		small = num1;
		}
		
		for(int i = small ; i <= big ; i++) {
			System.out.println(i);
	}

}

}
