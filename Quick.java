package sort;

public class Quick {

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
		sort(a,0,n-1);
	}
	
	private static void sort(int[] a,int leftindex,int rightindex){
		if(leftindex>=rightindex)
			return;
		int left = leftindex;
		int right = rightindex;
		int pivot = a[left];
		while(left<right){
			while(left<right&&a[right]>=pivot){
				right--;
			}
			a[left]=a[right];
			while(left<right&&a[left]<=pivot){
				left++;
			}
			a[right]=a[left];
		}
		a[right]=pivot;
		sort(a,leftindex,left-1);
		sort(a,right+1,rightindex);
	}
}
