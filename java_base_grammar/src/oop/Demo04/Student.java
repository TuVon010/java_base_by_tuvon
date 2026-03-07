package oop.Demo04;
//学生 is 人类   派生类  子类
//子类继承父类的全部公共方法
public class Student extends Person{

    private String name="zhao";
    public  Student(){
        //隐藏代码：默认调用了父类的无参构造
        //super()
        //调用父类的构造器必须放在第一行
        this("tuvon");
        System.out.println("Student无参执行了");
        //super()如果放在这里就会报错,构造器只能放在代码第一行
        //不写就会默认调用无参构造器
    }

    public Student(String name) {
        this.name = name;
    }
//    核心结论：写了有参构造 → 编译器不再自动生成无参构造；没写任何构造 → 自动生成无参构造。
//    开发建议：只要写了有参构造，就手动补上无参构造，避免框架 / 反射调用时报错。
//    关键逻辑：构造方法的生成规则是 “编译器只帮你补一次无参构造，一旦手动写了任何构造，就停止补”。

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}
//public class Student{
//    Person person;//组合，就是这个Student类里面包含了这个Person类，和继承有区别的
//}
//ctrl+H展开类
