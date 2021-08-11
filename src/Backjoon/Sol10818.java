package BackJoon;
import java.util.Scanner;
public class Sol10818 {
	public static void main(String[] args) {
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
