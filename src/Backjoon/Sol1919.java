package Backjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sol1919 {
	public static void main(String[] args) throws IOException {
		/*
		 * ���� 1919 �ֳʱ׷�
		 * 
		 * �� ���� �ܾ ö���� ������ �ڹٲپ� ������ �� ���� ��, �׷��� �� �ܾ ���� �ֳʱ׷� ���迡 �ִٰ� �Ѵ�. ���� ��� occurs
		 * ��� ���� �ܾ�� succor �� ���� �ֳʱ׷� ���迡 �ִµ�, occurs�� �� ���ڵ��� ������ �� �ٲٸ� succor�� �Ǳ� �����̴�.
		 * �� ��, dared�� bread�� ���� �ֳʱ׷� ���迡 ���� �ʴ�. ������ dared���� �� ���� d�� �����ϰ�, bread���� ���� ����
		 * b�� �����ϸ�, ared�� read��� ���� �ֳʱ׷� ���迡 �ִ� �ܾ ���� �ȴ�. �� ���� ���� �ܾ �־����� ��, �� �ܾ ����
		 * �ֳʱ׷� ���迡 �ֵ��� ����� ���ؼ� �����ؾ� �ϴ� �ּ� ������ ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ���ڸ� ������ ������ �ƹ� ��ġ��
		 * �ִ� ���ڵ��� ������ �� �ִ�.
		 * 
		 * �Է� : ù° �ٰ� ��° �ٿ� ���� �ܾ �ҹ��ڷ� �־�����. ������ ���̴� 1,000�ڸ� ���� ������, ��� �� ���ڷ� �̷���� �ܾ
		 * �־�����.
		 * 
		 * ��� : ù° �ٿ� ���� ����Ѵ�.
		 */

		Scanner scan = new Scanner(System.in);
		int alpha[] = new int[26];
		int cnt = 0;
		int toBeRemovedCount = 0;
		for (int i = 0; i < 1000; i++) {

			// ���ڿ� �Է¹ޱ�
			char[] a = scan.next().toCharArray();
			char[] b = scan.next().toCharArray();

			// �迭�� ���ĺ� ���� ����ֱ�
			for (char ch : a) {
				alpha[ch - 97]++;
			}
			for (char ch : b) {
				alpha[ch - 97]--;
			}
			for(int j = 0; j< a.length; j++){
	            cnt = Math.abs(alpha[j]);
	            toBeRemovedCount += cnt;
	        }


	        System.out.println(toBeRemovedCount);
		}

	}
}
