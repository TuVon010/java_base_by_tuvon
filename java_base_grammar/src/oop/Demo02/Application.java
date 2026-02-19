package oop.Demo02;
//一个项目里只用一个main函数
public class Application {
    public static void main(String[] args) {
    //类。抽象的，实例
    //类实例化会产生一个对象
        Student xiaoming = new Student();
        Student xiaohong = new Student();
        System.out.println(xiaoming.name);
        xiaoming.name="小明";
        System.out.println(xiaoming.name);

    }
}
