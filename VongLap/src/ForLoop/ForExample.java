package ForLoop;

public class ForExample {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i ++ ) {
			System.out.println(i);
		}
		
		for(int i = 100; i >0 ; i --) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i < 10; i++) {
			sum = sum + i;			
		}
		System.out.println(sum);
	}
}
