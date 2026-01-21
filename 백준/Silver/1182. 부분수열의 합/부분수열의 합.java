import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, s;
    static int[] nums;

    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        recursion(0, 0, true);

        System.out.println(result);
    }

    static void recursion(
            int cnt,
            int sum,
            boolean isEmpty
    ) {
        if (sum == s && !isEmpty) {
            result++;
        }
        if (cnt == n) {
            return;
        }
        for (int i = cnt; i < n; i++) {
            int num = nums[i];
            if (sum > s && num >= 0) {
                return;
            }
            if (sum == s && num > 0) {
                return;
            }
            recursion(i + 1, sum + num, false);
        }
    }
}
