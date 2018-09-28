package leson1;

public class factorial {

	public static void main(String[] args) {
		
		int num = 8;
		int fact = 1;
		for (; num > 0; fact *= num--);
		System.out.println(fact);
				
		while (num != 0) {
			fact *=num;
			num--;
		}
		System.out.println(fact);
	}

}
