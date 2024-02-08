package for_;//7조


import java.util.Scanner;

public class cd3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int a;
		System.out.println("입력");
		a = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-1-i;j++){
				System.out.print(" ");
			}
			for(int k=0 ; k<=i;k++) {
				System.out.print("*");
			}for(int k=0 ;k<i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}