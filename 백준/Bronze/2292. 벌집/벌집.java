import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        1 - 1
//        2 - 6    7
//        3 - 12   20
//        4 - 18   40
//        5 - 24   66

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        long cnt = 1;
        for (long i = 2; i < 1000000000; i++) {
            cnt += (i - 1) * 6;
            if (n <= cnt) {
                System.out.println(i);
                return;
            }
        }
    }
}
