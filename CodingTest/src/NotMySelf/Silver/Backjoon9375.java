// 하 ... 시도 못함
package NotMySelf.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Backjoon9375 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			// 종류, 개수
			Map<String, Integer> map = new HashMap<>();

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				// 이름 버리기
				st.nextToken();
				String category = st.nextToken();
				if (map.containsKey(category)) {
					map.put(category, map.get(category) + 1);
				} else {
					map.put(category, 1);
				}
			}
			int result = 1;
			for (int val : map.values()) {
				result *= (val + 1); // +1하는 이유 : 미착용의 경우의 수 
			}
			sb.append(result - 1).append("\n"); // -1하는 이유 : 모든 옷을 안입는 경우는 제외
		}

		System.out.println(sb);
	}
}
