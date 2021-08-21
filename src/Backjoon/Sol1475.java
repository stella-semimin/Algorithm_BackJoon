package Backjoon;

import java.util.Scanner;

public class Sol1475 {
	public static void main(String[] args) {
		/*
		 * 백준 1475 방 번호
		 * 
		 * 다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다. 다솜이의 옆집에서는 플라스틱
		 * 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의
		 * 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)
		 * 
		 * 입력 : 첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.
		 * 
		 * 출력 : 첫째 줄에 필요한 세트의 개수를 출력한다.
		 */

		Scanner scan = new Scanner(System.in);
		String room = scan.next(); // 다솜이의 방번호 n
		room = room.replace('9', '6');
		int num[] = new int[10]; // 0 ~ 9
		int temp = 0;
		int max = 0;

		// 숫자에 해당하는 index 값을 ++
		for (int i = 0; i < room.length(); i++) {
			temp = room.charAt(i) - '0';
			num[temp]++;
		}

		// 6과 9는 바꿔서 사용할 수 있기 때문에 count에 따라서
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
