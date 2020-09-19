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
		for(int i = n/2-1;i >= 0;i--){//�������ϣ�������������ֶ�
			adjust(a,i,n);
		}
		for(int i = n-1;i > 0;i--){//������һ��Ԫ�غ����һ��Ԫ�أ�ʹ�����һ��Ԫ��Ϊ��ǰ�������Ԫ��
			Exch.exch(a, i, 0);
			adjust(a,0,i);
		}
	}
	
	private static void adjust(int[] a,int i,int n){
		int temp = a[i];
		for(int k = i*2+1;k < n;k=k*2+1){
			if(k+1<n&&a[k+1]>a[k]){//���ȼ���������ӽڵ㣬���бȽ������ӽڵ��С��ѡȡ�ϴ�ڵ���бȽ�
				k++;
			}
			if(a[k]>temp){//�븸�ڵ�Ƚϣ������򽻻�����С��ֱ���������ȽϽ���
				a[i]=a[k];
				i=k;
			}else{
				break;
			}
		}
		a[i] = temp;
	}
}
