package Backjoon;
import java.util.Scanner;
public class Sol10807 {
	public static void main(String[] args) {
		/* 
		 * ���� 10807 ���� ����
		 * �� N���� ������ �־����� ��, ���� v�� �� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ������ ���� N(1 �� N �� 100)�� �־�����. 
		 * ��° �ٿ��� ������ �������� ���еǾ����ִ�. 
		 * ��° �ٿ��� ã������ �ϴ� ���� v�� �־�����. 
		 * �Է����� �־����� ������ v�� -100���� ũ�ų� ������, 100���� �۰ų� ����.
		 */
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine(); //  n���� ���� �Է¹ޱ�(�������� ���еǾ��־ String������ ����)
		String num[] = n.split(" "); // �������� ���е� ���ڸ� ������ �����ϱ�
		int v = scan.nextInt(); // ã�������ϴ� ����v
		int cnt = 0;
		
		
		// ���ڿ��迭�� ������ �迭�� ��ȯ
		int[] nums = new int[num.length]; // �迭 ������ ���� ����
		for(int i = 0; i<num.length; i++) {
			nums[i] = Integer.parseInt(num[i]);
		}
		
		// �Էµ� n���� ���� �� v�� ������ ���� ���� ����
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==v) { 
				cnt++; 
			}
		}
		
		 System.out.println(cnt);
	}

}