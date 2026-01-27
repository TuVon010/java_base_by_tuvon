package base._06Operator;

public class Demo2 {
    public static void main(String[] args) {
        long a=12345678L;//long类型后面L
        int b=123;
        short c=66;
        byte d=18;

        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
        //System.out.println((String)(c+d));//int
        //整数类型相加后的值最低的类型就是int，可以试试能否强制转化为String,会报错显示int不能转化为String
    }
}
