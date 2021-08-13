package Backjoon;
import java.util.Scanner;
public class Sol10808 {
	public static void main(String[] args) {
		/* 
		 * 백준 10808 알파벳 개수
		 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * 입력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 * 출력 : 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
		 */
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		//String arr[] = S.split("");
		int alpa[] = new int[26]; // 알파벳이 26개라서 공간만듬
		for(int i=0; i<S.length(); i++) {
			int num = S.charAt(i)-97; // 아스키코드로 (소문자 -> 숫자)
			//System.out.println(num);
			alpa[num]++;
		}
		for (int i = 0; i<alpa.length; i++) {
			if(i!=alpa.length-1) {
				System.out.print(alpa[i]+" ");
			}else
				System.out.print(alpa[i]);
			
		}

	}

}
