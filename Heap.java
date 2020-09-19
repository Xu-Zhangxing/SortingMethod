package sort;

import java.util.Arrays;

public class Heap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,5,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a){
		int n = a.length;
		for(int i = n/2-1;i >= 0;i--){//从下至上，从右至左调整分堆
			adjust(a,i,n);
		}
		for(int i = n-1;i > 0;i--){//交换第一个元素和最后一个元素，使得最后一个元素为当前堆中最大元素
			Exch.exch(a, i, 0);
			adjust(a,0,i);
		}
	}
	
	private static void adjust(int[] a,int i,int n){
		int temp = a[i];
		for(int k = i*2+1;k < n;k=k*2+1){
			if(k+1<n&&a[k+1]>a[k]){//首先检查有无右子节点，若有比较两个子节点大小，选取较大节点进行比较
				k++;
			}
			if(a[k]>temp){//与父节点比较，若大则交换，若小则直接跳出，比较结束
				a[i]=a[k];
				i=k;
			}else{
				break;
			}
		}
		a[i] = temp;
	}
}
