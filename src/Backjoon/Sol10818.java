package Backjoon;
import java.util.Scanner;
public class Sol10818 {
	public static void main(String[] args) {
		/* 
		 * 백준 10818 최소, 최대
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 
		 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
		 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
		 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * 
		 * 출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
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
