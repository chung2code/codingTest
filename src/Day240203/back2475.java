package Day240203;

import java.util.Scanner;

public class back2475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;    //sum 값을 초기화
        for (int i=0; i<5;i++) {
            int temp = sc.nextInt();

            sum += temp*temp;   //제곱한값의 덧셈
        }

        int result = sum % 10; //제곱하여 더한 값을 10으로 나눈 나머지를 result로 받음

        System.out.println(result);

    }
}
