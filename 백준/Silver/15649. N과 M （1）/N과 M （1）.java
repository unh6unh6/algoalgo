import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder result = new StringBuilder();
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        func(0, new LinkedHashSet<>());

        System.out.println(result);
    }

    static void func(
            int cnt,
            LinkedHashSet<Integer> set
    ) {
        if (cnt == m) {
            for (final Integer i : set) {
                result.append(i).append(" ");
            }
            result.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            set.add(i);
            func(cnt + 1, set);
            set.remove(i);
        }
    }
}
