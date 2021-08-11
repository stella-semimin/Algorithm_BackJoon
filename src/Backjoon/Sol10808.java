package Backjoon;
import java.util.Scanner;
public class Sol10808 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String arr[] = S.split("");
		int alpa[] = new int[26];
		for(int i=0; i<S.length(); i++) {
			int num = S.charAt(i)-97; // 아스키코드로 (소문자 -> 숫자)
			System.out.println(num);
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
