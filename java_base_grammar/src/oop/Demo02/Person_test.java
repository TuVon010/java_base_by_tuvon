package oop.Demo02;
//测试类
public class Person_test {
    public static void main(String[] args) {
        // ========== 场景1：使用无参构造器创建对象 ==========
        Person p1 = new Person(); // 调用无参构造器
        p1.showInfo(); // 输出：姓名：未知姓名，年龄：18

        // ========== 场景2：使用有参构造器创建对象 ==========
        Person p2 = new Person("张三", 25); // 调用有参构造器
        p2.showInfo(); // 输出：姓名：张三，年龄：25

        // ========== 场景3：验证“默认构造器”的规则 ==========
        // 如果我们删掉Person类中的无参构造器，只保留有参构造器，下面这行代码会报错！
        // 原因：自定义有参构造器后，Java不再自动提供默认无参构造器
        // Person p3 = new Person(); // 编译报错
    }
}
