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

	public static void sort(int[] a){//��������ĸĽ����ܹ�Ӧ�Դ��ģ����������
		int n = a.length;
		for(int h = n/2;h > 0;h/=2){
			for(int i = 0;i < n;i++){//��i��
				if(i+h>=n){
					break;
				}
				Insertion.sort(a, i, h);//�Ե�i����в�������
			}
		}
	}
}
