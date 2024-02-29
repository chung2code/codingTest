package Day240203;

import java.math.BigInteger;
import java.util.Scanner;

public class back2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//자릿수 범위가 클 떄는 int로 담을수 없고 BigInteger 자료형으로 처리
       BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();



        //BigInteger로 값을 입력받을때는 더하는 add, 빼기는 subtract, 곱셈은 multiply, 나눗셈은 divide로 한다.
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
    }
}
