import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @program: 20200811
 * @description
 * @author: sun
 * @create: 2020-08-11 18:43
 **/
public class TestDemo2 {
    public static int fabonaci(int n) {
        if(n == 1 || n == 2 ){
            return 1;
        }
        return fabonaci(n - 1) + fabonaci(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fabonaci(4));
    }




    public static int fac2(int n) {
        if(n < 10){
            return n;
        }
        return n%10 + fac2(n/10);
    }
    public static void main6(String[] args) {
        System.out.println(fac2(1729));
    }





    public static int sum(int n) {
        if(n == 1){
            return 1;
        }
            return n + sum(n - 1);
    }
    public static void main5(String[] args) {
        System.out.println(sum(5));
    }




    public static void func1(int n) {
        if(n > 9){
                    func1(n/10);
        }
        System.out.println(n%10);
    }

    public static void main4(String[] args) {
       func1(123);
    }

    public static int fac(int n) {
        if(n == 1){
            return 1;
        }
        return n * fac(n - 1);
    }
    public static void main3(String[] args) {
        System.out.println(fac(5));
    }


    public static int sum(int a,int b,int c) {
        return a+b+c;
    }
    public static double sum(double a,double b,double c) {
        return a+b+c;
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    public static void main2(String[] args) {
        System.out.println(sum(1,2,3) );
        System.out.println(sum(1,2,3) );
        System.out.println(sum(1,2) );
    }





    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        int tmp = 0;
        tmp = a;
        a = b;
        b =tmp;
        System.out.println(a + " " + b);
    }
}
