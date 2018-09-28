package leson1;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x;
		x = 8;
		x = 6;
		int y = 5;
		System.out.println(x);
		System.out.println("Hello World");
		System.out.println('a');
		System.out.println(x+y);
		int c = x+y;
		System.out.println(c);
		System.out.println(x+=y);
		
		System.out.println(y);
		System.out.println(y);

		
		
		for (int w = 0; w<10; w++){
			System.out.println(y);
		}
		
		
		int j = 0;
		do {
			System.out.println(y);
			j++;
		} while (j<10);
		
		
		if (x==10){
			System.out.println("x != 8");
		} else if (x != 10){
			System.out.println("x != 8");
		}

	}

}
