package oop.Demo05;
//静态方法和非静态方法的区别
//静态方法：方法的调用只和左边对象定义的对象类型有关
//非静态方法才能重写，所有静态方法都不能重写
public class Application {
    public static void main(String[] args) {
        //静态方法：方法的调用只和左边对象定义的对象类型有关
        A a = new A();
        B b = new B();
        //父类的引用指向了子类
        B c = new A();
        System.out.println("=====对象a调用test方法=======");
        a.test();
        System.out.println("=====对象b调用test方法=======");
        b.test();
        System.out.println("=====B c = new A();B类型的对象c调用test方法=======");
        c.test();
        System.out.println("=====静态方法可以直接通过类名调用，非静态方法必须先new出对象从对象来调用=======");
        A.test();

    }
}
