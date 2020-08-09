import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @program: 20200423
 * @description
 * @author: YouName
 * @create: 2020-04-23 19:19
 **/
public class TestDemo2 {
   public static int fabonaci2(int n){
       int f1 = 1;
       int f2 = 1;
       int f3 = 1;
       for(int i = 3;i <= n ;i++){
           f3 = f1 + f2;
           f1 = f2;
           f2 = f3;
       }
       return f3;
   }

    public static void main(String[] args) {
        System.out.println(fabonaci2(50));
    }











    /*public static int func2(int n) {
       if (n < 10) {
           return n;
       }
       return n % 10 + func2(n / 10);
   }

    public static void main(String[] args) {
        System.out.println(func2(1729));

    }*/












    /*public static int sum(int n){
       if (n == 1){
           return 1;
       }
       return n + sum(n - 1);
   }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));
    }*/









    /* public static void func1(int n) {
        if (n > 9) {
            func1(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        func1(123);
    }
*/










    /*public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(5));

    }*/




























    /*public static int  sum(int a,int b){
        return a + b;

    }
    public static double  sum(double a,double b,double c){
        return (a + b + c);

    }
    public static double  sum(double a,double b,double c,double d){
        return (a + b +c +d);

    }*/





    /*public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a +" "+b);
    }*/
}
