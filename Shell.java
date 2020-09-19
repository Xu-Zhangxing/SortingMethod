package sort;

public class Shell {

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

	public static void sort(int[] a){//插入排序的改进，能够应对大规模的无序数组
		int n = a.length;
		for(int h = n/2;h > 0;h/=2){
			for(int i = 0;i < n;i++){//第i组
				if(i+h>=n){
					break;
				}
				Insertion.sort(a, i, h);//对第i组进行插入排序
			}
		}
	}
}
