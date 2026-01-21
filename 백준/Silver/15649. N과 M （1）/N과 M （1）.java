import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(0, new ArrayList<>(), new boolean[n + 1]);

        System.out.println(result);
    }

    static void func(
            int cnt,
            List<Integer> list,
            boolean[] visit
    ) {
        if (cnt == m) {
            for (final Integer i : list) {
                result.append(i).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visit[i]) {
                continue;
            }
            list.add(i);
            visit[i] = true;
            func(cnt + 1, list, visit);
            list.remove(list.size() - 1);
            visit[i] = false;
        }
    }
}
