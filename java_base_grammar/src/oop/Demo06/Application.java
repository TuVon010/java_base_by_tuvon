package oop.Demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Person()
        //new Student();
        //可以指向的引用的类型就不确定了：父类的引用指向子类
        Person p1 = new Person();
        Person s1 = new Student();
        Student s2 = new Student();
        //对象能执行什么方法主要看左边的类型
        p1.run();
        s1.run();
        s2.run();
        //s1.eat();//报错，因为Stdent中的eat非静态方法不是重写父类的，左边的类型是父类，父类没有这个方法，不满足多态
        s2.eat();//可以正常运行，两边都是student类型
    }
}
