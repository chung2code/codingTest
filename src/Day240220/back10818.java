package Day240220;

import java.util.Scanner;

public class back10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] num = new int [N];

        //정수들을 받아 배열에 저장
        for (int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        //배열에서 큰값과 작은 값을 찾음
        int maxNum = num[0];
        int minNum = num[0];
        for (int i=0; i<N;i++){
            if(num[i]>maxNum){
                num[i] = maxNum;
            }
            if (num[i]<minNum){
                num[i] = minNum;
            }
        }

        System.out.println(minNum + " " + maxNum);
    }
}
