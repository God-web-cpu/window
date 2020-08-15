import java.util.Arrays;

/**
 * @program: 20200814
 * @description
 * @author: sun
 * @create: 2020-08-14 11:32
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    private boolean isFull(){
        if(this.usedSize == this.elem.length){
            return true;
        }
        return false;
    }

    private void checkPos(int pos){
        if(pos<0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    //在pos位置新增元素
    public void add(int pos,int data){
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        checkPos(pos);
        /*if(pos<0 || pos > this.usedSize){
            return;
        }*/
        for (int i = this.usedSize - 1; i >= pos ; i--) {
            this.elem [i+1] = this.elem [i];
        }
        this.elem[pos] = data;
        this.usedSize ++;
    }
    //打印顺序表
    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
            //System.out.println(Arrays.toString(this.elem));
        }
        System.out.println();
    }
    //判断是否包含哪个元素
    public boolean contains(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem [i] == toFind ){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }
    private boolean isEmpty(){
        return this.usedSize == 0;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(isEmpty()){
            //return -1;
            throw new RuntimeException("顺序表为空！");//手动抛出异常
        }
        if (pos<0 || pos >= this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //删除第一次出现的关键字toRemove
    public void remove(int toRemove){
        int index = search(toRemove);
        if(index == -1){
            System.out.println("没有需要删除的数字！");
            return;
        }
        for (int i = index; i <this.usedSize - 1 ; i++) {
            this.elem[i] =this.elem[i+1];
        }
        this.usedSize--;
    }
    //清空顺序表
    public void clear(){
        this.usedSize = 0;
    }


    public void setPos(int pos,int value ){
        if (pos<0 || pos >= this.usedSize){
            throw new RuntimeException("pos位置不合法!");
        }
        this.elem[pos] = value;
    }
}
