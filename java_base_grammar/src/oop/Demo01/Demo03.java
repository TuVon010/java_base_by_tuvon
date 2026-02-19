package oop.Demo01;

//引用传递：对象，本质还是值传递
public class Demo03 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        person.name="manba";
        System.out.println(person.name);//manba
//        你是在同一个类 Demo05 的 main 方法里调用 change 方法。
//        Java 允许在同一个类中，直接调用本类的静态方法，而省略类名。编译器会自动补全。
//        3. 什么时候必须写？
//        如果在另一个类里调用 Demo05 的静态方法，就必须写类名：
        //Demo03.change(person.name);错误，看方法形参是对象
        // 传入 Person 对象，而不是 String
        System.out.println(person.name);//laoda
    }
    public static void change(Person p){
        p.name="laoda";
    }
}

//定义了一个person类，有一个属性：name
class Person{
    String name;//默认值为null

}
/*
Java 只有值传递：不管传基本类型还是引用类型，永远传 “副本”—— 基本类型是数值副本，引用类型是地址副本，方法里永远改不了原变量本身（只能改地址指向的对象内容）；
C++ 引用传递（&）是真引用：传递的是变量别名，方法里改参数就是改原变量，不管是基本类型还是对象，都能直接改；
C/C++ 指针（*）接近 Java 引用：都是传地址副本，但 C/C++ 可通过二级指针突破 “改不了原地址” 的限制，Java 不行。
简单记：Java 的 “引用” 是 “假引用”（地址副本），C++ 的 & 引用是 “真引用”（变量本身）。
 */
