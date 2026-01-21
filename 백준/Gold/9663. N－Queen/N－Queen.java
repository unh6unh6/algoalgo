import java.util.Scanner;

public class Main {

    static int n;
    static boolean[] visit1; // 세로 y
    static boolean[] visit2; // 좌우 대각선
    static boolean[] visit3; // 우좌 대각선

    static int counter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        visit1 = new boolean[n];
        visit2 = new boolean[n * 2];
        visit3 = new boolean[n * 2];

        recursion(0);

        System.out.println(counter);
    }

    static void recursion(int num) {
        if (num == n) {
            counter ++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visit1[i] || visit2[i+num] || visit3[i-num+n-1]) {
                continue;
            }
            visit1[i] = true;
            visit2[i+num] = true;
            visit3[i-num+n-1] = true;
            recursion(num + 1);
            visit1[i] = false;
            visit2[i+num] = false;
            visit3[i-num+n-1] = false;
        }
    }
}
