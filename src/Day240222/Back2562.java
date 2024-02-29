package Day240222;

import java.util.Scanner;

public class Back2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[9];
        int count =0;
        int max = 0;

        for(int i=0; i<arr.length; i++){
           arr[i] = sc.nextInt();
           if(arr[i]>max){
               max = arr[i];
               count = i+1;
           }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
