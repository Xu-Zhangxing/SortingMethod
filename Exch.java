package sort;

public class Exch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void exch(int[] a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
