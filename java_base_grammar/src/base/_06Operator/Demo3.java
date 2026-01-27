package base._06Operator;

public class Demo3 {
    public static void main(String[] args) {
        //关系运算符 返回结果：布尔
        int a=1;
        int b=21;
        int c=5;
        int i=1;
        int d=0;
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a!=b);
        System.out.println(a>b?2:3);
        //自增自减
        System.out.println(i++);
        System.out.println(++i);
        System.out.println("=================自增在运算式中===================");
        d=i++;
        System.out.println(d);
        d=++i;
        System.out.println(d);
        System.out.println("===============================================");
        System.out.println("======================数学运算=========================");
        //很多运算可以
        double pow = Math.pow(2, 3);
        System.out.println(pow);


    }
}
