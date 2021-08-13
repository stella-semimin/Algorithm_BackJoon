package Backjoon;
import java.util.Scanner;
public class Sol10818 {
	public static void main(String[] args) {
		/* 
		 * ���� 10818 �ּ�, �ִ�
		 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� : 
		 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. 
		 * ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
		 * ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		 * 
		 * ��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int max = -1000000;
		int min = 1000000;
		for (i = 0; i < N; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		for (i = 0; i < N; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("%d %d", min, max);

	}

}
