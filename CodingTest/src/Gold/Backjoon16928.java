// 예제들은 다 정답인데 왜 틀렸을까..
// snake를 고려를 안해서 그런가
// 이게 왜 bfs..?
package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Backjoon16928 {
	static int[] game = new int[101];
	static List<int[]> ladder;
	static List<int[]> snake;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		ladder = new ArrayList<>();
		snake = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			ladder.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			snake.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
		}

		int move = 0;
		int count = 0;
		while (move < 100) {
			move = bfs(move);
			count++;
		}
		
		System.out.println(count);
	}

	public static int bfs(int current) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(current);
		int next = current;
		while (!q.isEmpty()) {
			current = q.poll();
			for (int i = 1; i <= 6; i++) {
				next = current + i;
				for(int j=0; j<ladder.size(); j++) {
					if(next==ladder.get(j)[0]) {
						if(next<ladder.get(j)[1]) next = ladder.get(j)[1];
					}
				}

			}
		}
		return next;
	}
}
