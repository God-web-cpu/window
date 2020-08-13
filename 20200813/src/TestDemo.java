import java.util.Arrays;

/**
 * @program: 20200813
 * @description
 * @author: sun
 * @create: 2020-08-12 16:53
 **/
public class TestDemo {
    public static void main6(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i <array.length ; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }

    //规则的二维数组
    public static void main5(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }


    //规则的二维数组
    public static void main4(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        for (int[] tmp:array ) {
            for (int x:tmp) {
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }

    public static void main3(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
         System.out.println(Arrays.deepToString(array));
    }


    public static void main2(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        //for(int i = 0;i<2;i++){
          //  for(int j = 0;j<3;j++){
        for(int i = 0;i<array.length;i++){
          for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][] {{1,2,3},{4,5,6}};
        int[][] array3 = new int [2][3];
    }
}
