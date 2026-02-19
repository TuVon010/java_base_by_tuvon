package oop.Demo02;

public class Person {
    // 成员变量
    String name; // 姓名，默认初始化值为null
    int age;     // 年龄，默认初始化值为0
    //构造器没有返回值类型，也不能写 void,new的时候自动调用构造器
    //如果没有显式定义构造器，Java 会自动提供一个无参构造器
    // 1. 无参构造器（手动显式定义）
    // 作用：创建对象时，如果没有传参数，就执行这个构造器完成初始化
    public Person() {
        // 可以在无参构造器中设置默认值
        this.name = "未知姓名";
        this.age = 18;
        System.out.println("无参构造器被调用了！");
    }
    // 2. 有参构造器（自定义参数）
    // 作用：创建对象时，接收外部传入的参数，给成员变量赋值
    public Person(String name, int age) {
        // this关键字：代表当前对象的引用，区分成员变量和局部变量
        this.name = name;
        this.age = age;
        System.out.println("有参构造器被调用了！");

    }

    // 自定义方法：打印对象信息
    public void showInfo() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age);
    }

}

