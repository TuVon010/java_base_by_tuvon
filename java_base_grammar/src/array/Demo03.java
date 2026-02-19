package array;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        //Arrays//先打出arrays可以使用快捷键导入包
        int[] num ={15,12,3,4,455,66};
        System.out.println(num);//不tostring打印出来就是地址，
        System.out.println(Arrays.toString(num));
        //排序算法，升序
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        //填充fill
        Arrays.fill(num,0);
        System.out.println(Arrays.toString(num));//全为0

    }
}
