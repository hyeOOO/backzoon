// 시간초과 뜸
package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Backjoon11728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] arrA = new int[N];
		int[] arrB = new int[M];

		List<Integer> answer = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
			if (!answer.contains(arrA[i]))
				answer.add(arrA[i]);
		}

		st = new StringTokenizer(br.readLine());
		for (int j = 0; j < M; j++) {
			arrB[j] = Integer.parseInt(st.nextToken());
			if (!answer.contains(arrB[j]))
				answer.add(arrB[j]);
		}

		Collections.sort(answer);

		for (int a : answer) {
			sb.append(a).append(' ');
		}

		System.out.println(sb);
	}
}
