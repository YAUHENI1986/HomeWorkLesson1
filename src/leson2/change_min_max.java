package leson2;

public class change_min_max {

	public static void main(String[] args) {
		float y[] = new float[]{3,1,0,6,-1};
		float min = 0;
		float max = 0;
		int iMAX = 0;
		int iMIN = 0;
		for (int i=0; i<y.length; i++) {
			if (y[i]<=min) {
				min = y[i];
				iMIN = i;
			}
			if (y[i]>max) {
				max = y[i];
				iMAX = i;
			}
		}
		for (int i = 0;i<1;i++){
			float time = y[iMIN];
			y[iMIN] = y[iMAX];
			y[iMAX] = time;
		}
		for (int i = 0; i<y.length; i++) {
            System.out.print(y[i] + " ");
        }
		System.out.println();
																		//делим массив на максимум из значений
		for (int i = 0; i<y.length; i++) {
            y[i]/=max;
        }
		for (int i = 0; i<y.length; i++) {
            System.out.print(y[i] + " ");
        }
		
		
	}
}
