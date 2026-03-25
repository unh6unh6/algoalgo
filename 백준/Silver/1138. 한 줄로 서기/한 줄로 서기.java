import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static int n;
    static int[] input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        input = new int[n + 1];
        String[] splitString = br.readLine().split(" ");
        // input index = height
        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(splitString[i - 1]);
        }

        List<Integer> seats = new LinkedList<>();
        seats.add(n);

        for (int height = n - 1; height >= 1; height--) {
            int needCnt = input[height];
            int cnt = 0;
            int index = 0;
            while (true) {
                if (needCnt == cnt) {
                    seats.add(index, height);
                    break;
                }
                if (seats.get(index) > height) {
                    cnt++;
                }
                index++;
            }
        }

        seats.forEach(h -> System.out.print(h + " "));
    }

}
