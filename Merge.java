package sort;

public class Merge {

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
		merge(a,0,n-1);
	}
	
	private static void merge(int[] a,int l,int r){
		if(l<r){
			int p = (l+r)/2;
			merge(a,l,p);
			merge(a,p+1,r);
			sort(a,l,p,r);
		}
	}
	private static void sort(int[] a,int l,int p,int r){
		int[] temp = new int[r-l+1];
		int m = l;int n = p+1;int i = 0;
		while(m<=p&&n<=r){
			if(a[m]<=a[n]){
				temp[i]=a[m];m++;
			}else{
				temp[i]=a[n];n++;
			}
			i++;
		}
		while(m<=p){
			temp[i]=a[m];m++;i++;
		}
		while(n<=r){
			temp[i]=a[n];n++;i++;
		}
		i=0;
		for(int j = l;j <= r;j++){
			a[j] = temp[i];
			i++;
		}
	}
}
