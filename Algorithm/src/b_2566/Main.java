package b_2566;
// https://www.acmicpc.net/problem/2566 브3 최댓값
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		int max=0;
		int x=0,y=0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(max<Math.max(max, arr[i][j])) {
					max = arr[i][j];
					x=i;
					y=j;
				}
			}
		}
		System.out.println(max);
		System.out.print((x+1)+" "+(y+1));
	}
}