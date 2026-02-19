package oop.Demo04;

public class application {
    public static void main(String[] args) {
        Student student = new Student();
       //student.name="xiaoming";这个在Student类里面是私有变量不能在其他地方访问改变
        //System.out.println(student.name);
        String name=student.getName();
        System.out.println(name);
        student.setName("junan");
        System.out.println(student.getName());
        System.out.println("=======================================");
        student.setAge(999);//这个年龄明显不合法,可以在set里面添加安全性检查语句
        System.out.println(student.getAge());
        student.setAge(29);
        System.out.println(student.getAge());

    }
}
