package sort;

public class Selection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,5,4};
		sort(a);
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void sort(int[] a){//O(n^20)
		int n = a.length;
		for(int i = 0;i < n-1;i++){
			int min = Integer.MAX_VALUE;
			for(int j = i;j<n;j++){
				if(a[j] < min){
					min = a[j];
					Exch.exch(a, i, j);
				}
			}
		}
	}
}
