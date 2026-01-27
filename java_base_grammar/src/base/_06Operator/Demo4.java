package base._06Operator;

public class Demo4 {
    public static void main(String[] args) {
        //逻辑运算符 与或非
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b"+(a&&b));//注意这里加号以及括号都是必要的
        System.out.println(a||b);
        System.out.println(!b);
        System.out.println("=========================短路运算=============================");
        //短路运算
        int c =5;
        boolean d= (c<4)&&(c++<4);//c<4为假就不执行后面的了，与运算，要真全真，一假全假
        System.out.println(d);
        System.out.println(c);


    }
}
