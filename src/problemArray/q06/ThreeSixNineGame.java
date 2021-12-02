package problemArray.q06;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		String str[] = {" 박수 짝", " 박수 짝짝"};
		for(int i=1; i<=100; i++) {
			if(i/10!=0 && i%10%3==0 && i/10%3==0) {
				System.out.print(str[1]+" ");
			} else if(i/10==0&&i%3==0) {
				System.out.print(str[0]+" ");
			} else if(i/10!=0&&i%10%3==0&& i%10!=0) {
				System.out.print(str[0]+" ");
				
			} else if(i/10%3==0&&i/10!=0) {
				System.out.print(str[0]+" ");
			} else {
				System.out.print(i+" ");
			}
		}
	}

}
