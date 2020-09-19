package sort;

public class Inser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void inser(int[] a,int i,int j){
		int temp = a[i];
		for(int k = i;k > j;k--){
			a[k] = a[k-1];
		}
		a[j] = temp;
	}
	
	public static void inser(int[] a,int i,int j,int h){
		int temp = a[i];
		for(int k = i;k > j;k-=h){
			a[k] = a[k-h];
		}
		a[j] = temp;
	}
}
