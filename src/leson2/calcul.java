package leson2;

public class calcul {

	public static void main(String[] args) {
		int x = 5;
		int y = 6;
		char operation = '+';
		
		switch (operation){
		case '+': {
			System.out.println(x  + y);
			break;
		}
		case '-': {
			System.out.println(x - y);
			break;
		}
		case '*': {
			System.out.println(x * y);
			break;
		}
		case '/': {
			System.out.println(x / y);
			break;
		}
		
		
		default: {
			System.out.println("Не выбранно действие");
		}
		
		
		
		
		
		
		}
		
		
		
	}

}
