package oop.Demo06;

public class Application {
    public static void main(String[] args) {
        //多态是方法的多态，
        // 有联系的子父类才可以强转，否则会类型转换异常！ClassCastException；
        // 存在条件：继承关系，方法需要重写，父类引用指向子类对象

        //以下几个都没法实现多态
            //static方法，属于类，不属于实例
            //final 修饰的方法，类；（因为无法被继承或者重写，就是最终的了）            方法内定义 final 局部常量 → 方法可正常重写
                    //如果 final 只是修饰方法内部的变量（局部常量），这个方法本身依然可以被子类重写，
                    // 因为 final 只限制了这个局部变量不能被重新赋值，对方法的「可重写性」没有任何影响。
            // private方法


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
        //s1.eat();//报错，因为Stdent中的eat非静态方法不是重写父类的，左边的类型是父类，父类没有这个方法，不满足多态，强转回Student类型可以
        ((Student)s1).eat();//强转，有父子关系才能转换
        s2.eat();//可以正常运行，两边都是student类型
    }
}
