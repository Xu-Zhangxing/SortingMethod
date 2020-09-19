package sort;

public class Insertion {

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

	public static void sort(int[] a){//在对小规模的，基本有序的数组排序时效率很高
		int n = a.length;
		for(int i = 0;i < n-1;i++){
			int max = a[i];
			if(a[i+1]<max){
				for(int j = 0;j <= i;j++){
					if(a[i+1]<a[j]){
						Inser.inser(a, i+1, j);
						break;
					}
				}
			}
		}
	}
	
	public static void sort(int[] a,int start,int h){
		int n = a.length;
		for(int i = start;i < n;i+=h){
			if(i+h>=n)
				break;
			int max = a[i];
			if(a[i+h]<max){
				for(int j = start;j <= i;j+=h){
					if(a[i+h]<a[j]){
						Inser.inser(a, i+h, j, h);
						break;
					}
				}
			}
		}
	}
}
