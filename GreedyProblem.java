package beginnersprogram;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int j = 0; j < T; j++) {
			int N = scn.nextInt();
			int X = scn.nextInt();
			int maxBottles = 0;
			int currentTime = 0;

			int A[] = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = scn.nextInt();
			}

			Arrays.sort(A);

			for (int i = 0; i < N; i++) {
				currentTime += A[i];
				if (currentTime > X)
					break;
				maxBottles++;
			}

			System.out.println(maxBottles);
		}
	}

}
