package leson2;

public class min_mass {

	public static void main(String[] args) {
		int y[] = new int[]{3,1,0,6,-1};
		int min = 0;
		for (int i=0; i<y.length; i++){
			if (y[i]<min){
				min = y[i];
			}
		}
		System.out.println(min);
	}
}
