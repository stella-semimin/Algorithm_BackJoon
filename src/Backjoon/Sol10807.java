package Backjoon;
import java.util.Scanner;
public class Sol10807 {
	public static void main(String[] args) {
		/* 
		 * 백준 10807 개수 세기
		 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 :
		 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 
		 * 둘째 줄에는 정수가 공백으로 구분되어져있다. 
		 * 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 
		 * 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
		 * 
		 * 출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();				// ※ 입력받을 숫자의 개수를 입력받지않아서 수정
		int numbers[] = new int[N]; 	//  n개의 정수 입력받을 공간생성
		for(int i = 0 ; i < N; i++) {
			numbers[i]= scan.nextInt();	// n개의 정수 입력받기
		}
		
		int v = scan.nextInt(); // 찾으려고하는 정수v
		int cnt = 0;
		
		// 입력된 N개의 정수 중 v와 동일한 것의 숫자 세기
		for(int i=0; i<N; i++) { 
			if(numbers[i]==v) { 
				cnt++; 
				} 
			}
		 System.out.println(cnt);
		
	}

}