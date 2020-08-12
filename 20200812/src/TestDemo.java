import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * @program: 20200812
 * @description:数组
 * @author: sun
 * @create: 2020-08-12 08:44
 **/
public class TestDemo {

    public static void swap1(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left<right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            if(left<right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        swap1(array);
        System.out.println(Arrays.toString(array));
    }

    
    //逆置
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left<right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }

    }
    public static void main19(String[] args) {
        int[] array = {1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }





    public static void bubbleSort1(int[] array) {
        boolean flg = false;
        for (int i = 0;i<array.length - 1;i++){
            flg = false;
            for(int j = 0;j<array.length - 1 -i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(flg == false){
                break;
            }
        }

    }
    public static void main18(String[] args) {
        int[] array = {1,2,3,10,5,6};
        bubbleSort1(array);
        System.out.println(Arrays.toString(array));
    }






    //冒泡排序
    public static void bubbleSort(int[] array) {
        for (int i = 0;i<array.length - 1;i++){
            for(int j = 0;j<array.length - 1 -i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = tmp;
                }
            }
        }

    }
    public static void main17(String[] args) {
        int[] array = {1,2,3,10,5,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }



    public static boolean isUp(int[] array) {
        for(int i = 0; i<array.length - 1;i++){
            if(array[i]>array[i +1])
            {
                return false;
            }
        }
        return true;

    }
    public static void main16(String[] args) {
        int[] array = {1,2,3,10,5,6};
        System.out.println(isUp(array));
    }



    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            //int mid = (left + right)/2;
            int mid = (left + right)>>>1;
            if(array[mid] < key){
                left = mid + 1;
            }else if(array[mid] == key){
                return mid;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main15(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int ret = binarySearch(array,8);
        System.out.println("下标:" + ret);
    }


    public static int find(int[] array,int key) {
        for(int i = 0;i<array.length;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main14(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int ret = find(array,18);
        System.out.println("下标:" + ret);
    }



    public static int maxArray(int[] array) {
        int max = array[0];
        for(int i = 1;i< array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;

    }
    public static void main13(String[] args) {
        int[] array = {12,2,18,24,76,13};
        System.out.println(maxArray(array));
    }


    public static void main12(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }


    public static void main11(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }


    public static void main10(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] copyArray(int[] array) {
        int[] ret = new int[array.length];
        for(int i = 0;i<array.length;i++){
            ret[i] = array[i];
        }
        return ret;
    }
    public static void main9(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static String myToString (int[] array) {
        String ret = "[";
        for(int i = 0;i<array.length;i++){
            ret += array[i];
            if(i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main8(String[] args) {
        int[] array = {12,34,1,6,9,52};
        System.out.println(myToString(array));
    }



    public static void main7(String[] args) {
        int[] array = {33,55,66,1,65,79,666,333};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static int[] func(int[] array) {
        int[] tmp = new int[array.length];
        for(int i = 0;i<array.length;i++){
            tmp[i] = array[i] * 2;
        }
        return tmp;

    }
    public static void main6(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(func(array)));

    }


    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));//将数组以字符串的形式进行输出
    }

    public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main4(String[] args) {
        int[] array = {10,20};
        System.out.println(array[0] + " " + array[1]);
        swap(array);
        System.out.println(array[0] + " " + array[1]);
    }





    public static void printArray(int[] arr) {
        for (int x:arr) {
            System.out.print(x + " ");
        }
    }
    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 4};
        printArray(array);
    }

    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(array[100]);
    }



    public static void main1(String[] args) {
        int[] array = {1, 2, 3, 4};
        int len = array.length;
        System.out.println(len);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        System.out.println("===========");
        for (int val:array){
            System.out.print(val + " ");
        }

    }
}


    /*public static void main2(String[] args) {
        //int[] array = {1,2,3,4};
        int[] array2 = new int[] {11,22,33,44};
        int[] array3 = new int[4];// 0


  }
*/


    //汉诺塔
    /*public static void move(char pos1,char pos2) {
        System.out.print(pos1 + "->" + pos2 + " ");
    }

    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }
    public static void main1(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');

    }
}
*/