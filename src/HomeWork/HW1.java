package HomeWork;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
        int count = 100; // размер массива
        int x[] = new int [count];
        for (int i = 0; i!=count; i++) {
            x[i] = i;
        }
        
        // вывод на экран
        for (int i = 0; i!=count; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        // вывод на экран в обратном порядке
        for (int i = (count-1); i>=0; i--) {
            System.out.println(x[i]);
        }
        
        System.out.println("-------------------");
        
        // четные на экран
        for (int i = 0; i!=count; i++) {
            if (x[i]%2 == 0) {
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        // разность нечетных на экран
        boolean done = true; 
        do {
            int raznost = 0;
            for (int i = 0; i!=count; i++) {
                if (x[i]%2 != 0) {
                    raznost -= x[i];
                }
            }
            System.out.println("разность нечетных = " + raznost);
            done = false;
        } while (done);
        
        System.out.println("-------------------");
        
        // количество четных и нечетных на экран
        do {
            done = true;
            int chet = 0;
            int nechet = 0;
            for (int i = 0; i!=count; i++) {
                if (x[i]%2 == 0) {
                    chet++;
                }
                if (x[i]%2 != 0) {
                    nechet++;
                }
            }
            System.out.println("количество четных и нечетных - " + chet + " " + nechet);
            done = false;
        } while (done);
        
        System.out.println("-------------------");
         
        //max и min
        done = true;
        while (done == true){
            int min = 0;
            int max = 0;
            for (int i = 0; i!=count; i++) {
                if (x[i] >= max) {
                    max = x[i];
                }
                if (x[i] <= min) {
                    min = x[i];
                }
            }
            System.out.println("max и min - " + max + " " + min); 
            done = false;
        }
        
        System.out.println("-------------------");
        
        // массив типа char
        char charArray[];
        String surname = "Левонюк";
        String name = "Евгений";
        String full = surname + " " + name;
        charArray = new char[full.length()];
        for (int i = 0; i<full.length(); i++) {
            charArray[i] = full.charAt(i);
        }
        for (int i = 0; i<full.length(); i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        // массив типа char + Scanner
        System.out.println("Введите Ф_И_О");
        Scanner scan = new Scanner(System.in);
        String FIO = scan.nextLine();
        char charArray2[] =  new char[FIO.length()];
        for (int i = 0; i<FIO.length(); i++) {
            charArray2[i] = FIO.charAt(i);
        }
        for (int i = 0; i<FIO.length(); i++) {
            System.out.print(charArray2[i]);
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        // удолить из массива числа кратные 3
        for (int i = 0; i!=count; i++) {                    
            System.out.print(x[i] + " ");
        }
        System.out.println();
        int x2[];
        int count2 = 0;
        do {
            done = true;
            for (int i = 0; i!=count; i++) {
                if (x[i]%3 != 0) {
                    count2++;
                }
            }
            x2 = new int [count2];
            done = false;
        } while (done == true);
        count2 = 0;

        for (int i = 0; i!=count; i++) {
            if (x[i]%3 != 0) {
                x2[count2] = x[i];
                count2++;
            }
        }
        for (int i = 0; i<x2.length; i++) {
            System.out.print(x2[i] + " ");
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        //метод пузырька
        int sort[] = {5,4,0,1,66,3,123};
        for (int i = 0; i<sort.length; i++) {
        	System.out.print(sort[i] + " ");
        }
        System.out.println();
        for (int out = (sort.length - 1); out >= 1; out--) {
        	for ( int in = 0; in<out; in++) {
        		if (sort[in]>sort[in+1]) {
        			int time = sort[in];
        			sort[in] = sort[in+1];
        			sort[in+1] = time;
        		}
        	}
        }
        for (int i = 0; i<sort.length; i++) {
        	System.out.print(sort[i] + " ");
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        //метод вставок
        int vstavka[] = {55,7,0,3,0,234,-1};
        for (int i = 0; i<vstavka.length; i++) {
        	System.out.print(vstavka[i] + " ");
        }
        System.out.println();
        for (int i = 1; i<vstavka.length; i++) {
        	for (int j=i; j>0 && vstavka[j-1]>vstavka[j]; j--) {
        		int time = vstavka[j];
        		vstavka[j] = vstavka[j-1];
        		vstavka[j-1] = time;
        	}
        }
        for (int i = 0; i<vstavka.length; i++) {
        	System.out.print(vstavka[i] + " ");
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        //метод выбора
        int vubora[] = {5,-1,1,4,444,-12,0};
        for (int i = 0; i<vubora.length; i++) {
        	System.out.print(vubora[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<vubora.length; i++) {
        	int min = vubora[i]; //пердполаг мин элемент
        	int imin = i; // индекс мин элемента
        	for (int j = i+1; j<vubora.length; j++) {
        		if (vubora[j]<min) {
        			min = vubora[j];
        			imin = j;
        		}
        	}
        	if (i != imin) {
        		int time = vubora[i];
        		vubora[i] = vubora[imin];
        		vubora[imin] = time;
        	}
        }
        for (int i = 0; i<vubora.length; i++) {
        	System.out.print(vubora[i] + " ");
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        // метод сортировки
        
        // вывод в заданном диапазоне
        
        for (int i= 0; i<vubora.length; i++) {
        	int min = 0;
        	int max = 50;
        	if (vubora[i]>=min && vubora[i]<=max) {
        		System.out.print(vubora[i]+" ");
        	}
        }
        System.out.println();
        
        System.out.println("-------------------");
        
        
        
    }
        

}
