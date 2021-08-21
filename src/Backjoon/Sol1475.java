package Backjoon;

import java.util.Scanner;

public class Sol1475 {
	public static void main(String[] args) {
		/*
		 * ���� 1475 �� ��ȣ
		 * 
		 * �ټ��̴� �������� ������ ���� �̻�Դ�. �ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�. �ټ����� ���������� �ö�ƽ
		 * ���ڸ� �� ��Ʈ�� �Ǵ�. �� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. �ټ����� �� ��ȣ�� �־����� ��, �ʿ��� ��Ʈ�� ������
		 * �ּڰ��� ����Ͻÿ�. (6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)
		 * 
		 * �Է� : ù° �ٿ� �ټ����� �� ��ȣ N�� �־�����. N�� 1,000,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
		 * 
		 * ��� : ù° �ٿ� �ʿ��� ��Ʈ�� ������ ����Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);
		String room = scan.next(); // �ټ����� ���ȣ n
		room = room.replace('9', '6');
		int num[] = new int[10]; // 0 ~ 9
		int temp = 0;
		int max = 0;

		// ���ڿ� �ش��ϴ� index ���� ++
		for (int i = 0; i < room.length(); i++) {
			temp = room.charAt(i) - '0';
			num[temp]++;
		}

		// 6�� 9�� �ٲ㼭 ����� �� �ֱ� ������ count�� ����
		//
		int n = num[6] + num[9];

		if (n % 2 == 0) {
			num[6] = n / 2;
			num[9] = n / 2;
		} else {
			num[6] = n / 2 + 1;
			num[9] = n / 2 + 1;
		}

		for (int i : num) {
			max = Math.max(max, i);
		}

		System.out.println(max);
	}

}
