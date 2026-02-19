package array;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] a={2,56,2,4,9,7,5,3,1};
        sort(a);
        for(int num:a){
            System.out.println(num);
        }
        System.out.println(Arrays.toString(a));//注意这种打印数组的方法
    }
//冒泡排序
    public static int[] sort(int[] array){
        for (int i=0;i<array.length;i++){
            boolean flag =false;//优化，如果当前比较没交换位置说明已经排序成功
            for(int j=1;j< array.length-i;j++){
                if(array[j-1]>array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    flag=true;
                }
            }
            if(flag==false)
                break;
        }
        return array;
    }

}
