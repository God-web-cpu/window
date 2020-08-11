import com.sun.javafx.geom.BaseBounds;

import java.util.Scanner;

/**
 * @program: 20200811
 * @description
 * @author: YouName
 * @create: 2020-08-11 16:43
 **/
public class TestDemo {
    public static int factor(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++){
            /*int ret = 1;
            for(int j = 1;j<=i;j++){
                ret *= j;
            }*/

            sum += fac(i);
        }
        return sum;
    }

    public static int fac(int num) {
        int ret = 1;
        for(int i = 1;i<=num;i++){
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(factor(7));
    }


    public static int sum(int a,int b) {
        return a+b;
    }

    public static void main7(String[] args) {
        System.out.println(sum(10, 20));
    }


    public static int maxNum(int num1,int num2,int num3) {
        return (num1 > num2 ? num1:num2) > num3 ? (num1 > num2 ? num1:num2) : num3;
    }
    public static void main6(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println(maxNum(n1,n2,n3));
    }






    public static void main4(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        for(int i = 31;i >= 1;i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        for(int i = 30;i >= 0;i -= 2){
            System.out.print(((n >> i) & 1) + " ");
        }
    }







    public static void main3(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        System.out.println("count" + count);
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0;i<32;i++){
            if(((n>>i) & 1) == 1){
                count++;
            }
        }
        System.out.println("count:" + count);
    }




    public static void main1(String[] args) {
        System.out.println("hello");
    }
}
