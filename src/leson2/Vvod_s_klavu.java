package leson2;

import java.util.Scanner;

public class Vvod_s_klavu {

	public static void main(String[] args) {
		char x = 'q';
		Scanner scan = new Scanner (System.in);
		String in;
		
		/*do {											//первый способ
			System.out.println("Введите символ");
		    in = scan.next();
		} while (!in.equals(x));
		System.out.println("end");*/
		
		char w;											//второй способ
		do {
			System.out.println("Введите символ");
		    in = scan.next();
		    w = in.charAt(0);
		} while (x != w);
		System.out.println("end");
		
		
		
		
	}

}
