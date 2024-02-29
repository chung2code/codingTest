package Day240222;

import java.util.Scanner;

public class back10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int [] num = new int[N];

        for (int i =0; i<N; i++){
           num[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        for (int j =0;j<num.length; j++){
            if (v==num[j]){
                count++;
            }
        }
        System.out.println(count);
    }
}
