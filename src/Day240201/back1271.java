package Day240201;

import java.math.BigInteger;
import java.util.Scanner;

//엄청난 부자들 2
public class back1271 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger(); //숫자값이 크기 떄문에 int가 아닌 BigInteger로 받아준다

        BigInteger m = sc.nextBigInteger();

        System.out.println(n.divide(m));    //생명체 하나에 돌아가는 돈의 양(나누기) *나머지는 divide로 나타낸다

        System.out.println(n.mod(m));   //1원씩 분배가능한 남는 돈(나머지)   *몫은 mod로 나타낸다
    }
}
