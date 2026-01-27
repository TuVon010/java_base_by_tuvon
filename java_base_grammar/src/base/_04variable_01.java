package base;

public class _04variable_01 {

//属性：变量
    //实例变量，从属于对象；如果不初始化，就会赋予默认值
    //布尔值默认是false（false就是0）
    //除了基本类型，其余默认都是null
    String name;
    int age;
    //类变量 static
    static double salary=2500;

    //类里面的main方法，主程序方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化值
        int i=0;
        System.out.println(i);//必须先初始化才能使用
        //实例变量
        //变量类型        变量名字    值
        _04variable_01 demo = new _04variable_01();
        System.out.println(demo.age);//实例变量不初始化就会变成默认值,0
        System.out.println(demo.name);//实例变量不初始化就会变成默认值,null
        //类变量 static
        System.out.println(salary);

    }
    //其他方法
    public void add(){

    }
}
