package ForLoop;

public class ForEachExample {
	public static void main(String[] args) {
		
		int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		for(int i : array) {
			sum = sum +i;
			System.out.println(i);
		}	System.out.println(sum);
		
		
		String[] array2 = {"Tao", "Oi", "Chuoi", "Thanh Long"};
		for(String a : array2) {
			System.out.println(a);
		}
	}
}
