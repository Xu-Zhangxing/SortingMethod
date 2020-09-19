package sort;

public class Bubble {

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

	public static void sort(int[] a){
		int n = a.length;
		for(int i = 0;i < n-1;i++){
			for(int j = i+1;j<n;j++){
				if(a[i]>a[j])
					Exch.exch(a, i, j);
			}
		}
	}
}
