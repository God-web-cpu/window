import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @program: 20200423
 * @description
 * @author: sun
 * @create: 2020-04-23 09:55
 **/
public class TestDemo {



    public static int factor(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += fac(i);
            /*int ret = 1;
            for(int j = 1;j <= i;j++){
                ret *= j;*/
            }
        return sum;
    }
    public static int fac(int num){
             int ret = 1;
             for(int i = 1;i <= num;i++){
                 ret *= i;
             }
             return ret;
            }

    public static void main(String[] args) {
        System.out.println(factor(7));

    }
















   /* public static int maxNum(int num1,int num2){
    return num1 > num2 ? num1 : num2;
    }
    public static int maxThreeNum(int num1,int num2,int num3){
        int max = maxNum(num1,num2);
        return maxNum(max,num3);
    }
    public static void main(String[] args) {//psvm
        Scanner scanner = new Scanner(System.in);
        *//*public static void main(String[] args) {//psvm
            Scanner scanner = new Scanner(System.in);*//*
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxThreeNum(n1,n2,n3);
        System.out.println(ret);
    }*/









    /*public static void main2(String[] args) {//psvm
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 1; i -= 2) {
            System.out.print(((n >> i) & 1) + "");
        }
        System.out.println();
        for (int i = 30; i >= 0; i -= 2) {
            System.out.print(((n >> i) & 1) + "");
        }
    }*/






    /*public static void main1(String[] args) {//psvm
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }*/
}








