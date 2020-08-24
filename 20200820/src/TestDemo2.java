import java.util.Arrays;

/**
 * @program: 20200820
 * @description
 * @author: sun
 * @create: 2020-08-24 16:58
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        String str1 = "    abc     defa    bcdef    ";//去左右空格
        String ret = str1.trim();
        System.out.println(ret);
    }
    public static void main6(String[] args) {
        String str1 = "abcdefabcdef";
        String ret = str1.substring(1);
        System.out.println(ret);
        String ret1 = str1.substring(1,4);
        System.out.println(ret1);
    }
    public static void main5(String[] args) {
        String str1 = "abcdefabcdef";
        String ret = str1.replace("ab","pp");
        System.out.println(ret);
        String ret1 = str1.replaceFirst("ab","pp");
        System.out.println(ret1);
    }
    public static void main4(String[] args) {
        String str1 = "abc";
        String str2 = "abcdef";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写
        System.out.println(str1.compareTo(str2));//str1 > str2 返回正数；str1 < str2 返回负数;
    }
    public static void main3(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes);
        System.out.println(str);
        String str2 = "abcdef";
        byte[] bytes1 = str2.getBytes();
        System.out.println(Arrays.toString(bytes1));
    }

    public static boolean func(String str) {
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        String str = "123456";
        boolean flg = func(str);
        System.out.println(flg);
    }
    public static void main1(String[] args) {
        char[] val = {'a','b','c','d','e'};
        String str = new String(val,1,3);
        System.out.println(str);
        String str2 = "hello";
        char ch = str2.charAt(0);
        System.out.println(ch);
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));
    }
}
