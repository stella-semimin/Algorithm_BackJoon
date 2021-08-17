package Backjoon;
import java.util.Scanner;
public class Sol2577 {
	public static void main(String[] args) {
		/* 
		 * ���� 2577 ������ ����
		 * �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		 * 
		 * �Է� :
		 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.
		 * 
		 * ��� : ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. 
		 * ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
		 */
		
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int result = A*B*C;
		int cnt[] = new int[11];
		String number = String.valueOf(result);

        String[] digits = number.split("(?<=.)");

        for(int i = 0; i < digits.length; i++) {
           if(digits[i].equals("0")) {
        	   cnt[0]++;
           }
        }
        System.out.println(cnt[0]);

        for(int i = 0; i < digits.length ; i++) {
        	switch(digits[i]){            
	        	case "1":
	        		cnt[1]++;
	        		break;
	        	case "2":
	        		cnt[2]++;
	        		break;
	        	case "3":
	        		cnt[3]++;
	        		break;
	        	case "4":
	        		cnt[4]++;
	        		break;
	        	case "5":
	        		cnt[5]++;
	        		break;
	        	case "6":
	        		cnt[6]++;
	        		break;
	        	case "7":
	        		cnt[7]++;
	        		break;
	        	case "8":
	        		cnt[8]++;
	        		break;
	        	case "9":
	        		cnt[9]++;
	        		break;
        	
        	}
        }
       for(int i = 1; i<10; i++) {
    	   System.out.println(cnt[i]);
       

       }
	}

}