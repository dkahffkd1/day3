package for_; //7조

public class cd1 {
	public static void main(String[] args) {
		int psum = 0, hsum =0;
		for(int i =0; i<100; i++) {
			if(i%2 ==0) {
				psum += i;
			}else{
				hsum += i;
			}		
		}
		System.out.println("짝수의 합은" + psum);
		System.out.println("홀수의 합은" + hsum);
	}
}
