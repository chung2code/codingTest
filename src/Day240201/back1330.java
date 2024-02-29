package Day240201;

import java.util.Scanner;

//두 수 비교하기
public class back1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        if (A>B){
            System.out.println(">");
        } else if (A<B) {
            System.out.println("<");

        }else{
            System.out.println("==");
        }

    }
}
