package Backjoon;
import java.util.Scanner;
public class Sol10807 {
	public static void main(String[] args) {
		/* 
		 * ���� 10807 ���� ����
		 * �� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �Է� :
		 * ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. 
		 * ��° �ٿ��� ������ �������� ���еǾ����ִ�. 
		 * ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. 
		 * �Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
		 * 
		 * ��� : ù° �ٿ� �Է����� �־��� N���� ���� �߿� v�� �� ������ ����Ѵ�.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();				// �� �Է¹��� ������ ������ �Է¹����ʾƼ� ����
		int numbers[] = new int[N]; 	//  n���� ���� �Է¹��� ��������
		for(int i = 0 ; i < N; i++) {
			numbers[i]= scan.nextInt();	// n���� ���� �Է¹ޱ�
		}
		
		int v = scan.nextInt(); // ã�������ϴ� ����v
		int cnt = 0;
		
		// �Էµ� N���� ���� �� v�� ������ ���� ���� ����
		for(int i=0; i<N; i++) { 
			if(numbers[i]==v) { 
				cnt++; 
				} 
			}
		 System.out.println(cnt);
		
	}

}