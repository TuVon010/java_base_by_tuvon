package base;

public class _02base_data_type {
    public static void main(String[] args) {
        //ctrl+alt+L自动调整格式
        String a = "hello10";//必须先定义初始化才能使用，如果不写=多少就没法在下面打印
        int num = 10;
        System.out.println(a);
        //八大基本数据类型
        //整数
        int num1 = 10;
        //byte num2 =200;byte字节小，范围小，最大只能127
        byte num2 = 127;
        short num3 = 30;
        long num4 = 30L;//long类型要在数字后面加个L
        //小数：浮点数
        float num5 = 50.1F;//要+F表示他是float类型
        double num6 = 3.1415926;
        //字符,字符是一个字
        char name = 'a';
        //char name ='tuvon';错误
        //字符串，String不是关键字，是类
        String namea = "tuvon";

        //布尔值
        boolean flag = true;
        //boolean flag =false;
    }
}
