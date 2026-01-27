package base._06Operator;

public class Demo1 {
    public static void main(String[] args) {
            //ctrl+D复制当前行
        //二元运算符
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//输出0，因为都是int类型
        System.out.println(a/(float)b);//输出0.5,强制转换
    }
}
