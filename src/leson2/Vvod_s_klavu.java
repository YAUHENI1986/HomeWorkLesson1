package leson2;

import java.util.Scanner;

public class Vvod_s_klavu {

	public static void main(String[] args) {
		char x = 'q';
		Scanner scan = new Scanner (System.in);
		String in;
		
		/*do {											//������ ������
			System.out.println("������� ������");
		    in = scan.next();
		} while (!in.equals(x));
		System.out.println("end");*/
		
		char w;											//������ ������
		do {
			System.out.println("������� ������");
		    in = scan.next();
		    w = in.charAt(0);
		} while (x != w);
		System.out.println("end");
		
		
		
		
	}

}
